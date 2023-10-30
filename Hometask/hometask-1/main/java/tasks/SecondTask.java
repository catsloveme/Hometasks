package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        int tmp = array[0];
        array[0] = array[length - 1];
        array[length - 1] = tmp;

        System.out.println(Arrays.toString(array));
    }
}