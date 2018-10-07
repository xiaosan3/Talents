package com.longmingxin.talent.talents.bean;

/**
 * Created by ASUS on 2018/9/29.
 */

public class ResetPassword {


    /**
     * success : true
     * data : {"token":"eyJhbGciOiJBMTI4S1ciLCJlbmMiOiJBMTI4Q0JDLUhTMjU2In0.fNcvz6TCXx7cBHz75pKIUSM2GCCLIkuIBo3B9PF2SabvO7sOzuIRRw.RFdldIc0b58G52p63aUfOw.3aFfG0_L50feQzAL6u0xGozuJY0VsAQ-ZbhEKIp9E8Sqb7YZwAhK6Y_lLTSPsD0Mxp5d-q2r-nYHssvFY8B7xVAJsydLENTb4GKE38ZFaXsUZn87TOd04oThshpTyYDo9cAkiy25tfUB6ztkKcZF-3zaFAlI2HOsaLg78HTFVNx2smdy3DnL9ujXVDqd4dzs0WjSCYqXWGxHtmrp3Xb0VyZaWeNe8FVsYtJILUnfSjL-xNl4vq2jHpy0AJs6sVWw.s1UW0wuBIoAnje4W3s4vtA"}
     * message : null
     */

    private boolean success;
    private DataBean data;
    private Object message;


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

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public static class DataBean {
        /**
         * token : eyJhbGciOiJBMTI4S1ciLCJlbmMiOiJBMTI4Q0JDLUhTMjU2In0.fNcvz6TCXx7cBHz75pKIUSM2GCCLIkuIBo3B9PF2SabvO7sOzuIRRw.RFdldIc0b58G52p63aUfOw.3aFfG0_L50feQzAL6u0xGozuJY0VsAQ-ZbhEKIp9E8Sqb7YZwAhK6Y_lLTSPsD0Mxp5d-q2r-nYHssvFY8B7xVAJsydLENTb4GKE38ZFaXsUZn87TOd04oThshpTyYDo9cAkiy25tfUB6ztkKcZF-3zaFAlI2HOsaLg78HTFVNx2smdy3DnL9ujXVDqd4dzs0WjSCYqXWGxHtmrp3Xb0VyZaWeNe8FVsYtJILUnfSjL-xNl4vq2jHpy0AJs6sVWw.s1UW0wuBIoAnje4W3s4vtA
         */

        private String token;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "token='" + token + '\'' +
                    '}';
        }
    }

}
