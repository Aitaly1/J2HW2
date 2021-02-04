package com.company;

public class Animal implements Printable{
    private String voice;

    public Animal(String voice) {
        this.voice = voice;
    }


    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    public void print() {
        System.out.println(getVoice());

    }
}
