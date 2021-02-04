package com.company;

public class Cat extends Animal implements Printable {
    private int age;
    private String color;

    public Cat(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }

    @Override
    public void print() {
        System.out.println(getAge() +" "+ getColor());
    }
}
