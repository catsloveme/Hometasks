package org.hometask_3;


import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int lengthMute = str.length() - 2;
        int lastIndexStr = str.length() - 1;

        String symbol = "*";
        String mute = symbol.repeat(lengthMute);

        String censor = str.charAt(0) + mute + str.charAt(lastIndexStr);
        System.out.println(censor);

    }
}
