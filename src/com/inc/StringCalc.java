package com.inc;

import java.util.ArrayList;
import java.util.List;

public class StringCalc {

    public int add(String numbers) {
        if (numbers.isEmpty()) return 0;

        String delimiter = "[,\n]";
        String numSection = numbers;

        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterIndex);
            numSection = numbers.substring(delimiterIndex + 1);
        }

        String[] parts = splitNumbers(numSection, delimiter);
        List<Integer> negatives = new ArrayList<>();
        int sum = 0;

        for (String num : parts) {
            int n = Integer.parseInt(num);
            if (n < 0) negatives.add(n);
            sum += n;
        }

        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("Negative numbers not allowed: " + negatives);
        }

        return sum;
    }

    private String[] splitNumbers(String input, String delimiter) {
        return input.split(delimiter);
    }
}
