/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.util.bundle;

import java.util.ResourceBundle;

/**
 *
 * @author G0042204
 */
public class EfikaResourceBundle {

    public EfikaResourceBundle() {
    }

    public static String getString(String bundle, String label) throws Exception {
        ResourceBundle labels = ResourceBundle.getBundle(bundle);
        return labels.getString(label);
    }
}
