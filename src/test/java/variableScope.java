
import java.util.Scanner;

public class variableScope {

    static Scanner scanner = new Scanner(System.in);
    static int getTimeDuration;
    static double ratePerMnt = 0.25;
    static double planFee;
    static double tax = 0.15;


// --Commented out by Inspection START (07/08/2022 2:43 PM):
//    public static void main(){
//
//        // get total time duration
//        getTotalTime();
//        scanner.close();
//        timeWithRate(ratePerMnt);
//        System.out.println("The total bill is " + totalAfterTax(tax));
//
//    }
// --Commented out by Inspection STOP (07/08/2022 2:43 PM)


    public static int getTotalTime(){
        System.out.println("Enter Time Duration of call");
        getTimeDuration = scanner.nextInt();
        return getTimeDuration;
    }

    public static double timeWithRate(double minutePrice){
        planFee = getTimeDuration * minutePrice;
        return planFee;
    }
    public static double totalAfterTax(double taxRate){
        double calculated = taxRate * planFee;
        return calculated;
    }
}
