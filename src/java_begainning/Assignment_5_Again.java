package java_begainning;

public class Assignment_5_Again {

    public static void main(String[] args) {
        int[] number = {2,4,6,8};
        for (int i = 0; i < number.length; i++) {
            System.out.println(+number[i]);
        }
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
