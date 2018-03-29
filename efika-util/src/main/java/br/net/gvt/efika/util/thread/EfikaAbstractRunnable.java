/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.util.thread;

/**
 *
 * @author G0042204
 */
public abstract class EfikaAbstractRunnable extends Thread implements Runnable {

    private Throwable ex;

    public EfikaAbstractRunnable() {
    }

    private void init() {
        this.setUncaughtExceptionHandler((Thread t, Throwable e) -> {
            setEx(e);
        });
    }

    public abstract void processar() throws Exception;

    @Override
    public synchronized void start() {
        try {
            init();
            processar();
            super.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void possuiException() throws Exception {
        if (ex != null) {
            throw new Exception(ex.getCause());
        }
    }

    public void setEx(Throwable ex) {
        this.ex = ex;
    }

}
