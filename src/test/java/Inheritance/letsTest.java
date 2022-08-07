package Inheritance;

public class letsTest {
    public static void main(String[] args){
        SubClass subClass = new SubClass();
        subClass.setName("Amir hamza");
        subClass.setPreferendName("Hamza");
        subClass.setAddress("Khyber pukhtoon khwa");
        subClass.setID("2022#21");
        subClass.setPhoneNumber("03431303012");

        System.out.println(subClass.getName());
        System.out.println(subClass.getPreferendName());
        System.out.println(subClass.getAddress());
        System.out.println(subClass.getID());
        System.out.println(subClass.getPhoneNumber());


    }
}
