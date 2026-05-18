import java.io.*;
import java.util.*;
class one
{
 public static void main(String args[])
 {int n,i=1,sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter n value:");
  n=sc.nextInt();
  do
  {
    sum=sum+i;
    i=i+1;
  }
  while(i<=n);
  System.out.print("Sum="+sum);
  }

 }
  

  
 