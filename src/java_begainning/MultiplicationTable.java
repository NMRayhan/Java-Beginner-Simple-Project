package java_begainning;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, m;

        System.out.print("Enter Initial Number : ");
        m = input.nextInt();

        System.out.print("Enter Range Number : ");
        n = input.nextInt();

        for (int i = m; i <= n; i++) {

            System.out.println("Multiplication Table No " + i);
            for (int j = 1; j <= 10; j++) {

                System.out.println(i + " X " + j + " = " + (i * j));

            }
        }
    }
}
