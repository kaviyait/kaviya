 import.java.io.*;
 import java.util.*;
 static void printFirstRepeating(int arr[])
    {
       
        int m = -1;
 
        
        HashSet<Integer> set = new HashSet<>();
 
    
        for (int i=arr.length-1; i>=0; i--)
        {
         
            if (set.contains(arr[i]))
                m = i;
 
            else  
                set.add(arr[i]);
        }
 
        if (m != -1)
          System.out.println("The first repeating element is " + arr[m]);
        else
          System.out.println("There are no repeating elements");
    }
 
 
    public static void main (String[] args) throws java.lang.Exception
    {
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        printFirstRepeating(arr);
    }
}
