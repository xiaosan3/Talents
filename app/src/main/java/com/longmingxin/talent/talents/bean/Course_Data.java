package com.longmingxin.talent.talents.bean;

/**
 * Created by ASUS on 2018/9/25.
 */

public class Course_Data {
    private String course_Open_class;
    private String course_KeShi;
    private String course_content;
    private String course_BaoMing;
    private String course_RenShu;

    public Course_Data() {
    }

    public Course_Data(String course_Open_class, String course_KeShi, String course_content, String course_BaoMing, String course_RenShu) {
        this.course_Open_class = course_Open_class;
        this.course_KeShi = course_KeShi;
        this.course_content = course_content;
        this.course_BaoMing = course_BaoMing;
        this.course_RenShu = course_RenShu;
    }

    public String getCourse_Open_class() {
        return course_Open_class;
    }

    public void setCourse_Open_class(String course_Open_class) {
        this.course_Open_class = course_Open_class;
    }

    public String getCourse_KeShi() {
        return course_KeShi;
    }

    public void setCourse_KeShi(String course_KeShi) {
        this.course_KeShi = course_KeShi;
    }

    public String getCourse_content() {
        return course_content;
    }

    public void setCourse_content(String course_content) {
        this.course_content = course_content;
    }

    public String getCourse_BaoMing() {
        return course_BaoMing;
    }

    public void setCourse_BaoMing(String course_BaoMing) {
        this.course_BaoMing = course_BaoMing;
    }

    public String getCourse_RenShu() {
        return course_RenShu;
    }

    public void setCourse_RenShu(String course_RenShu) {
        this.course_RenShu = course_RenShu;
    }

    @Override
    public String toString() {
        return "Course_Data{" +
                "course_Open_class='" + course_Open_class + '\'' +
                ", course_KeShi='" + course_KeShi + '\'' +
                ", course_content='" + course_content + '\'' +
                ", course_BaoMing='" + course_BaoMing + '\'' +
                ", course_RenShu='" + course_RenShu + '\'' +
                '}';
    }
}
