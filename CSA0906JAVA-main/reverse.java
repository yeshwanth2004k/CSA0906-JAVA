import java.io.*;
import java.util.*;
class reverse
{
 public static void main(String args[])
 {
  int n,r,t=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Number:");
  n=sc.nextInt();
  while(n!=0)
  {
   r=n%10;
   t=(t*10)+r;
   n=n/10;
  }
  System.out.println("Reversed number="+t);
 }
}
   