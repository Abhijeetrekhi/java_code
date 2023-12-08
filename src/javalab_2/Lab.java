package javalab_2;

import java.util.Scanner;

public class Lab {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Print user input instructions
        System.out.println("Choose a shape:");
        System.out.println("1. Circle");
        System.out.println("2. Pyramid");
        System.out.print("Enter your choice (1 or 2): ");

        // Get user choice
        int choice = scanner.nextInt();

        if (choice == 1) {
            // User chose Circle
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();

            // Calculate and print circle area and circumference
            calculateCircle(radius);
        } else if (choice == 2) {
            // User chose Pyramid
            System.out.print("Enter the length of the pyramid base: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width of the pyramid base: ");
            double width = scanner.nextDouble();
            System.out.print("Enter the height of the pyramid: ");
            double height = scanner.nextDouble();

            // Calculate and print pyramid base area and volume
            calculatePyramid(length, width, height);
        } else {
            // Invalid choice
            System.out.println("Invalid choice. Please choose 1 for Circle or 2 for Pyramid.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to calculate and print the area and circumference of a circle
    private static void calculateCircle(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;

        System.out.println("Circle Area: " + area);
        System.out.println("Circle Circumference: " + circumference);
    }

    // Function to calculate and print the base area and volume of a pyramid
    private static void calculatePyramid(double length, double width, double height) {
        double baseArea = length * width;
        double volume = (baseArea * height) / 3;

        System.out.println("Pyramid Base Area: " + baseArea);
        System.out.println("Pyramid Volume: " + volume);
    }
}

