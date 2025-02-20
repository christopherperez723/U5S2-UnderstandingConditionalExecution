package com.codedifferently.labs.partC;

public class AlgoChallenge {
     /* Problem 1
    Determine if the given string contains between 1 and 3 'e' characters.
    Only if the string contains between 1 and 3 'e' characters; return true.
    containE("Hello") --> true
    containE("Heelle") --> true
    containE("Heelele") --> false
     */


    public static Boolean containE(String str) {
        
        String target = "e";
        Boolean find = str.contains(target);
        if (find) {
            System.out.println("string contains" + target);
        }else {
            find = false;
            System.out.println("String dose not contain e" + target);
        }
        
        return null;
    }

     /* Problem 2
    An elementary school teacher needs your help to create new strings for a fun activity they have planned.
     You will be provided a non-empty string and a number N. To create a new string, you will start with the character 0.
     Next you will add every Nth character of the string to the new string.

     Return the new string.

     Tip: If N is 3, use char 0, 3, 6 ... and so on. N is 1 or more.

     Example:
     everyOther("Miracle", 2) --> "Mrce"
     everyOther("abcdefg", 2) --> "aceg"
     everyOther("abcdefg", 3) --> "adg"
     */

    public static String everyOther(String str, int n) {
        String targets = String.valueOf(n);
        Boolean find = str.contains(targets);
        if (find) {
            System.out.println("string contains" + targets);
            String result = " "+ targets;
        }else {
            find = false;
            System.out.println("String dose not contain " + targets);
        }

        return null;
    }


}
