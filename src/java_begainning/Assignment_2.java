package java_begainning;
public class Assignment_2 {
    public static void main(String[] args) {
        int i,sum=0;
        for (i = 1; i <= 111; i++) {
            if (i % 2 == 1) {
                System.out.print(" "+i);
                sum = sum +i;
            }
        }
        System.out.println();
        if (sum > 2832) {
            System.out.println("Sum of this program "+sum);
            System.out.println("Sum of this Odd number is more Then 2832");
        } else {
            System.out.println("Sum of this program "+sum);
            System.out.println("Everything All Right");
        }
    }
}
