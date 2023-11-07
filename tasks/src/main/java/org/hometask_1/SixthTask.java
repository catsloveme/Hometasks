package org.hometask_1;

import java.util.Scanner;

public class SixthTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        int index;
        while (true) {
            index = scanner.nextInt();
            System.out.println(array[index]);
        }
    }
}
