package LoopingThroughCollections;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args){
        setDemo();
        mapDemo();
    }
    public static void setDemo(){
        Set<String> fruit = new HashSet();
        fruit.add("Banana");
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Mango");

        // iterator looping
        System.out.println("iterator looping");
        var i = fruit.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        // enhaced for loop
        System.out.println("enhaced for loop");
        for(String item : fruit){
            System.out.println(item);
        }

        // forEach lambda loop
        System.out.println("forEach lambda loop");
        fruit.forEach(System.out::println);
    }
    public static void mapDemo(){
        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("Apple", 25);
        fruitCalories.put("Banana", 20);
        fruitCalories.put("Orange", 30);
        fruitCalories.put("Mango", 35);

        // for looping
        System.out.println("for Looping through map");
        for(var entry: fruitCalories.entrySet()){
            System.out.println(entry.getValue());
        }
        // forEach lambda loop
        System.out.println("forEach Lamba loop");
        fruitCalories.forEach(
                (f, c) -> System.out.println("Fruit: "+ f + ", Calories: " + c)
        );
    }
}

