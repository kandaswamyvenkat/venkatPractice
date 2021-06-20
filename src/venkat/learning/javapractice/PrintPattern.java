package venkat.learning.javapractice;

import java.util.Scanner;

public class PrintPattern {


    public static void main(String[] args) {
int i,j,row;
        System.out.println("Enter a required value");
Scanner sc= new Scanner(System.in);
row=sc.nextInt();
        System.out.println("Your pattern");
        for(i=0;i<row;i++){
            for(j=0;j<=i;j++){

                System.out.print("*");
            }
            System.out.println();
        }

    }
}