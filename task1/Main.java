package ru.mirea.lab25.task1;

import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String inputText = "Список цен: 25.98 USD, 100 RUB, 50.75 EUR, 44 ERR, 0.004 EU.";

        String usdPattern = "(\\d+\\.\\d+)\\sUSD";
        String rubPattern = "(\\d+)\\sRUB";
        String eurPattern = "(\\d+\\.\\d+)\\sEUR";

        Pattern usdRegex = Pattern.compile(usdPattern);
        Pattern rubRegex = Pattern.compile(rubPattern);
        Pattern eurRegex = Pattern.compile(eurPattern);

        Matcher usdMatcher = usdRegex.matcher(inputText);
        Matcher rubMatcher = rubRegex.matcher(inputText);
        Matcher eurMatcher = eurRegex.matcher(inputText);

        while (usdMatcher.find()) {
            System.out.println("Цена в USD: " + usdMatcher.group(1));
        }

        while (rubMatcher.find()) {
            System.out.println("Цена в RUB: " + rubMatcher.group(1));
        }

        while (eurMatcher.find()) {
            System.out.println("Цена в EUR: " + eurMatcher.group(1));
        }
    }
}

