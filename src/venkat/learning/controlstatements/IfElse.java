package venkat.learning.controlstatements;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        System.out.println("enter your value");
        Scanner sc=new Scanner(System.in) ;
        int num=sc.nextInt();



        if(num%2==0){

            System.out.println("even number");

        }else{
            System.out.println("odd number");
        }
    }
}
