package com.codedifferently.labs.partA.ex01;

public class WatchMovie {
    public static String watchMovie() {
        String response ="";
        /* Your code goes here*/
        int rating = 5;
        int price = 12;

        if (price >= 12 && rating == 5){
            System.out.println("I'm interested in watching the movie");
        }else {
            System.out.println("I'm not interested in watching the movie");
        }

        return response;
    }
    public static void main(String args[]) {
        String movieOutput = watchMovie();
        System.out.println(movieOutput);

//hello
    }
}

