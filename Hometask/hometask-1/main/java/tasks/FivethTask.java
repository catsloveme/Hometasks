package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class FivethTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        int tmp;
        for (int i = 0; i < length/2; i++) {
            tmp = array[i];
            array[i] = array[length-1-i];
            array[length-1-i]=tmp;
        }
        System.out.println(Arrays.toString(array));
    }
}