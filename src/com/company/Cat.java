package com.company;

public class Cat extends Animal implements Printable {
    private int age;
    private String color;

    public Cat(String voice, int age, String color) {
        super(voice);
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
        System.out.println(getAge() +" "+ getColor()+" "+getVoice());
    }
}
