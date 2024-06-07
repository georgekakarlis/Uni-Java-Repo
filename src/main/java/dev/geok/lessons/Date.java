package dev.geok.lessons;//The point of this exercise is (1) to use string concatenation
//to display values with different types (int and String), and (2) to practice
//developing programs gradually by adding a few statements at a time.
//1. Create a new program named Date.java. Copy or type in something like
//the Hello World program and make sure you can compile and run it.
//2. Following the example in Section 2.4, write a program that creates vari-
//ables named day, date, month, and year. The variable day will contain
//the day of the week (like Friday), and date will contain the day of the
//month (like the 13th). Assign values to those variables that represent
//today's date.
//3. Display the value of each variable on a line by itself. This is an interme-
//diate step that is useful for checking that everything is working so far.
//Compile and run your program before moving on.
//4. Modify the program so that it displays the date in standard American
//format; for example: Thursday, 7 18, 2019.
//5. Modify the program so it also displays the date in European format. The
//final output should be as follows:
//American format: Thursday, 7 18, 2019
//European format: Thursday 18 7 2019

public class Date {
    public static void main(String[] args) {
        String day = "Saturday";
        int date = 18;
        int month = 11;
        int year = 2023;
        System.out.println(day + " " + date + " " + month + " " +  year);
        // Saturday 18 11 2023
        System.out.println("American Format: " + "" + day + " " + month + " " + date + " " +  year);
        System.out.println("European Format: " + "" + day + " " + date + " " + month + " " +  year);
        // Saturday 18 11 2023
        //American Format: Saturday 11 18 2023
        //European Format: Saturday 18 11 2023
    }
}
