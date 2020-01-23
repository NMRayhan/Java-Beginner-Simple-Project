package java_begainning;

public class Assignment_3 {

    public static void main(String[] args) {
        float n, f, sum = 0;
        for (n = 0; n <= 3; n += .5) {
            f = (n * ((n / 1) * (n / 1))) / 4;
            sum = sum + f;
        }
        System.out.println("Summation of This Formula = " + sum);
    }

}
