import java.io.*;
import java.util.*;
class add
{
 int a,b,c;
 add()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a and b values:");
  a=sc.nextInt();
  b=sc.nextInt();
  c=a+b;
  }
 void display()
 {
  System.out.println("Sum="+c);
 } 
}

class sum_constructor
{
 public static void main(String args[])
 {
  add ob=new add();
  ob.display();
 }
}