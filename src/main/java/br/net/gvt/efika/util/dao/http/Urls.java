/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and 10.40.168.198open the template in the editor.
 */
package br.net.gvt.efika.util.dao.http;

/**
 *
 * @author G0041775
 *  *
 * 10.40.196.172
 * 10.40.198.168
 */
public enum Urls {

//    QUEUE_COMPLETE_TASK("http://54.94.208.183:8080/queueAPI/queue/completeTask"),
//    QUEUE("http://54.94.208.183:8080/queueAPI/queue/"),
//    QUEUE_CONSUME_TASKS("http://54.94.208.183:8080/queueAPI/queue/consumePendingTasks"),
    QUEUE_COMPLETE_TASK("http://10.40.196.172:8089/queueAPI/queue/completeTask"),
    QUEUE("http://10.40.196.172:8089/queueAPI/queue/"),
    QUEUE_CONSUME_TASKS("http://10.40.196.172:8089/queueAPI/queue/consumePendingTasks"),
    SERVICE_INVENTORY("http://10.40.196.172:7180/stealerAPI/serviceInventory/"),
    NETWORK_INVENTORY("http://10.40.196.172:7180/stealerAPI/networkInventory/"),
    CADASTRO_STEALER("http://10.40.196.172:7180/stealerAPI/oss/"),
    STEALER_MANOBRA_ASSERTS("http://10.40.196.172:7180/stealerAPI/manobra/asserts"),
    LIST_STB_STEALER("http://10.40.196.172:7180/stealerAPI/confOnline/listStbs"),
    DIAGNOSTICO_HPNA_STEALER("http://10.40.196.172:7180/stealerAPI/confOnline/diagnosticoHpna"),
    ASSIA_CLEARVIEW_STEALER("http://10.40.196.172:7180/stealerAPI/assia/clearViewRealTime"),
    CADASTRO_NETWORK("http://10.40.196.172:7174/networkInventoryAPI/networkInventory/"),
    FULLTEST("http://10.40.196.172:7172/fulltestAPI/fulltest/co"),
    FULLTEST_MANOBRA("http://10.40.196.172:7172/fulltestAPI/fulltest/manobra"),
    FULLTEST_MANOBRA_ASSERTS("http://10.40.196.172:7172/fulltestAPI/manobra/asserts"),
    FULLTEST_ANALITICO("http://10.40.196.172:7172/fulltestAPI/manobra/analitico"),
    FULLTEST_BY_ID("http://10.40.196.172:7172/fulltestAPI/fulltest/findById/"),
    CONF_REDE("http://10.40.196.172:7172/fulltestAPI/configPorta/getConfiabilidadeRede"),
    ONTS_DISP("http://10.40.196.172:7172/fulltestAPI/configPorta/unsetOntFromOlt"),
    SET_ONT("http://10.40.196.172:7172/fulltestAPI/configPorta/setOntToOlt"),
    GET_ONT("http://10.40.196.172:7172/fulltestAPI/configPorta/getOntFromOlt"),
    IS_MANAGEABLE("http://10.40.196.172:7172/fulltestAPI/configPorta/isManageable"),
    CORRETOR_ESTADO_PORTA("http://10.40.196.172:7172/fulltestAPI/configPorta/corretorEstadoDaPorta"),
    CORRETOR_VLAN_BANDA("http://10.40.196.172:7172/fulltestAPI/configPorta/corretorVlanBanda"),
    CORRETOR_PROFILE("http://10.40.196.172:7172/fulltestAPI/configPorta/corretorProfile"),
    CORRETOR_VLANS_VIDEO("http://10.40.196.172:7172/fulltestAPI/configPorta/corretorVlansVideo"),
    CORRETOR_VLAN_VOIP("http://10.40.196.172:7172/fulltestAPI/configPorta/corretorVlanVoIP"),
    VALIDADOR_PARAMETROS("http://10.40.196.172:7172/fulltestAPI/configPorta/validadorParametros"),
    CUSTOMERAPI_CADASTRO("http://10.40.196.172:7179/customerAPI/customer/findByParameter"),
    CUSTOMERAPI_HPNA("http://10.40.196.172:7179/customerAPI/customer/findByParameterTv"),
    CUSTOMERAPI_CERTIFICATION("http://10.40.196.172:7179/customerAPI/certification/execByParam"),
    CUSTOMERAPI_CONF_REDE("http://10.40.196.172:7179/customerAPI/certification/confRede"),
    CUSTOMERAPI_ONTS_DISP("http://10.40.196.172:7179/customerAPI/certification/ontsDisp"),
    CUSTOMERAPI_SET_ONT("http://10.40.196.172:7179/customerAPI/certification/setOntToOlt"),
    AUTH("http://10.40.196.172:7176/authAPI/credencial/verificar"),
    NETWORK_INVENTORY_SIGRES_DSLAM_DETAIL("http://10.40.196.172:7174/networkInventoryAPI/networkInventorySigres/dslamDetail"),
    NETWORK_INVENTORY_SIGRES_OLT_DETAIL("http://10.40.196.172:7174/networkInventoryAPI/networkInventorySigres/oltDetail"),
    NETWORK_INVENTORY_VIZINHOS("http://10.40.196.172:7174/networkInventoryAPI/networkInventoryGpon/vizinhos"),
    ACSAPI_GET_DETAIL("http://10.40.196.172:7177/acsAPI/device/detail"),
    ACSAPI_GET_WIFI("http://10.40.196.172:7177/acsAPI/device/getWifiInfo"),
    ACSAPI_ACTIVATE_WIFI("http://10.40.196.172:7177/acsAPI/device/activateWifi"),
    ACSAPI_SET_WIFI("http://10.40.196.172:7177/acsAPI/device/setWifiInfo"),
    ACSAPI_GET_LAN_HOSTS("http://10.40.196.172:7177/acsAPI/device/getLanHosts"),
    ACSAPI_GET_WAN("http://10.40.196.172:7177/acsAPI/device/getWanInfo"),
    ACSAPI_GET_INTERFACE_STATISTICS("http://10.40.196.172:7177/acsAPI/device/getInterfaceStatistics"),
    ACSAPI_GET_XDSL_STATISTICS("http://10.40.196.172:7177/acsAPI/device/getXdslDiagnostic"),
    ACSAPI_GET_PPPOE_CRED("http://10.40.196.172:7177/acsAPI/device/getPPPoECredentials"),
    ACSAPI_SET_PPPOE_CRED("http://10.40.196.172:7177/acsAPI/device/setPPPoECredentials"),
    ACSAPI_GET_PORT_MAPPING("http://10.40.196.172:7177/acsAPI/device/getPortMapping"),
    ACSAPI_REBOOT("http://10.40.196.172:7177/acsAPI/device/reboot"),
    ACSAPI_FACTORY_RESET("http://10.40.196.172:7177/acsAPI/device/factoryReset"),
    ACSAPI_PING("http://10.40.196.172:7177/acsAPI/device/pingDiagnostic"),
    ACSAPI_GET_DHCP("http://10.40.196.172:7177/acsAPI/device/getDhcp"),
    ACSAPI_SET_DHCP("http://10.40.196.172:7177/acsAPI/device/setDhcp"),
    ACSAPI_GET_DDNS("http://10.40.196.172:7177/acsAPI/device/getDdns"),
    ACSAPI_GET_SERVICE_CLASS("http://10.40.196.172:7177/acsAPI/device/getServiceClass"),
    ACSAPI_SET_SERVICE_CLASS("http://10.40.196.172:7177/acsAPI/device/setServiceClass"),
    ACSAPI_GET_SIP("http://10.40.196.172:7177/acsAPI/device/getSipDiagnostics"),
    ACSAPI_SET_SIP("http://10.40.196.172:7177/acsAPI/device/setSipActivation"),
    ACSAPI_SEARCH("http://10.40.196.172:7177/acsAPI/search/search"),
    ACSAPI_ONLINE("http://10.40.196.172:7177/acsAPI/device/forceOnlineDevice"),
    ACSAPI_ANY_ONLINE("http://10.40.196.172:7177/acsAPI/device/forceOnlineDevices"),
    ACSAPI_GET_DNS("http://10.40.196.172:7177/acsAPI/device/getDns"),
    ACSAPI_SET_DNS("http://10.40.196.172:7177/acsAPI/device/setDns"),
    ACSAPI_FIRMWARE_UPDATE("http://10.40.196.172:7177/acsAPI/device/firmwareUpdate"),
    ACSAPI_GET_PHONE_NUMBER("http://10.40.196.172:7177/acsAPI/device/getPhoneNumber"),
    ACSAPI_GET_T38("http://10.40.196.172:7177/acsAPI/device/getT38Enabled"),
    ACSAPI_SET_T38("http://10.40.196.172:7177/acsAPI/device/setT38Enabled"),
    ACSAPI_GET_IPTV_DIAGNOSTICS("http://10.40.196.172:7177/acsAPI/device/getIptvDiagnostics");

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
