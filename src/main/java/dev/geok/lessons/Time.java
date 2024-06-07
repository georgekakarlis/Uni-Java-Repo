package dev.geok.lessons;/*Exercise 2.3 The point of this exercise is to (1) use some of the arithmetic
operators, and (2) start thinking about compound entities (like time of day)
that are represented with multiple values.
1. Create a new program called Time.java. From now on, we won't remind
you to start with a small, working program, but you should.
2. Following the example program in Section 2.4, create variables named
hour, minute, and second. Assign values that are roughly the current
time. Use a 24-hour clock so that at 2:00 PM the value of hour is 14.
3. Make the program calculate and display the number of seconds since
midnight.
4. Calculate and display the number of seconds remaining in the day.
5. Calculate and display the percentage of the day that has passed. You
might run into problems when computing percentages with integers, so
consider using 
oating-point.
6. Change the values of hour, minute, and second to re
ect the current
time. Then write code to compute the elapsed time since you started
working on this exercise.
*/

public class Time {
    public static void main(String[] args) {
        // Initial time values
        int hour = 23;
        int minute = 30;
        int second = 10;

        // Total seconds in a day
        int totalSecondsInDay = 24 * 60 * 60;

        // 1. Calculating seconds since midnight
        int secondsSinceMidnight = hour * 3600 + minute * 60 + second;

        // 2. Calculating seconds remaining in the day
        int secondsRemaining = totalSecondsInDay - secondsSinceMidnight;

        // 3. Calculating the percentage of the day that has passed
        double percentageOfDayPassed = ((double) secondsSinceMidnight / totalSecondsInDay) * 100;

        // Displaying the results
        System.out.println("Seconds since midnight: " + secondsSinceMidnight);
        System.out.println("Seconds remaining in the day: " + secondsRemaining);
        System.out.printf("Percentage of the day passed: %.2f%%\n", percentageOfDayPassed);

        // For calculating elapsed time since started the exercise
        int startHour = 22;
        int startMinute = 0;
        int startSecond = 0;

        // Calculating the elapsed time
        int elapsedHours = hour - startHour;
        int elapsedMinutes = minute - startMinute;
        int elapsedSeconds = second - startSecond;

        // Adjusting for negative values
        if (elapsedSeconds < 0) {
            elapsedSeconds += 60;
            elapsedMinutes--;
        }
        if (elapsedMinutes < 0) {
            elapsedMinutes += 60;
            elapsedHours--;
        }

        // Display the elapsed time
        System.out.println("Elapsed time since starting the exercise:");
        System.out.printf("%d hours, %d minutes, %d seconds\n", elapsedHours, elapsedMinutes, elapsedSeconds);
    }

    // return
    /*Seconds since midnight: 84610
    Seconds remaining in the day: 1790
    Percentage of the day passed: 97,93%
    Elapsed time since starting the exercise:
    1 hours, 30 minutes, 10 seconds*/
}