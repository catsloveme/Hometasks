package org.hometask_4;

import java.util.Collections;
import java.util.List;

public class StreamTasks {
    public static void main(String[] args) {
        List<Integer> intValues = List.of(100, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 0, 0);
        List<String> strValues = List.of("java", "java", "C++", "python", "pascal", "java", "kotlin", "java");
        List<String> strDecimalValues = List.of("5", "4", "3", "2", "1", "0", "2", "5");

        firstTask(intValues);
        secondTask(strValues);
        thirdTask(intValues);
        fourthTask(strValues);
        fifthTask(strValues);
        sixthTask(strValues);
        seventhTask(strDecimalValues);
        eighthTaskFirstVersion(intValues);
        eighthTaskSecondVersion(intValues);

    }

    public static void firstTask(List<Integer> intValues) {
        System.out.println("Task #1");
        List<Integer> values = List.copyOf(intValues);
        double avg = values.stream()
                .mapToInt(x -> x)
                .average().orElse(0);
        System.out.println("Среднее значение списка: " + intValues + " равно " + avg);
    }

    public static void secondTask(List<String> strValues) {
        System.out.println("\nTask #2");
        List<String> valuesUpper = List.copyOf(strValues);
        valuesUpper = valuesUpper.stream()
                .map(String::toUpperCase)
                .toList();

        List<String> valuesLower = valuesUpper.stream()
                .map(String::toLowerCase)
                .toList();

        System.out.println("Исходный список строк: " + strValues + " был преобразован в \n" +
                "-список строк в верхнем регистре:  " + valuesUpper +
                "\n-список строк в нижнем регистре " + valuesLower);
    }

    public static void thirdTask(List<Integer> intValues) {
        System.out.println("\nTask #3");
        List<Integer> values = List.copyOf(intValues);
        int sumEvenValues = values.stream()
                .mapToInt(x -> x)
                .filter(x -> x % 2 == 0)
                .sum();

        int sumOddValues = values.stream()
                .mapToInt(x -> x)
                .filter(x -> x % 2 != 0)
                .sum();
        System.out.println("Исходный список: " + intValues
                + "\nСумма четных чисел " + sumEvenValues
                + "\nСумма нечетных чисел " + sumOddValues);
    }

    public static void fourthTask(List<String> strValues) {
        System.out.println("\nTask #4");
        List<String> values = List.copyOf(strValues);
        values = values.stream()
                .distinct()
                .toList();

        System.out.println("Исходный список строк: " + strValues + " был преобразован в \n" +
                "-список без повторяющихся значений:  " + values);
    }

    public static void fifthTask(List<String> strValues) {
        System.out.println("\nTask #5");
        List<String> values = List.copyOf(strValues);
        long count = values.stream()
                .filter(x -> x.startsWith("p"))
                .count();

        System.out.println("Количество значений, начинающихся с буквы \"p\",\nв исходном списоке строк: " + strValues
                + "\nравно " + count);
    }

    public static void sixthTask(List<String> strValues) {
        System.out.println("\nTask #6");
        List<String> valuesOrder = List.copyOf(strValues);
        valuesOrder = valuesOrder.stream()
                .sorted()
                .toList();

        List<String> valuesReverseOrder = List.copyOf(strValues);
        valuesReverseOrder = valuesReverseOrder.stream()
                .sorted(Collections.reverseOrder())
                .toList();

        System.out.println("Исходный список строк: " + strValues
                + "\nбыл отсортирован \n-по возрастанию: " + valuesOrder
                + "\n-по убыванию " + valuesReverseOrder);
    }

    public static void seventhTask(List<String> strValues) {
        System.out.println("\nTask #7");
        List<String> values = List.copyOf(strValues);
        int max = values.stream()
                .map(Integer::parseInt)
                .mapToInt(x -> x)
                .max().getAsInt();

        int min = values.stream()
                .map(Integer::parseInt)
                .mapToInt(x -> x)
                .min().getAsInt();

        System.out.println("Исходный список строк: " + strValues
                + "\nмаксимальное значение: " + max
                + "\nминимальное значение: " + min);
    }

    public static void eighthTaskFirstVersion(List<Integer> intValues) {
        System.out.println("\nTask #8.1 without duplicate values");
        List<Integer> values = List.copyOf(intValues);
        int firstMax = values.stream()
                .mapToInt(x -> x)
                .max().getAsInt();
        int secondMax = values.stream()
                .filter(x -> x != firstMax)
                .mapToInt(x -> x)
                .max().getAsInt();
        int firstMin = values.stream()
                .mapToInt(x -> x)
                .min().getAsInt();
        int secondMin = values.stream()
                .filter(x -> x != firstMin)
                .mapToInt(x -> x)
                .min().getAsInt();
        System.out.println("Исходный список: " + intValues
                + "\nвторое максимальное значение " + secondMax
                + "\nвторое минимальное значение " + secondMin);
    }

    public static void eighthTaskSecondVersion(List<Integer> intValues) {
        System.out.println("\nTask #8.2 with duplicate values");
        List<Integer> values = List.copyOf(intValues);
        values = values.stream()
                .sorted()
                .toList();

        System.out.println("Исходный список: " + intValues
                + "\nвторое максимальное значение " + values.get(values.size() - 2)
                + "\nвторое минимальное значение " + values.get(1));
    }
}
