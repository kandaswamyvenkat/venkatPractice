package venkat.learning.controlstatements;

import java.util.Scanner;

public class SwitchMonth {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        String monthString = "";
        switch (month) {
            case 1:
                monthString = "january";
                break;
            case 2:
                monthString = "february";
                break;
            case 3:
                monthString = "march";
                break;
            case 4:
                monthString = "april";
                break;
            default:
                System.out.println("invalid");

        }
        System.out.println(monthString);
    }


}
