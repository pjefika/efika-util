/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.util.dao.http;

import br.net.gvt.efika.util.dao.http.exception.ServiceFailureException;
import br.net.gvt.efika.util.json.JacksonMapper;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.util.ResourceBundle;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

public abstract class HttpDAOGenericNonProxyImpl<T> implements HttpDAO<T> {

    final Class<T> typeParameterClass;
    private String contentType = ContentType.JSON.getValor();
    private Charset responseCharset = Charset.defaultCharset();
    private final ResourceBundle rb = ResourceBundle.getBundle("credentials");

    public HttpDAOGenericNonProxyImpl(Class<T> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
    }

    @Override
    public T get(String url) throws Exception {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpGet get = new HttpGet(url);
        get.addHeader("Content-Type", getContentType());
        CloseableHttpResponse response = httpClient.execute(get);

        InputStreamReader reader;
        if (getResponseCharset() != null) {
            reader = new InputStreamReader(response.getEntity().getContent(), getResponseCharset());
        } else {
            reader = new InputStreamReader(response.getEntity().getContent());
        }
        BufferedReader br = new BufferedReader(reader);
        String output;
        StringBuilder result = new StringBuilder();
        while ((output = br.readLine()) != null) {
            result.append(output);
        }
        httpClient.close();

        if (response.getStatusLine().getStatusCode() != 200) {
            try {
                JacksonMapper<Exception> exMapper = new JacksonMapper(Exception.class);
                throw exMapper.deserialize(result.toString());
            } catch (Exception e) {
                e.printStackTrace();
                throw new ServiceFailureException();
            }
        } else {
            JacksonMapper<T> mapper = new JacksonMapper(typeParameterClass);
            return mapper.deserialize(result.toString());
        }
    }

    @Override
    public T post(String url, Object obj) throws Exception {

        responseCharset = getResponseCharset() == null ? Charset.defaultCharset() : getResponseCharset();
        String maquina;
        try {
            InetAddress localMachine = InetAddress.getLocalHost();
            maquina = localMachine.getHostName();
        } catch (Exception e) {
            maquina = "CTARO8-1234";
        }

        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(url);
        post.addHeader("Content-Type", getContentType() + "; charset=UTF-8");

        String json = new JacksonMapper(Object.class).serialize(obj);
        System.out.println("URL -> " + url);
        System.out.println("POST -> " + json);
        post.setEntity(new StringEntity(json, Charset.forName("UTF-8")));

        CloseableHttpResponse response = httpClient.execute(post);
        InputStreamReader reader;
        if (responseCharset != null) {
            reader = new InputStreamReader(response.getEntity().getContent(), responseCharset);
        } else {
            reader = new InputStreamReader(response.getEntity().getContent());
        }
        BufferedReader br = new BufferedReader(reader);

        String output;
        StringBuffer result = new StringBuffer();
        while ((output = br.readLine()) != null) {
            System.out.println("OUTPUT -> " + output);
            result.append(output);
        }
        httpClient.close();

        if (response.getStatusLine().getStatusCode() != 200) {
            System.out.println("CODE -> " + response.getStatusLine().getStatusCode());
            JacksonMapper<Exception> exMapper = new JacksonMapper(Exception.class);
            throw exMapper.deserialize(result.toString());
        } else {
            System.out.println("result.toString(): " + result.toString());
            return new JacksonMapper<>(typeParameterClass).deserialize(result.toString());
        }
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Charset getResponseCharset() {
        return responseCharset;
    }

    public void setResponseCharset(Charset responseCharset) {
        this.responseCharset = responseCharset;
    }

}
