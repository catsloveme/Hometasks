package org.hometask_3;


public class ThirdTask {
    public static void main(String[] args) {
        String publication = "#javaLover tic-tak #javaforever tic-tak #javaforever";
        String hashtag = "#javaforever";

        int index = publication.lastIndexOf(hashtag);
        System.out.println(index);
    }
}