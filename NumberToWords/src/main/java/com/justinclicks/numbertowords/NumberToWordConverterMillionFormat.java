
package com.justinclicks.numbertowords;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.Map;

public class NumberToWordConverterMillionFormat {
    static ArrayList<PowerName> powersList = null;
    static Map<Integer, String> directMappings = null;

    public static String convert(int number) {
        prepareDirectMappings();
        preparePowerList();
        return convertRecursion(number, true);
    }

    private static String convertRecursion(int number, Boolean isInitialIteration) {
        if (number == 0 && isInitialIteration) {
            return "Zero";
        }

        if (directMappings.containsKey(number)) {
            return directMappings.get(number);
        }

        if (number < 100) {
            int remainder = (int) (number % 10);
            int tens = (int) (number - remainder);
            return (convertRecursion(tens, false) + " " + convertRecursion(remainder, false)).trim();
        }

        int mostSignificantPower = 2;
        String mostSignificantPowerSuffix = "";
        for (PowerName power : powersList) {
            if (number / (int) Math.pow(10, power.powerValue) == 0) {
                break;
            } else {
                mostSignificantPower = power.powerValue;
                mostSignificantPowerSuffix = power.suffix;
            }
        }

        int remainder = (int) (number % (int) Math.pow(10, mostSignificantPower));
        int powerDigit = (int) (number / (int) Math.pow(10, mostSignificantPower));
        return (convertRecursion((int) powerDigit, false) + " " + mostSignificantPowerSuffix + " " + convertRecursion((int) remainder, false)).trim();
    }

    private static void prepareDirectMappings() {
        if (directMappings == null) {
            directMappings = new HashMap<>();
            directMappings.put(0, "");
            directMappings.put(1, "One");
            directMappings.put(2, "Two");
            directMappings.put(3, "Three");
            directMappings.put(4, "Four");
            directMappings.put(5, "Five");
            directMappings.put(6, "Six");
            directMappings.put(7, "Seven");
            directMappings.put(8, "Eight");
            directMappings.put(9, "Nine");
            directMappings.put(10, "Ten");
            directMappings.put(11, "Eleven");
            directMappings.put(12, "Twelve");
            directMappings.put(13, "Thirteen");
            directMappings.put(14, "Fourteen");
            directMappings.put(15, "Fifteen");
            directMappings.put(16, "Sixteen");
            directMappings.put(17, "Seventeen");
            directMappings.put(18, "Eighteen");
            directMappings.put(19, "Nineteen");
            directMappings.put(20, "Twenty");
            directMappings.put(30, "Thirty");
            directMappings.put(40, "Fourty");
            directMappings.put(50, "Fifty");
            directMappings.put(60, "Sixty");
            directMappings.put(70, "Seventy");
            directMappings.put(80, "Eighty");
            directMappings.put(90, "Ninety");
        }
    }

    private static void preparePowerList() {
        if (powersList == null) {
            powersList = new ArrayList<PowerName>();
            powersList.add(new PowerName(2, "Hundred"));
            powersList.add(new PowerName(3, "Thousand"));
            powersList.add(new PowerName(6, "Million"));
            powersList.add(new PowerName(9, "Billion"));
        }
    }

    static class PowerName {
        int powerValue;
        String suffix;

        public PowerName(int powerValue, String suffix) {
            this.powerValue = powerValue;
            this.suffix = suffix;
        }
    }}