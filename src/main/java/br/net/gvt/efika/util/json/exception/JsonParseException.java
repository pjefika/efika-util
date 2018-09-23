/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.util.json.exception;

/**
 *
 * @author G0042204
 */
public class JsonParseException extends Exception {

    public JsonParseException() {
        super("JsonParse Exception!");
    }

    public JsonParseException(String message) {
        super(message);
    }
       

}
