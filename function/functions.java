package function;
import java.util.*;

public class functions {
    public static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void numberGuessingGame(Scanner sc){
        int n;
        n = (int)(Math.random() * 100) + 1;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Can you guess it?");
        while (true) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            if (guess < n) {
                System.out.println("Too low! Try again.");
            } else if (guess > n) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number!");
                break;
            }
        }
    }

    public static void calculateAreaOfCircle(Scanner sc) {
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.printf("The area of the circle with radius %.2f is: %.2f%n", radius, area);
    }
}
