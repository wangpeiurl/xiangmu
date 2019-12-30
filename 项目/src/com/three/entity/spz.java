package com.three.entity;

public class spz {
    private int Aid;//编号
    private String name;//学校名称
    private int Grade;//职称
    private int Sex;//性别
    private int Age;//年龄
    private String Depart;//所属单位

    public int getAid() {
        return Aid;
    }

    public void setAid(int aid) {
        Aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int grade) {
        Grade = grade;
    }

    public int getSex() {
        return Sex;
    }

    public void setSex(int sex) {
        Sex = sex;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getDepart() {
        return Depart;
    }

    public void setDepart(String depart) {
        Depart = depart;
    }

    @Override
    public String toString() {
        return "spz{" +
                "Aid=" + Aid +
                ", name='" + name + '\'' +
                ", Grade=" + Grade +
                ", Sex=" + Sex +
                ", Age=" + Age +
                ", Depart='" + Depart + '\'' +
                '}';
    }
}
