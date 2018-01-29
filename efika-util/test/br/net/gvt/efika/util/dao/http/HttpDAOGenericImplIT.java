/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.util.dao.http;

import java.nio.charset.Charset;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G0042204
 */
public class HttpDAOGenericImplIT {

    public HttpDAOGenericImplIT() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

//    /**
//     * Test of get method, of class HttpDAOGenericImpl.
//     */
//    @Test
//    public void testGet() throws Exception {
//        System.out.println("get");
//        String url = "";
//        String contentType = "";
//        Charset responseCharset = null;
//        HttpDAOGenericImpl instance = null;
//        Object expResult = null;
//        Object result = instance.get(url, contentType, responseCharset);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of post method, of class HttpDAOGenericImpl.
     */
    @Test
    public void testPost() throws Exception {
        try {
            System.out.println("post");
            String url = "http://10.40.195.81:8080/efikaAuth2/credencial/verificar";
            VerificarCredencialRequest obj = new VerificarCredencialRequest();
            obj.setLogin("######");
            obj.setSenha("######");

            HttpDAOGenericImpl<Boolean> instance = new HttpDAOGenericImpl(Boolean.class) {
            };

            Boolean expResult = false;
            Boolean result = instance.post(url, obj);
            assertEquals(expResult, result);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}
