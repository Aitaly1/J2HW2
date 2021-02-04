package com.company;

public class Cow extends Animal implements Printable {
    private int age;
    private String breed;
    private String coloring;

    public Cow(int age, String breed,String coloring) {
        this.age = age;
        this.breed = breed;
        this.coloring = coloring;
    }

    public int getAge() {
        return age;
    }
    public String getBreed() {
        return breed;
    }
    public String getColoring() {
        return coloring;
    }

    @Override
    public void print() {
        System.out.println(getAge() + " " + getBreed() + "   " + getColoring());

    }
}
