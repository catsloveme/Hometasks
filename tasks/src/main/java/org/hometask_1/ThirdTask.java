package org.hometask_1;


import java.util.Arrays;
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = 10;
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        int[] firstArray= Arrays.copyOf(array,5);
        int[] secondArray=Arrays.copyOfRange(array,5,10);

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
    }
}
