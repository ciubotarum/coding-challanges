package simple.exercises;

import java.util.Scanner;

    public class StdinExample {
        public static void main(String[] args) {
            // Create a Scanner object to read input from stdin
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter their name
            System.out.print("Enter your name: ");


            // Read the input from stdin
            String name = scanner.nextLine();

            System.out.print("Enter your age: ");
            String age = scanner.nextLine();

            // Check if the input contains only digits
            if (age.matches("\\d+")) {
                // Convert the input string to an integer
                int number = Integer.parseInt(age);
                System.out.println("Your age is " + number);
            } else {
                System.out.println("Invalid input! Please enter only digits.");
            }

            // Display a greeting message
            System.out.println("Hello, " + name + "!");
//            System.out.println("Your age is " + age);

            // Close the Scanner object
            scanner.close();
        }
    }
