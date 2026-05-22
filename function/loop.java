package function;
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

    public static void takeInputData(Scanner sc) {
        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        System.out.println("Your name is " + name + " and your age is " + age);
    }

    public static void calc(Scanner sc1) {
       
        System.out.print("Enter the value of a :  ");
        int a = sc1.nextInt();
        System.out.print("Enter the value of b :  ");
        int b = sc1.nextInt();
        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        float quotient = (float) a / b;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.printf("Quotient: %.2f%n", quotient);
        sc1.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5; // You can change this value to print a different pattern
        printPattern(n);
        System.out.println(); // Print a blank line
        printStarPatternReverse(n);
        System.out.println();
        takeInputData(sc);
        calc(sc);

    }
}