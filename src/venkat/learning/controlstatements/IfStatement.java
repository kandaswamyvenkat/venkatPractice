package venkat.learning.controlstatements;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[]args)
    {
System.out.println("Please enter your age");
        Scanner sc=new Scanner(System.in);
        int age =sc.nextInt();
        if(age>18){
            System.out.println("Age is greater than 18");
        }
    }
}
