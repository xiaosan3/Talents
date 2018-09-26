package com.longmingxin.talent.talents.bean;

/**
 * Created by ASUS on 2018/9/25.
 */

public class Train_Data  {
    private String train_SchoolName;
    private String train_RuXue;
    private String train_TuiJianRenShu;
    private String train_TeSe;

    public Train_Data() {
    }

    public Train_Data(String train_SchoolName, String train_RuXue, String train_TuiJianRenShu, String train_TeSe) {
        this.train_SchoolName = train_SchoolName;
        this.train_RuXue = train_RuXue;
        this.train_TuiJianRenShu = train_TuiJianRenShu;
        this.train_TeSe = train_TeSe;
    }

    public String getTrain_SchoolName() {
        return train_SchoolName;
    }

    public void setTrain_SchoolName(String train_SchoolName) {
        this.train_SchoolName = train_SchoolName;
    }

    public String getTrain_RuXue() {
        return train_RuXue;
    }

    public void setTrain_RuXue(String train_RuXue) {
        this.train_RuXue = train_RuXue;
    }

    public String getTrain_TuiJianRenShu() {
        return train_TuiJianRenShu;
    }

    public void setTrain_TuiJianRenShu(String train_TuiJianRenShu) {
        this.train_TuiJianRenShu = train_TuiJianRenShu;
    }

    public String getTrain_TeSe() {
        return train_TeSe;
    }

    public void setTrain_TeSe(String train_TeSe) {
        this.train_TeSe = train_TeSe;
    }

    @Override
    public String toString() {
        return "Train_Data{" +
                "train_SchoolName='" + train_SchoolName + '\'' +
                ", train_RuXue='" + train_RuXue + '\'' +
                ", train_TuiJianRenShu='" + train_TuiJianRenShu + '\'' +
                ", train_TeSe='" + train_TeSe + '\'' +
                '}';
    }
}
