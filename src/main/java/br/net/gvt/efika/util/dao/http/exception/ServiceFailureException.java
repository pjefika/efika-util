/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.util.dao.http.exception;

/**
 *
 * @author G0042204
 */
public class ServiceFailureException extends Exception {

    public ServiceFailureException() {
        super("Falha ao acionar Serviço!");
    }

}
