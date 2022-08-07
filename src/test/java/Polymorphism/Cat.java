package Polymorphism;

public class Cat extends Animal{

    @Override
    public void petSound(){
        System.out.println("Meow Meow");
    }

    public void scratch(){
        System.out.println("i am a cat, i can scratch things");
    }
}
