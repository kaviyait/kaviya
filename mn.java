import.java.io.*;
import java.util.Scanner;

public class Practice
{
   public static void main(String[]args)
    {
     Scanner keyboard = new Scanner(System.in);
     int number, i=2;
     String quit;
     boolean prime = true;



     System.out.println("Please enter a number to determine if it is prime, to quit     please enter Q.");
     number = keyboard.nextInt();

     quit = keyboard.nextLine();


     for (i=0; i<number;i++)
        {
           if ((number%2==0) || (number==1) || (number%3==0))
           {
              prime = false;
              }
           }
     if (prime==false)
        {
        System.out.println(number+" is not a prime number.");
        }
        else if(prime==true)
        System.out.println(number+" is a prime number.");
    if (quit.charAt(0)=='Q')

       { System.exit(0);}
