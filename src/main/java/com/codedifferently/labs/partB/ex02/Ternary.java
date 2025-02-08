package com.codedifferently.labs.partB.ex02;

public class Ternary {

    public static String ternary(){
        String response = "";
        /* Put your code here */
      String x = "1";
      String y = "";
      String question = x.equals("1") ? "Yes":"No";
      response += (y += 90);
        question = y.equals("90") ? "Yes" : "No";
      response += (x += 19);
      question = x.equals("20") ? "Yes" : "No";
      response += (y += -29);
      System.out.println("value of y is " + y);
      System.out.println("value of x is " + x);
        return response;

    }
    public static void main(String args[]) {
        String output = ternary();
        System.out.println(output);

    }
}
