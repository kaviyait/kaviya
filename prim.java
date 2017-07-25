
import java.util.Scanner;
public class Prime
{
    public static void main(String args[])
    {
         int s0, s1, s2, f = 0, i, j;
         Scanner s = new Scanner(System.in);
         System.out.println ("Enter the lower limit :"); 
         s0 = s.nextInt();
         System.out.println ("Enter the upper limit :"); 
         s1 = s.nextInt();
         System.out.println ("The prime numbers in between the entered limits are :");
         for(i = s0; i <= s1; i++)
         {
             for( j = 2; j < i; j++)
             {
                 if(i % j == 0)
                 {
                     flag = 0;
                     break;
                 }
                 else
                 {
                     f = 1;
                 }
             }
             if(f == 1)
             {
                 System.out.println(i);
             }
         }
    }
}
