package ru.mirea.lab25.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String[] testEmails = {"user@example.com", "root@localhost", "random@@@com.ru", "@your.ru", "Just A String"};

        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailPattern);

        for (String email : testEmails) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println(email + " - допустимый e-mail адрес");
            } else {
                System.out.println(email + " - не допустимый e-mail адрес");
            }
        }
    }
}

