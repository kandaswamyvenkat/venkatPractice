package venkat.learning.controlstatements;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[]args){
        System.out.println("enter obtained score");

        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();
        if (score<=50){
            System.out.println("Fail");
        }else if(score>=50 && score<60){
            System.out.println("C Grade");
        }else if(score>=60 && score<70){
            System.out.println("B Grade");

        }else if(score>=70 && score<=100){
            System.out.println("A Grade ");
        }else {
            System.out.println("Invalid");
        }


    }
}
