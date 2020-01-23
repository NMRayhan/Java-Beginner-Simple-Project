package java_begainning;

public class Assignment_4 {

    public static void main(String[] args) {
        int sum = 0, m;
        for (m = 1; m <= 434; m = m + 2) {
            sum = sum + m;
        }
        int avrg = sum / m;
        System.out.println("M is " + m);
        System.out.println("Sum of M is " + sum);
        m++;
        System.out.println("Average of M is " + avrg);
        int sum2 = 0, p;
        if (avrg < 294) {
            for (p = 1; p <= 5; p += 2) {
                sum2 = sum2 + p;
            }
            int avrg2 = sum2 / 3;

            System.out.println("Sum of P is " + sum2);
            System.out.println("Average of P is " + avrg2);
        } else {
            System.out.println("Try Again");
        }
    }
}
