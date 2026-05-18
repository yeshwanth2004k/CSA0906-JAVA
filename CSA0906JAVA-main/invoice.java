import java.io.*;
import java.util.*;
class bill
{
 bill(name[],qty[],price[])
 {
  int total=0;
  int amount[]=new int[10];
  int qty[]=new int[10];
  int price[]=new int[10];
  String name[]=new String[10];
  for(int i=0;i<5;i++)
   {
   System.out.println(name[i]);
   System.out.println(qty[i]);
   System.out.println(price[i]);
   amount[i]=qty[i]*price[i];
   System.out.println(amount[i]);
   total=total+amount[i];
   }
   System.out.println("Total="+total);
 }
}

class invoice
{
 public static void main(String args[])
 {
  int amount[]=new int[10];
  int qty[]=new int[10];
  int price[]=new int[10];
  String name[]=new String[10]; 
  Scanner sc=new Scanner(System.in);
  for(i=0;i<5;i++)
  {
   System.out.println("Enter Item"+i+":");
   name[i]=sc.next();
  } 
  for(i=0;i<5;i++)
  {
   System.out.println("Enter "+i+":");
   name[i]=sc.next();
  } 
}
}

 
  