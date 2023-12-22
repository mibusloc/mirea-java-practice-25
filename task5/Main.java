package ru.mirea.lab25.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String[] passwords = {"F032_Password", "TrySpy1", "smart_pass", "A007", "1234"};

        for (String password : passwords) {
            if (isStrongPassword(password)) {
                System.out.println(password + " - надежный пароль");
            } else {
                System.out.println(password + " - не надежный пароль");
            }
        }
    }

    public static boolean isStrongPassword(String password) {
        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d_]{8,}$";

        Pattern regex = Pattern.compile(pattern);

        Matcher matcher = regex.matcher(password);

        return matcher.matches();
    }
}

