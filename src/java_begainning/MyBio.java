package java_begainning;

import java.util.Scanner;

public class MyBio {

    public static void main(String[] args) {
        Scanner Rayhan = new Scanner(System.in);
        int My_ID;
        String My_Name;

        System.out.printf("Enter Your Name: ");
        My_Name = Rayhan.nextLine();

        System.out.printf("Enter Your ID : ");
        My_ID = Rayhan.nextInt();

        System.out.println("My Name Is : " + My_Name);
        System.out.println("My ID is : " + My_ID);

    }
}
