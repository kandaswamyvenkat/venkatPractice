package venkat.learning.controlstatements;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[]args){
        System.out.println("enter your age");
        Scanner sc=new Scanner(System.in);
        int  age =sc.nextInt();
        System.out.println("enter your weight");
        int weight=sc.nextInt();

        if(age>=18) {
            System.out.println("your age is eligible for blood donation");
            if (weight >= 50) {
                System.out.println("your weight is eligible for blood donation");

            } else {
                System.out.println("your weight is not sufficient");
                System.out.println("your not eligible");

            }
        }else {
                System.out.println("your age isn't eligible for donation");
                System.out.println(" your not eligible");
        }

    }
}
