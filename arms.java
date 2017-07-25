   import.java.io.*;
   import.java.util.*;
   class ArmstrongExample{  
      public static void main(String[] args)  {  
        int c=0,a,t;  
        int n=153;
        t=n;  
        while(n>0)  
        {  
        a=n%10;  
        n=n/10;  
        c=c+(a*a*a);  
        }  
        if(t==c)  
        System.out.println("armstrong number");   
        else  
            System.out.println("Not armstrong number");   
       }  
    }  
    
