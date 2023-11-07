package org.hometask_3;

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        char[] passwordArray = password.toCharArray();
        StringBuilder newPassword = new StringBuilder();

        for (int i = 0; i < passwordArray.length; i++) {
            if (Character.isDigit(passwordArray[i])) {
                newPassword.append(++passwordArray[i]);
            } else {
                newPassword.append((int) passwordArray[i]);
            }
        }
        String newPasswordString = newPassword.toString();
        System.out.println(newPasswordString);
    }
}