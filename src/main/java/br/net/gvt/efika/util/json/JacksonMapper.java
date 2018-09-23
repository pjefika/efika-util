/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.util.json;

import br.net.gvt.efika.util.json.exception.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author G0042204
 * @param <T>
 */
public class JacksonMapper<T> {

    private Class<T> typeParameterClass;

    private TypeReference<T> type;

    private ObjectMapper objectMapper = new ObjectMapper().configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);

    public JacksonMapper(Class<T> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
    }

    public JacksonMapper(TypeReference<T> type) {
        this.type = type;
    }

    public T deserialize(String string) throws JsonParseException {
        try {
            return objectMapper.readValue(string, typeParameterClass);
        } catch (Exception ex) {
            Gson gson = new Gson();
            Logger.getLogger(JacksonMapper.class.getName()).log(Level.SEVERE, null, ex);
            throw new JsonParseException(gson.toJson(string));
        }
    }

    public String serialize(T obj) throws Exception {
        return objectMapper.writeValueAsString(obj);
    }

    public <T> T fromJSON(String jsonPacket) throws JsonParseException {
        T data = null;

        try {
            data = objectMapper.readValue(jsonPacket, type);
        } catch (Exception e) {
            Logger.getLogger(JacksonMapper.class.getName()).log(Level.SEVERE, null, e);
            throw new JsonParseException(e.getMessage());
        }
        return data;
    }

}
