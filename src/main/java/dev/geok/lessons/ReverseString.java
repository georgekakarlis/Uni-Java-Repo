package dev.geok.lessons;
import java.util.*;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("Enter a string to be reversed: ");
        String input = sc.nextLine();

        System.out.println("Here is your reversed string :");
        Reverseit(input);
        sc.close();

    }

    public static void Reverseit (String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }

}
