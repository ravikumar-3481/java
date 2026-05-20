import java.util.*;

public class loop {
    public static void printPattern(int n) {
        printPatternRec(n, 1);
    }

    private static void printPatternRec(int n, int current) {
        if (current > n) {
            return;
        }
        System.out.println("*".repeat(current));
        printPatternRec(n, current + 1);
    }

    public static void printStarPatternReverse(int n) {
        printStarPatternReverseRec(n);
    }

    private static void printStarPatternReverseRec(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println("*".repeat(n));
        printStarPatternReverseRec(n - 1);
    }

    public static void takeInputData() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Name : ");
            String name = sc.nextLine();
            System.out.print("Enter Age : ");
            int age = sc.nextInt();
            System.out.println("Your name is " + name + " and your age is " + age);
        }
    }

    public static void main(String[] args) {
        int n = 5; // You can change this value to print a different pattern
        printPattern(n);
        System.out.println(); // Print a blank line
        printStarPatternReverse(n);
        System.out.println();
        takeInputData();
    }
}