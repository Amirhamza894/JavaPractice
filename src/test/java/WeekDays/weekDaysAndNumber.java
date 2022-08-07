package WeekDays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class weekDaysAndNumber {

    public static void main(String[] args){
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "thursday", "Friday", "Saturday", "Sunday"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number for day");
        int dayNumber = scanner.nextInt();
        scanner.close();
        if(dayNumber <= daysOfWeek.length){
            System.out.println("Corresponding day: "+ daysOfWeek[dayNumber-1]);
        }
        else{
            System.out.println("you have enetered wrong day number");
        }

    }
}
