    import.java.io.*;
    import.java.util.*;
    class FibonacciExample1{  
    public static void main(String args[])  
    {    
     int n0=0,n1=1,n2,i,count=10;    
     System.out.print(n1+" "+n1);//printing 0 and 1    
        
     for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
     {    
      n2=n0+n1;    
      System.out.print(" "+n2);    
      n0=n1;    
      n1=n2;    
     }    
      
    }} 
