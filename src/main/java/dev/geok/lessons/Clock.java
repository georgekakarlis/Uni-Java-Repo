package dev.geok.lessons;

import java.util.Calendar;

public class Clock {
    public static void main(String[] args) {
        while (true) {
            Calendar cal = Calendar.getInstance();
            int hour = cal.get(Calendar.HOUR_OF_DAY);
            int minute = cal.get(Calendar.MINUTE);
            int second = cal.get(Calendar.SECOND);

            String formattedTime = String.format("%02d:%02d:%02d", hour, minute, second);
            System.out.print("\r" + formattedTime);

            try {
                Thread.sleep(1000); //wait one second
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
