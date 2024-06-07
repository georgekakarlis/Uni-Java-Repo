package dev.geok.lessons;// a variable is a named location in memory that stores a value. values could be any data type.
// variable names are case sensitive



public class Variables {
    public static void main(String[] args) {
        String message = "hello!";
        int hour = 11;
        int minute = 59;
        System.out.println( hour);
        System.out.println( message);
        System.out.println( minute);

        // arithmetic operations
        System.out.print("Number of minutes since midnight: " );
        System.out.println(hour * 60 + minute);

        // floating point numbers
        double pi;
        pi = 3.14159;

        //the following is illegal because int cant be double 
        //int x = 1.1;


        //rounding error 
        // most floating point numbers are only aproximately correct. Some numbers,
        //like reasonably sized integers, can be represented exactly. But repeating fractions, like 1/3, and 
        // irrational numbers like π, cannot. To represent these numbers, computers have to round off to the nearest floating-point number. 
        //The different between the number we want and the floating-point number we get is called rounding error, eg :
        
        System.out.println(0.1 * 10);
        System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1);

        // but on many machines the output is : 
        // 1.0
        // 0.99999999999999

        // rounding errors are not useful in situations like computers graphics, encryption etc where we need precision 
        // in our data types. thats when we use int instead of float
    }
}
