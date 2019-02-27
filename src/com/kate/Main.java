package com.kate;

public class Main {

    public static void main(String[] args) {
        person Austin = new person("orange", 32, "22-2222-22", "6'", "Austin Grubb");
        System.out.println(Austin.toString());

        person matt = new person(18, "matt");
        System.out.println(matt.toString());
        System.out.println(matt.getAge());
        matt.setAge(26);
        System.out.println(matt.getAge());
    }
}
