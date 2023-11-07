package org.hometask_1;


import java.util.Arrays;
import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        double sum = 0;
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
            sum+=array[i];
        }
        double average = sum/length;

        System.out.println("Среднее арифметическое массива " + Arrays.toString(array)+" равно "+average);
    }
}
