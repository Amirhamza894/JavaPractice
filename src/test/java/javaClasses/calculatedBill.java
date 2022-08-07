package javaClasses;


public class calculatedBill {


    public static void main(String[] args){
        userBillData userID = new userBillData("#2022I01");
        System.out.println("UserID: "+userID.userId);
        System.out.println("Your Call Duration: " + userID.calculateCallRate());
        System.out.println("Your calculated phone Bill is: " + userID.billWithTax());
    }
}
