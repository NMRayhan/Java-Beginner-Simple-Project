package java_begainning;

import java.util.Scanner;

public class Using_Method {

    void addTwoString() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Name ");
        String name = input.nextLine();
        System.out.println("My Name is " + name);
    }

    static void minusTowNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A new Number ");
        int num1 = input.nextInt();
        System.out.print("Enter A New Another Number ");
        int num2 = input.nextInt();
        int num3 = num1 - num2;
        System.out.println(num3);
        System.out.println("Minus " + num1 + " " + num2 + " This  Two number is " + num3);
    }

    

    public static void main(String[] args) {
        Using_Method object = new Using_Method();
        object.addTwoString();
        int number = object.addTwoNumber();
        System.out.println(number);
        System.out.print("For Switch Statement = ");
        switch(number){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Ten");
        }
        minusTowNumber();
        }
    int addTwoNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number ");
        int number1 = input.nextInt();
        System.out.print("Enter Another Number ");
        int number2 = input.nextInt();
        int sum = number1 + number2;
        return sum;
    }
    }
