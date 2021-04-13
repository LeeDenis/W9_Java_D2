package com.company;
import java.util.Scanner;

public class Java_HW_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Give me a Minimum integer:");
        int numberOne = input.nextInt();
        System.out.println("Give me a Maximum integer that's greater than the Minimum:");
        int numberTwo = input.nextInt();
        System.out.println("Give me a Random integer that isn't the same as the Minimum or Maximum:");
        int numberThree = input.nextInt();

        if(numberThree < numberOne) {
            System.out.println("The Random integer is less than the Minimum integer.");
        } else if (numberThree < numberTwo) {
            System.out.println("The Random integer between the Minimum and Maximum integers.");
        } else if (numberThree > numberTwo) {
            System.out.println("The Random integer is greater than the Maximum integer.");
        } else {
            System.out.println("Do you even follow directions?");
        }
    }
}
