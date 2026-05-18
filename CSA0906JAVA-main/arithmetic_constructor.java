import java.io.*;
import java.util.*;
class arith
{
 int a,b,sum,dif,prod,quo;
 arith()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a and b values:");
  a=sc.nextInt();
  b=sc.nextInt();
  sum=a+b;
  dif=a-b;
  prod=a*b;
  quo=a/b;
  }
 void display()
 {
  System.out.println("Sum="+sum);
  System.out.println("Difference="+dif);
  System.out.println("Product="+prod);
  System.out.println("Quotient="+quo);
 }
}

class arithmetic_constructor
{
 public static void main(String args[])
 {
  arith ob=new arith();
  ob.display();
 }
}