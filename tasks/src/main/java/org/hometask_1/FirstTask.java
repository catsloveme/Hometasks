package org.hometask_1;


import java.util.Arrays;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        int length = 10;
        int[] array = new int[length];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        int tmp;
        for (int i = 0; i < length; ++i) {
            for (int j = 0; j < length - j; ++j) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
