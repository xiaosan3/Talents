package com.longmingxin.talent.talents.bean;

/**
 * Created by ASUS on 2018/9/26.
 */

public class Train_School_Data {
    private String train_Welder;
    private String train_price;
    private String train_sign_up;
    private String train_tuijianruzhi;

    public Train_School_Data() {
    }

    public Train_School_Data(String train_Welder, String train_price, String train_sign_up, String train_tuijianruzhi) {
        this.train_Welder = train_Welder;
        this.train_price = train_price;
        this.train_sign_up = train_sign_up;
        this.train_tuijianruzhi = train_tuijianruzhi;
    }

    public String getTrain_Welder() {
        return train_Welder;
    }

    public void setTrain_Welder(String train_Welder) {
        this.train_Welder = train_Welder;
    }

    public String getTrain_price() {
        return train_price;
    }

    public void setTrain_price(String train_price) {
        this.train_price = train_price;
    }

    public String getTrain_sign_up() {
        return train_sign_up;
    }

    public void setTrain_sign_up(String train_sign_up) {
        this.train_sign_up = train_sign_up;
    }

    public String getTrain_tuijianruzhi() {
        return train_tuijianruzhi;
    }

    public void setTrain_tuijianruzhi(String train_tuijianruzhi) {
        this.train_tuijianruzhi = train_tuijianruzhi;
    }

    @Override
    public String toString() {
        return "Train_Data{" +
                "train_Welder='" + train_Welder + '\'' +
                ", train_price='" + train_price + '\'' +
                ", train_sign_up='" + train_sign_up + '\'' +
                ", train_tuijianruzhi='" + train_tuijianruzhi + '\'' +
                '}';
    }
}
