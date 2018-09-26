package com.longmingxin.talent.talents.bean;

/**
 * Created by ASUS on 2018/9/26.
 */

public class Exclusive_Data {
    private String exclusive_Engineer;
    private String exclusive_price;
    private String exclusive_company;
    private String exclusive_position;
    private String exclusive_Education;
    private String exclusive_time;

    public Exclusive_Data() {
    }

    public Exclusive_Data(String exclusive_Engineer, String exclusive_price, String exclusive_company, String exclusive_position, String exclusive_Education, String exclusive_time) {
        this.exclusive_Engineer = exclusive_Engineer;
        this.exclusive_price = exclusive_price;
        this.exclusive_company = exclusive_company;
        this.exclusive_position = exclusive_position;
        this.exclusive_Education = exclusive_Education;
        this.exclusive_time = exclusive_time;
    }

    public String getExclusive_Engineer() {
        return exclusive_Engineer;
    }

    public void setExclusive_Engineer(String exclusive_Engineer) {
        this.exclusive_Engineer = exclusive_Engineer;
    }

    public String getExclusive_price() {
        return exclusive_price;
    }

    public void setExclusive_price(String exclusive_price) {
        this.exclusive_price = exclusive_price;
    }

    public String getExclusive_company() {
        return exclusive_company;
    }

    public void setExclusive_company(String exclusive_company) {
        this.exclusive_company = exclusive_company;
    }

    public String getExclusive_position() {
        return exclusive_position;
    }

    public void setExclusive_position(String exclusive_position) {
        this.exclusive_position = exclusive_position;
    }

    public String getExclusive_Education() {
        return exclusive_Education;
    }

    public void setExclusive_Education(String exclusive_Education) {
        this.exclusive_Education = exclusive_Education;
    }

    public String getExclusive_time() {
        return exclusive_time;
    }

    public void setExclusive_time(String exclusive_time) {
        this.exclusive_time = exclusive_time;
    }

    @Override
    public String toString() {
        return "Exclusive_Data{" +
                "exclusive_Engineer='" + exclusive_Engineer + '\'' +
                ", exclusive_price='" + exclusive_price + '\'' +
                ", exclusive_company='" + exclusive_company + '\'' +
                ", exclusive_position='" + exclusive_position + '\'' +
                ", exclusive_Education='" + exclusive_Education + '\'' +
                ", exclusive_time='" + exclusive_time + '\'' +
                '}';
    }
}
