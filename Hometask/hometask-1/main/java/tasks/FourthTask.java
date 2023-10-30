package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        int sum = 0;
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
            sum+=array[i];
        }
        double average = (double) sum/length;

        System.out.println("Среднее арифметическое массива " + Arrays.toString(array)+" равно "+average);
    }
}