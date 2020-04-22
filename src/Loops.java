import java.util.Scanner;

public class Loops {
    public static void main(String [] args){
        int number;
        int sum = 0;
        int factorial;
        int factorial_result = 1;
        int height;
        int base;
        Scanner sc = new Scanner(System.in);

        //a program that prints the numbers 1-10.
        System.out.print("List of Numbers 1-10: ");
        for (int x = 1; x < 11; x++){
            System.out.print(x + " ");
        }
        System.out.println();

        //a program that prints the numbers 1-10 backwards.
        System.out.print("List of Numbers 10-1: ");
        for (int x = 10; x > 0; x--){
            System.out.print(x + " ");
        }
        System.out.println();

        //a program that prints all the odd numbers from 1-20.
        System.out.print("Odd numbers 1-20: ");
        for (int x = 1; x <= 20; x++){
            if(x % 2 != 0){
                System.out.print(x + " ");
            }
        }
        System.out.println();

        //a program that prints all the even numbers from 1-20.
        System.out.print("Even numbers 1-20: ");
        for (int x = 1; x <= 20; x++){
            if(x % 2 == 0){
                System.out.print(x + " ");
            }
        }
        System.out.println();

        //Sum all values from 1-10.
        for (int x = 1; x <= 10; x++){
            sum = sum + x;
        }
        System.out.println("The total sum of 1-10: " + sum);

        // draw rectangle
        System.out.print("Enter the height for the rectangle. ");
        height = sc.nextInt();
        System.out.print("Enter the base for the rectangle. ");
        base = sc.nextInt();
        for (int h = 0; h < height; h++){
            for (int b = 0; b < base; b++){
                System.out.print("*");
            }
            System.out.println();
        }

        //draw triangle-1
        System.out.print("Enter the height for the triangle 1. ");
        height = sc.nextInt();
        for (int h = 0; h < height; h++){
            for (int b = 0; b <= h; b++){
                System.out.print("*");
            }
            System.out.println();
        }

        //draw triangle-2
        System.out.print("Enter the height for the triangle 2. ");
        height = sc.nextInt();
        for (int h = height; h > 0; h--){
            for (int b = 0; b <= height; b++){
                if (b < h) {
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        //Factorial of a Number
        System.out.print("Enter a number to find it's factorial. ");
        factorial = sc.nextInt();
        for (int x = 1; x <= factorial; x++){
            factorial_result = factorial_result * x;

        }
        System.out.println("The factorial of " + factorial + " is " + factorial_result);

        //user input a number and print all numbers from that input value to 1.
        System.out.print("Please enter a number the system will print all numbers from that input value to 1. ");
        number = sc.nextInt();
        System.out.print("All numbers between 1 and " + number + " is ");
        for (int x = 1; x <= number; x++){
            System.out.print(x + ",");
        }
        System.out.println();

        //user enter a number and print the sum of all numbers from that inputted value to 1.
        System.out.print("please enter a number the system will print the sum of the numbers from that input to 1. ");
        number = sc.nextInt();

        sum = 0;
        for (int x = 0; x <= number; x++){
            sum = sum + x;
        }
        System.out.println("Total sum from 1 to " + number + " is " + sum);

        System.out.println("Thanks!! \n Place give us your feed back. ");


    }
}
