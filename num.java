import.java.io.*;
import java.util.Scanner;
class ReverseNumberWhile
{
   public static void main(String args[])
   {
      int n=0;
      int reversen =0;
      System.out.println("Input your number and press enter: ");
     
      Scanner in = new Scanner(System.in);
    
      n = in.nextInt();
     
      while( n != 0 )
      {
          reversen = reversen * 10;
          reversen = reversen + n%10;
          n = n/10;
      }

      System.out.println("Reverse of input number is: "+reversen);
   }
}
