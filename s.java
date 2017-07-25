import.java.io.*;
import java.util.Scanner;
public class Sum_Odd_Even 
{
    public static void main(String[] args) 
    {
        int n, sE = 0, sO = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in array:");
        n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 == 0)
            {
                sE = sE + a[i];
            }
            else
            {
                sO = sO + a[i];
            }
        }
        System.out.println("Sum of Even Numbers:"+sE);
        System.out.println("Sum of Odd Numbers:"+sO);
    }
}
