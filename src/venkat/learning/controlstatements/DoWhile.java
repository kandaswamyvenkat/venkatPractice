package venkat.learning.controlstatements;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        System.out.println("enter your num");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        do {

            System.out.println(i);
            i++;

        } while (i <= 10);
        System.out.println("your result");
    }
}
