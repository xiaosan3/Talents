package com.longmingxin.talent.talents.bean;

/**
 * Created by ASUS on 2018/9/27.
 */

public class MessageBean {

    /**
     * success : true
     * data : null
     * message : 发送成功
     */

    private boolean success;
    private Object data;
    private String message;

    public MessageBean() {
    }

    public MessageBean(boolean success, Object data, String message) {
        this.success = success;
        this.data = data;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MessageBean{" +
                "success=" + success +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}
