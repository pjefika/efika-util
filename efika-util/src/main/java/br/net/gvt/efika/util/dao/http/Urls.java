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

    QUEUE_COMPLETE_TASK("http://54.94.208.183:8080/queueAPI/queue/completeTask"),
    QUEUE("http://54.94.208.183:8080/queueAPI/queue/"),
    QUEUE_CONSUME_TASKS("http://54.94.208.183:8080/queueAPI/queue/consumePendingTasks"),
    SERVICE_INVENTORY("http://localhost:7173/stealerAPI/serviceInventory/"),
    NETWORK_INVENTORY("http://localhost:7173/stealerAPI/networkInventory/"),
    CADASTRO_STEALER("http://localhost:7173/stealerAPI/oss/"),
    CADASTRO_NETWORK("http://localhost:7174/networkInventoryAPI/networkInventory/"),
    FULLTEST("http://localhost:7172/fulltestAPI/fulltest/co"),
    CONF_REDE("http://localhost:7172/fulltestAPI/configPorta/getConfiabilidadeRede"),
    ONTS_DISP("http://localhost:7172/fulltestAPI/configPorta/unsetOntFromOlt"),
    SET_ONT("http://localhost:7172/fulltestAPI/configPorta/setOntToOlt"),
    GET_ONT("http://localhost:7172/fulltestAPI/configPorta/getOntFromOlt"),
    IS_MANAGEABLE("http://localhost:7172/fulltestAPI/configPorta/isManageable"),
    CORRETOR_ESTADO_PORTA("http://localhost:7172/fulltestAPI/configPorta/corretorEstadoDaPorta"),
    CORRETOR_VLAN_BANDA("http://localhost:7172/fulltestAPI/configPorta/corretorVlanBanda"),
    CORRETOR_PROFILE("http://localhost:7172/fulltestAPI/configPorta/corretorProfile"),
    CORRETOR_VLANS_VIDEO("http://localhost:7172/fulltestAPI/configPorta/corretorVlansVideo"),
    CORRETOR_VLAN_VOIP("http://localhost:7172/fulltestAPI/configPorta/corretorVlanVoIP"),
    VALIDADOR_PARAMETROS("http://localhost:7172/fulltestAPI/configPorta/validadorParametros"),
    CUSTOMERAPI_CADASTRO("http://localhost:7171/customerAPI/customer/findByParameter"),
    CUSTOMERAPI_CERTIFICATION("http://localhost:7171/customerAPI/certification/execByParam"),
    CUSTOMERAPI_CONF_REDE("http://localhost:7171/customerAPI/certification/confRede"),
    CUSTOMERAPI_ONTS_DISP("http://localhost:7171/customerAPI/certification/ontsDisp"),
    CUSTOMERAPI_SET_ONT("http://localhost:7171/customerAPI/certification/setOntToOlt"),
    AUTH("http://localhost:7176/authAPI/credencial/verificar"),
    NETWORK_INVENTORY_SIGRES_DSLAM_DETAIL("http://localhost:7174/networkInventoryAPI/networkInventorySigres/dslamDetail"),
    NETWORK_INVENTORY_SIGRES_OLT_DETAIL("http://localhost:7174/networkInventoryAPI/networkInventorySigres/oltDetail"),
    NETWORK_INVENTORY_VIZINHOS("http://localhost:7174/networkInventoryAPI/networkInventoryGpon/vizinhos"),
    ACSAPI_GET_DETAIL("http://localhost:7177/acsAPI/device/detail"),
    ACSAPI_GET_WIFI("http://localhost:7177/acsAPI/device/getWifiInfo"),
    ACSAPI_ACTIVATE_WIFI("http://localhost:7177/acsAPI/device/activateWifi"),
    ACSAPI_SET_WIFI("http://localhost:7177/acsAPI/device/setWifiInfo"),
    ACSAPI_GET_LAN_HOSTS("http://localhost:7177/acsAPI/device/getLanHosts"),
    ACSAPI_GET_WAN("http://localhost:7177/acsAPI/device/getWanInfo"),
    ACSAPI_GET_INTERFACE_STATISTICS("http://localhost:7177/acsAPI/device/getInterfaceStatistics"),
    ACSAPI_GET_XDSL_STATISTICS("http://localhost:7177/acsAPI/device/getXdslDiagnostic"),
    ACSAPI_GET_PPPOE_CRED("http://localhost:7177/acsAPI/device/getPPPoECredentials"),
    ACSAPI_SET_PPPOE_CRED("http://localhost:7177/acsAPI/device/setPPPoECredentials"),
    ACSAPI_GET_PORT_MAPPING("http://localhost:7177/acsAPI/device/getPortMapping"),
    ACSAPI_REBOOT("http://localhost:7177/acsAPI/device/reboot"),
    ACSAPI_FACTORY_RESET("http://localhost:7177/acsAPI/device/factoryReset"),
    ACSAPI_PING("http://localhost:7177/acsAPI/device/pingDiagnostic"),
    ACSAPI_GET_DHCP("http://localhost:7177/acsAPI/device/getDhcp"),
    ACSAPI_SET_DHCP("http://localhost:7177/acsAPI/device/setDhcp"),
    ACSAPI_GET_DDNS("http://localhost:7177/acsAPI/device/getDdns"),
    ACSAPI_GET_SERVICE_CLASS("http://localhost:7177/acsAPI/device/getServiceClass"),
    ACSAPI_SET_SERVICE_CLASS("http://localhost:7177/acsAPI/device/setServiceClass"),
    ACSAPI_GET_SIP("http://localhost:7177/acsAPI/device/getSipDiagnostics"),
    ACSAPI_SET_SIP("http://localhost:7177/acsAPI/device/setSipActivation"),
    ACSAPI_SEARCH("http://localhost:7177/acsAPI/search/search"),
    ACSAPI_ONLINE("http://localhost:7177/acsAPI/device/forceOnlineDevice"),
    ACSAPI_ANY_ONLINE("http://localhost:7177/acsAPI/device/forceOnlineDevices"),
    ACSAPI_GET_DNS("http://localhost:7177/acsAPI/device/getDns"),
    ACSAPI_SET_DNS("http://localhost:7177/acsAPI/device/setDns"),
    ACSAPI_FIRMWARE_UPDATE("http://localhost:7177/acsAPI/device/firmwareUpdate"),
    ACSAPI_GET_PHONE_NUMBER("http://localhost:7177/acsAPI/device/getPhoneNumber"),
    ACSAPI_GET_T38("http://localhost:7177/acsAPI/device/getT38Enabled"),
    ACSAPI_SET_T38("http://localhost:7177/acsAPI/device/setT38Enabled"),
    ACSAPI_GET_IPTV_DIAGNOSTICS("http://localhost:7177/acsAPI/device/getIptvDiagnostics");


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
