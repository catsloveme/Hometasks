package tasks;

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
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
    }
}