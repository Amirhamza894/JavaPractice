package Polymorphism;

public class Dog extends Animal{

    @Override
    public void petSound(){
        System.out.println("Woof Woof");
    }

    public void fetch(){
        System.out.println("i am a dog, i can fitch things");
    }
}
