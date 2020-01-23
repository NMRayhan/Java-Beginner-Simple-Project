
package java_begainning;

import java.util.Scanner;

public class Assignment_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0, primesum = 0;

        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(+i);
                primesum = primesum + i;
            }
            count = 0;
        }
        System.out.println("Sum of this prime Number : " + primesum);
    }
}
