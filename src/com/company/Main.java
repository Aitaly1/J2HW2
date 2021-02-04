package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Dog").print();
        createObject("Cat").print();
        createObject("Cow").print();
        createObject("Dog2").print();

    }

    public static Printable createObject(String name) {
        Printable object = null;

        switch (name){
            case "Dog":
                object = new Dog("gaf",12,"Afcharka");
                break;
            case "Cat":
                object = new Cat("myay",13,"black");
                break;
            case "Cow":
                object = new Cow("muuu",25,"idk cow breed","black and white");
                break;
            case "Dog2":
               object = new Dog("RRRR",10,"dalmatian");
               break;
        }
        return object;

    }
}
