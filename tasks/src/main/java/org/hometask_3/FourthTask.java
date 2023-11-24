package org.hometask_3;


import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String firstSubString = scanner.nextLine();
        String secondSubString = scanner.nextLine();

        String newStr = str.replaceAll(firstSubString, secondSubString);

        System.out.println(newStr);
    }
}