package venkat.learning.controlstatements;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for (; i <= 11; i++) {
            System.out.println(i);
        }
    }
}
