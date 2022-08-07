package OveridingAndOverloading;

import Inheritance.SubClass;

import java.awt.*;

public class LetsTest {
    public static void main(String[] args){

        // OverLoading
        SupClass supclass = new SupClass();
        supclass.print();
        SubbClass subclass = new SubbClass();
        subclass.print("i am square");

        testCalculate();

    }


    public static void testCalculate(){
        // Rectangle
        SupClass supclass = new SupClass();
        supclass.setLength(4);
        supclass.setWidth(8);
        System.out.println(supclass.calculateParameters());

        // Square
        SubbClass subclass = new SubbClass();
        subclass.setLength(4);
        subclass.setWidth(8);
        System.out.println(subclass.calculateParameters());

    }
}
