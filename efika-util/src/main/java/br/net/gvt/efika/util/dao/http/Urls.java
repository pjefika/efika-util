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
  
    QUEUE_COMPLETE_TASK("http://10.40.196.171:8080/queueAPI/queue/completeTask"),
    QUEUE("http://10.40.196.171:8080/queueAPI/queue/"),
    QUEUE_CONSUME_TASKS("http://10.40.196.171:8080/queueAPI/queue/consumePendingTasks"),
    SERVICE_INVENTORY("http://10.40.196.171:7173/stealerAPI/serviceInventory/"),
    NETWORK_INVENTORY("http://10.40.196.171:7173/stealerAPI/networkInventory/"),
    CADASTRO_STEALER("http://10.40.196.171:7173/stealerAPI/oss/"),
    CADASTRO_NETWORK("http://10.40.196.171:7174/networkInventoryAPI/networkInventory/"),
    FULLTEST("http://10.40.196.171:7172/fulltestAPI/fulltest/co"),
    CONF_REDE("http://10.40.196.171:7172/fulltestAPI/configPorta/getConfiabilidadeRede"),
    ONTS_DISP("http://10.40.196.171:7172/fulltestAPI/configPorta/unsetOntFromOlt"),
    SET_ONT("http://10.40.196.171:7172/fulltestAPI/configPorta/setOntToOlt"),
    GET_ONT("http://10.40.196.171:7172/fulltestAPI/configPorta/getOntFromOlt"),
    IS_MANAGEABLE("http://10.40.196.171:7172/fulltestAPI/configPorta/isManageable"),
    CORRETOR_ESTADO_PORTA("http://10.40.196.171:7172/fulltestAPI/configPorta/corretorEstadoDaPorta"),
    CORRETOR_VLAN_BANDA("http://10.40.196.171:7172/fulltestAPI/configPorta/corretorVlanBanda"),
    CORRETOR_PROFILE("http://10.40.196.171:7172/fulltestAPI/configPorta/corretorProfile"),
    CORRETOR_VLANS_VIDEO("http://10.40.196.171:7172/fulltestAPI/configPorta/corretorVlansVideo"),
    CUSTOMERAPI_CADASTRO("http://10.40.196.171:7171/customerAPI/customer/findByParameter"),
    CUSTOMERAPI_CERTIFICATION("http://10.40.196.171:7171/customerAPI/certification/execByParam"),
    CUSTOMERAPI_CONF_REDE("http://10.40.196.171:7171/customerAPI/certification/confRede"),
    CUSTOMERAPI_ONTS_DISP("http://10.40.196.171:7171/customerAPI/certification/ontsDisp"),
    CUSTOMERAPI_SET_ONT("http://10.40.196.171:7171/customerAPI/certification/setOntToOlt"),
    AUTH("http://10.40.196.171:7176/authAPI/credencial/verificar"),
    NETWORK_INVENTORY_SIGRES_DSLAM_DETAIL("http://10.40.196.171:7174/networkInventoryAPI/networkInventorySigres/dslamDetail"),
    NETWORK_INVENTORY_SIGRES_OLT_DETAIL("http://10.40.196.171:7174/networkInventoryAPI/networkInventorySigres/oltDetail"),
    NETWORK_INVENTORY_VIZINHOS("http://10.40.196.171:7174/networkInventoryAPI/networkInventoryGpon/vizinhos");

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
