package com.longmingxin.talent.talents.bean;

/**
 * Created by ASUS on 2018/9/27.
 */

public class CodeBean {

    /**
     * success : true
     * data : null
     * message : 发送成功
     */

    private boolean success;
    private String data;
    private String message;

    public CodeBean() {
    }

    public CodeBean(String data, String message, boolean success) {
        this.data = data;
        this.message = message;
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
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
        return "CodeBean{" +
                "success=" + success +
                ", data='" + data + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
