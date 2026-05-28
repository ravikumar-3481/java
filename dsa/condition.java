import java.util.*;

public class condition {
    public static void calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter The Operator: ");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b != 0) {
                    System.out.println(a / b);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
       sc.close();
    }

    public static void comparision() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is equal to b");
        }
       sc.close();
    }

    public static void lcm() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        int lcm = (a > b) ? a : b;
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
                break;
            }
            lcm++;
        }
       sc.close();
    }

    public static void menu() {
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Calculator");
            System.out.println("2. Comparison");
            System.out.println("3. LCM");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    calculator();
                    break;
                case 2:
                    comparision();
                    break;
                case 3:
                    lcm();
                    break;
                case 4:                    
                    System.out.println("Exiting...");
                    sc.close();
                    break;
                default:
                    System.out.println("Invalid choice");
          }
            sc.close();
        }
    }

    public static void main(String[] args) {
        menu();
    }
}