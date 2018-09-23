/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.util.dao.http.factory;

import br.net.gvt.efika.util.dao.http.HttpDAO;
import br.net.gvt.efika.util.dao.http.HttpDAOGenericImpl;
import br.net.gvt.efika.util.dao.http.HttpDAOGenericNonProxyImpl;
import java.nio.charset.Charset;

/**
 *
 * @author G0042204
 * @param <T>
 */
public class FactoryHttpDAOAbstract<T> {

    final Class<T> typeParameterClass;

    public FactoryHttpDAOAbstract(Class<T> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
    }

    public HttpDAO<T> createWithProxy() {
        return new HttpDAOGenericImpl<T>(this.typeParameterClass) {
            @Override
            public Charset getResponseCharset() {
                return Charset.forName("UTF-8");
            }
        };
    }

    public HttpDAO<T> createWithoutProxy() {
        return new HttpDAOGenericNonProxyImpl<T>(this.typeParameterClass) {
            @Override
            public Charset getResponseCharset() {
                return Charset.forName("UTF-8");
            }
        };
    }

}
