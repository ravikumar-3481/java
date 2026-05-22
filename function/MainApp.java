package function;
import java.util.*;
public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int n = sc.nextInt();
        int result = factorial.fact(n);
        System.out.println("Factorial of " + n + " is: " + result);
        sc.close();
    }
}
