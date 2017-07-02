package com.akkademy.messages;

/**
 * Created by Administrator on 2017/7/2.
 */
public class SetRequest {

    private final String key;
    private final Object value;

    public SetRequest(String key,Object value){
        this.key=key;
        this.value=value;
    }

    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
}
