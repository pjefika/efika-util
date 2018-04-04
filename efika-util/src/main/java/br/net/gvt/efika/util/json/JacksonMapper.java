/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.util.json;

import br.net.gvt.efika.util.json.exception.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author G0042204
 * @param <T>
 */
public class JacksonMapper<T> {

    final Class<T> typeParameterClass;

    public JacksonMapper(Class<T> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
    }

    public T deserialize(String string) throws JsonParseException {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(string, typeParameterClass);
        } catch (IOException ex) {
            Logger.getLogger(JacksonMapper.class.getName()).log(Level.SEVERE, null, ex);
            throw new JsonParseException();
        }
    }

    public String serialize(T obj) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(obj);
    }

    public static <T> T fromJSON(final TypeReference<T> type,
            final String jsonPacket) throws JsonParseException {
        T data = null;

        try {
            data = new ObjectMapper().readValue(jsonPacket, type);
        } catch (Exception e) {
           Logger.getLogger(JacksonMapper.class.getName()).log(Level.SEVERE, null, e);
            throw new JsonParseException();
        }
        return data;
    }

}
