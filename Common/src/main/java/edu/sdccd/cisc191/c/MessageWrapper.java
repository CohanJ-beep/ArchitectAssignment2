package edu.sdccd.cisc191.c;

import java.io.Serializable;

public class MessageWrapper implements Serializable {
    private String messageType;
    private Object data;

    public MessageWrapper(String messageType, Object data) {
        this.messageType = messageType;
        this.data = data;
    }

    public String getMessageType() {
        return messageType;
    }

    public Object getData() {
        return data;
    }
}
