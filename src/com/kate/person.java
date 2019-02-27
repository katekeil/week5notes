package com.kate;

/**
 * Created by 016006 on 2/12/2019.
 */
public class person {
    private String hairColor;
    private int age;
    private String ssn;
    private String height;
    private String name;

    public person(String hairColor, int age, String ssn, String height, String name) {
        this.hairColor = hairColor;
        this.age = age;
        this.ssn = ssn;
        this.height = height;
        this.name = name;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person:" +
                "Hair Color='" + hairColor + '\'' +
                ", Age=" + age +
                ", SSN='" + ssn + '\'' +
                ", Height='" + height + '\'' +
                ", Name='" + name + '\'' ;
    }
}
