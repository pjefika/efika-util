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
public enum Urls {

    /**
     * PROD
     */
//    CADASTRO_STEALER("http://10.40.196.182:8080/stealerAPI/oss/"),
//    CADASTRO_NETWORK("http://10.200.35.67:80/networkInventoryAPI/networkInventory/"),
//    FULLTEST("http://10.200.35.67:80/fulltestAPI/fulltest/co"),
//    CONF_REDE("http://10.200.35.67:80/fulltestAPI/configPorta/getConfiabilidadeRede"),
//    ONTS_DISP("http://10.200.35.67:80/fulltestAPI/configPorta/unsetOntFromOlt"),
//    SET_ONT("http://10.200.35.67:80/fulltestAPI/configPorta/setOntToOlt"),
//    QUEUE_COMPLETE_TASK("http://ec2-54-233-253-253.sa-east-1.compute.amazonaws.com:8080/queueAPI/queue/completeTask"),
//    QUEUE("http://ec2-54-233-253-253.sa-east-1.compute.amazonaws.com:8080/queueAPI/queue/");
    /**
     * QA
     */
    SERVICE_INVENTORY("http://10.40.196.182:7173/stealerAPI/serviceInventory/"),
    NETWORK_INVENTORY("http://10.40.196.182:7173/stealerAPI/networkInventory/"),
    CADASTRO_STEALER("http://10.40.196.182:7173/stealerAPI/oss/"),
    CADASTRO_NETWORK("http://10.40.195.81:8080/networkInventoryAPI/networkInventory/"),
    FULLTEST("http://10.40.196.182:7172/fulltestAPI/fulltest/co"),
    CONF_REDE("http://10.40.196.182:7172/fulltestAPI/configPorta/getConfiabilidadeRede"),
    ONTS_DISP("http://10.40.196.182:7172/fulltestAPI/configPorta/unsetOntFromOlt"),
    SET_ONT("http://10.40.196.182:7172/fulltestAPI/configPorta/setOntToOlt"),
    CUSTOMERAPI_CADASTRO("http://10.40.196.182:7171/customerAPI/customer/findByParameter"),
    CUSTOMERAPI_CERTIFICATION("http://10.40.196.182:7171/customerAPI/certification/execByParam"),
    CUSTOMERAPI_CONF_REDE("http://10.40.196.182:7171/customerAPI/certification/confRede"),
    CUSTOMERAPI_ONTS_DISP("http://10.40.196.182:7171/customerAPI/certification/ontsDisp"),
    CUSTOMERAPI_SET_ONT("http://10.40.196.182:7171/customerAPI/certification/setOntToOlt"),
    QUEUE_COMPLETE_TASK("http://10.40.196.182:7175/queueAPI/queue/completeTask"),
    QUEUE("http://10.40.196.182:7175/queueAPI/queue/"),
    QUEUE_CONSUME_TASKS("http://10.40.196.182:7175/queueAPI/queue/consumePendingTasks"),
    AUTH("http://10.40.198.168:8080/efikaAuth2/credencial/verificar");

    private final String valor;

    private Urls(String url) {
        valor = url;
    }

    public String getUrl() {
        return valor;
    }

    public String getValor() {
        return valor;
    }

    public static Urls find(String url) {
        return Urls.valueOf(url);
    }

}
