import java.io.*;
import java.util.*;
class day
{
 public static void main(String args[])
 {
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter n value:");
  n=sc.nextInt();
  switch(n)
  {
   case 1:
          System.out.println("It is Monday");
          break;
   case 2:
          System.out.println("It is Tuesday");
          break;
   case 3:
          System.out.println("It is Wednesday");
          break;
   case 4:
          System.out.println("It is Thursday");
          break;
   case 5:
          System.out.println("It is Friday");
          break;
   case 6:
          System.out.println("It is Saturday");
          break;
   case 7:
          System.out.println("It is Sunday");
          break;
   default:
          System.out.println("KINDLY CHECK THE INPUT AND TRY AGAIN!");
    }
  }
}
 