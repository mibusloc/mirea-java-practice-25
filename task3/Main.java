package ru.mirea.lab25.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String[] testDates = {"29/02/2000", "30/04/2003", "01/01/2003", "29/02/2001", "30-04-2003", "1/1/1899"};

        String datePattern = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19\\d{2}|[2-9]\\d{3})$";
        Pattern pattern = Pattern.compile(datePattern);

        for (String date : testDates) {
            Matcher matcher = pattern.matcher(date);
            if (matcher.matches()) {
                System.out.println(date + " - дата в формате dd/mm/yyyy");
            } else {
                System.out.println(date + " - не дата в формате dd/mm/yyyy");
            }
        }
    }
}

