package com.longmingxin.talent.talents.bean;

/**
 * Created by ASUS on 2018/10/8.
 */

public class Login_Data {


    /**
     * success : true
     * data : {"token":"3"}
     * message : 登录成功
     */

    private boolean success;
    private DataBean data;
    private String message;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class DataBean {
        /**
         * token : 3
         */

        private String token;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }
}
