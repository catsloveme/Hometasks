package org.hometask_3;


import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();

        if (firstName.equals(secondName)) {
            System.out.println("Являются тёзками");
        } else {
            System.out.println("Не являются тёзками");
        }
    }
}
