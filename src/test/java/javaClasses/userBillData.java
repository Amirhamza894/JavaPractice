package javaClasses;

import java.util.Scanner;

public class userBillData {
    final String userId;
    double callDuration;
    double billWithoutTax;
    final double mintRate = 0.25;
    final int tax = 15;
    // --Commented out by Inspection (07/08/2022 2:43 PM):int finalTotal;

    public userBillData(String userId){
        this.userId = userId;
    }
    public double calculateCallRate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter call duration");
        callDuration = scanner.nextDouble();
        this.callDuration = callDuration;
        if(callDuration == 10){
            System.out.println("your call is going longer than 10 minutes");
        } else if (callDuration > 10) {
            System.out.println("Thank you! for choosing our service");
        }
        else {
            System.out.println("On Call");
        }
        billWithoutTax = callDuration * mintRate;
        return billWithoutTax;
    }
    public double billWithTax(){
        String taxString = "0."+tax;
        double taxFix = Double.parseDouble(taxString);
        double finalTotal = taxFix + billWithoutTax;
        return finalTotal;
    }
}
