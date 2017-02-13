package edu.tomer;

import java.time.LocalDateTime;
import java.util.Scanner;

public class IO {
    public static Scanner scanner = new Scanner(System.in);

    private IO(){}

    public static int getInt(String message){
        System.out.println(message);
        return scanner.nextInt();
    }

    public static int getInt(String message, int from, int to){
        int input;
        do {
            System.out.println(message + " " + from + "-" + to + ":");
            input = scanner.nextInt();
        }
        while (input > from || input < to);
            return input;
    }

    public static String getString(String message) {
        System.out.println(message);
        return scanner.next();
    }

    public static float getFloat(String message) {
        System.out.println(message);
        return scanner.nextFloat();
    }

    public static LocalDateTime getDateTime(String message){
        System.out.println(message);
        return LocalDateTime.of(IO.getInt("Enter year", 1960, LocalDateTime.now().getYear()), +
                                IO.getInt("Enter month", 1, 12), +
                                IO.getInt("Enter day", 1, 31), +
                                IO.getInt("Enter hour", 0, 23), +
                                IO.getInt("Enter minute", 0, 59));
    }
}