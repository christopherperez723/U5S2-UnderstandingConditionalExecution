package com.codedifferently.labs.partB.ex02;

public class Ternary {

    public static String ternary(){
        String response = "";
        /* Put your code here */
      String x = "1";
      String y = "";
      String question = x.equals("1") ? "Yes":"No";
      //response += (x = 19 && y = 90);
        //String question = x.equals("20") ? "Yes":"No";  


        return response;

    }
    public static void main(String args[]) {
        String output = ternary();
        System.out.println(output);

    }
}
