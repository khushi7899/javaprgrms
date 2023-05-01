import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
       int n;
       Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of n:");
       n=sc.nextInt();
       if(n>10)
       {
           System.out.println("Value is:" + n + " which is greater thN 10");
       }
       else if(n>0)
       {
       System.out.println("Value is:"+n+ " which is positive");
           }
       else if (n==0)
       {
               System.out.println("Value is:"+n);
       }
       else {

           System.out.println("THe value is negative which is :"+n);
    }
    }
}