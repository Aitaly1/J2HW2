package com.company;

public class Dog extends Animal implements Printable {
    private int age;
    private String breed;


    public Dog(String voice, int age, String breed) {
        super(voice);
        this.age = age;
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }
    public String getBreed() {
        return breed;
    }

    @Override
    public void print() {
        System.out.println(getAge() +" "+getBreed()+" "+ getVoice());
    }
}
