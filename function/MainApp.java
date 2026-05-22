package function;
import java.util.*;
public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int n = sc.nextInt();
        int result = functions.fact(n);
        System.out.println("Factorial of " + n + " is: " + result);
        System.out.println();
        functions.numberGuessingGame(sc);
        System.out.println();
        functions.calculateAreaOfCircle(sc);
        sc.close();
    }
}
