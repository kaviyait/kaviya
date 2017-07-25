
import java.io.*;
impoprt.java.util.*;
class lcm
{
 static void main()throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int a,b,i;
     int c1=0;
     System.out.print("Enter the first number : ");
     a=Integer.parseInt(br.readLine());
     System.out.print("\n");
     System.out.print("Enter the second number : ");
     b=Integer.parseInt(br.readLine());
     System.out.print("\n");
     c1=a*b;
     int d=c1;
     for(i=1;i<=c1;i++)
     {
         if(i%a==0 && i%b==0 && i<d)
         d=i;
        }
        System.out.println("The L.C.M : "+d);
    }
}
