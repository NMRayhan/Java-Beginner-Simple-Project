package java_begainning;

public class Assignment_5 {

    public static void main(String[] args) {
        int[] number;
        number = new int[4];
        number[0] = 2;
        number[1] = 4;
        number[2] = 6;
        number[3] = 8;
        System.out.println("Array index 0 value is " + number[0]);
        System.out.println("Array index 1 value is " + number[1]);
        System.out.println("Array index 2 value is " + number[2]);
        System.out.println("Array index 3 value is " + number[3]);
        int total_value = number[0] + number[1] + number[2] + number[3];
        System.out.println("Sum of This Array " + total_value);
        int len = number.length;
        System.out.println("Array Length is " + len);
        float average = total_value / len;
        System.out.println("Average the Sum of Array " + average);
        float multiplying_array = (float) (average * Math.PI);
        System.out.println("Total Result of This Array with 3.1415 is " + multiplying_array);
    }
}
