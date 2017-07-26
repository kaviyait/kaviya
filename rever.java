import.java.io.*;
import.java.util.*;
package com.java2novice.algos;
 
public class StringRecursiveReversal {
 
    String reverse = "";
     
    public String reverseString(String str){
         
        if(str.len() == 1){
            return str;
        } else {
            reverse += str.charAt(str.len()-1)
                    +reverseString(str.substring(0,str.len()-1));
            return reverse;
        }
    }
     
    public static void main(String a[]){
        StringRecursiveReversal srr = new StringRecursiveReversal();
        System.out.println("Result: "+srr.reverseString("Java2novice"));
    }
}
