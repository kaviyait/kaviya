import.java.io.*;
import java.util.*;
class Gcd
    {
        public static void main(String args[])throws Exception
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the First no : ");
            int n0=sc.nextInt();
            System.out.print("Enter the Second no : ");
            int n1=sc.nextInt();
            int r;
             
            while(n1 != 0)
            {
                r = n0 % n1;
                n0 = n1;
                n1 = r;
            }
            System.out.print("GCD = "+n0);
        }
    }
