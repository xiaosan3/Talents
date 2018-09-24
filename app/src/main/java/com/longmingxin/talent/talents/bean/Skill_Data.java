package com.longmingxin.talent.talents.bean;

/**
 * Created by ASUS on 2018/9/21.
 */

public class Skill_Data {
    private int skill_image;
    private String skill_type;
    private String skill_content;
    private String sill_time;

    public Skill_Data() {
    }

    public Skill_Data(int skill_image, String skill_type, String skill_content, String sill_time) {
        this.skill_image = skill_image;
        this.skill_type = skill_type;
        this.skill_content = skill_content;
        this.sill_time = sill_time;
    }

    public int getSkill_image() {
        return skill_image;
    }

    public void setSkill_image(int skill_image) {
        this.skill_image = skill_image;
    }

    public String getSkill_type() {
        return skill_type;
    }

    public void setSkill_type(String skill_type) {
        this.skill_type = skill_type;
    }

    public String getSkill_content() {
        return skill_content;
    }

    public void setSkill_content(String skill_content) {
        this.skill_content = skill_content;
    }

    public String getSill_time() {
        return sill_time;
    }

    public void setSill_time(String sill_time) {
        this.sill_time = sill_time;
    }

    @Override
    public String toString() {
        return "Skill_Data{" +
                "skill_image=" + skill_image +
                ", skill_type='" + skill_type + '\'' +
                ", skill_content='" + skill_content + '\'' +
                ", sill_time='" + sill_time + '\'' +
                '}';
    }
}
