package dev.geok.lessons;
import java.util.*;


public class SumAB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("What you want to do?");
        System.out.println("[1] Addition");
        System.out.println("[2] Subtraction");
        System.out.println("[3] Division");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
            break;
            case 2:
                System.out.println("Sum in subtraction of " + a + " and " + b + " is " + (a - b));
            break;
            case 3:
                if (b != 0) {
                    System.out.println("Sum of division of " + a + " and " + b + " is " + (a / b));
                } else {
                    System.out.println("Error : Division by zero is not allowed.");
                }
            break;

            default:
                System.err.println( "Error : Invalid choice.Please Select 1,2 or 3.");

        }
    }
}
