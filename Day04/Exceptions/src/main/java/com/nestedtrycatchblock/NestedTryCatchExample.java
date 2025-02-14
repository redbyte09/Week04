package com.nestedtrycatchblock;

import java.util.Scanner;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Taking user input for array size
            System.out.print("Enter size of the array: ");
            int size = sc.nextInt();
            int[] arr = new int[size];

            // Taking array elements input
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // Taking user input for index
            System.out.print("Enter index to access: ");
            int index = sc.nextInt();

            // Outer try block: Handles ArrayIndexOutOfBoundsException
            try {
                // Accessing the array element
                int element = arr[index];

                // Taking user input for divisor
                System.out.print("Enter divisor: ");
                int divisor = sc.nextInt();

                // Inner try block: Handles ArithmeticException
                try {
                    // Division operation
                    int result = element / divisor;
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }

        } finally {
            sc.close();
            System.out.println("Operation completed.");
        }
    }
}

