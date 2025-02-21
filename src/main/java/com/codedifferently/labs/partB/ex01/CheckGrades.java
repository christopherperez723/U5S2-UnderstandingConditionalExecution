package com.codedifferently.labs.partB.ex01;

import java.util.Scanner;

public class CheckGrades {

    public static String checkGrades() {
        String response = " ";
        String Math = "80";
        String Science = "75";
        String Geography = "80";
        String English = "75";
        String Java = "80";
        int total = Integer.parseInt(Math + Science + Geography + English + Java);
        String Average = String.valueOf(total /= 5);
        System.out.println("Average grade is " + Average );




        return response;
    }

    public static void main(String args[]) {
        String gradesOutput = checkGrades();
        System.out.println(gradesOutput);
    }
}