package com.codedifferently.labs.partB.ex01;

import java.util.Scanner;

public class CheckGrades {

    public static String checkGrades() {
        String response = "Math, Science, Geography, English, Java";

        String checkGrades = "Math, Science, Geography, English, Java";
        int num = Integer.parseInt(checkGrades);
        int adnum = Integer.parseInt("Math + Science + Geography + English + Java");
        System.out.println("Average Grade is:" + "adnum");

        //if (Math === 80 || Science === 80 || Geography === 80 || English === 80 || Java === 80){
        //return String = ""What was your grade" + 80";


        return response;
    }

    public static void main(String args[]) {
        String gradesOutput = checkGrades();
        System.out.println(gradesOutput);
    }
}