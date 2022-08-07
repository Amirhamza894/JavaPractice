package Polymorphism;

public class LetsTest {

    public static void main(String[] args){
        // Normal technique
        Dog dog = new Dog();
        dog.petSound();
        dog.fetch();
        food(dog);

        // Pholymorphism
        Dog doggy = new Dog();
        doggy.petSound();
        doggy.fetch();
        food(doggy);

        Cat catty = new Cat();
        catty.petSound();
        catty.scratch();
        food(catty);

    }

    public static void food(Animal animal){
        if(animal instanceof Dog){
            System.out.println("give me dog's food");
        } else if (animal instanceof Cat) {
            System.out.println("Give me cat's food");
        }
        else {
            System.out.println("unknown animal, don't have food for this");
        }
    }
}
