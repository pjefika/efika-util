/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.util.dao.http;

/**
 *
 * @author G0041775
 */
public interface HttpDAO<T> {

    public T get(String url) throws Exception;

    public T post(String url, Object obj) throws Exception;

}
