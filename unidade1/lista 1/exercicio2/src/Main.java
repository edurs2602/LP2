import java.util.Scanner;

import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        int inputNumber = number.nextInt();

        String hour = getHour(inputNumber);

        System.out.println(hour);
    }

    public static String getHour(int number) {

        int hours = (number / 3600);
        int minutes = (number % 3600) / 60;
        int seconds = (number % 60);

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);

    }
}