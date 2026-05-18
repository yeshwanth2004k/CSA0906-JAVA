import java.io.*;
import java.util.*;
class report
{ 
 String name,regno;
 int x,y,z;
 float avg;
 void getdata()
 {
 Scanner s = new Scanner(System.in);
 System.out.println("Enter name and reg number:");
 name=s.nextLine();
 regno=s.nextLine();
 System.out.println("enter the three subject marks:");
 x=s.nextInt();
 y=s.nextInt();
 z=s.nextInt();
 }
 void calculation()
 {
 avg=(x+y+z)/3;
 System.out.println("enter the average marks:"+avg);
 }
 void grade()
 {
 if(avg>90)
   System.out.println("Grade=A+");
 else if(avg>=80)
   System.out.println("Grade=B");
 else if(avg>=70)
   System.out.println("Grade=c");
 else if(avg>=60)
   System.out.println("Grade=D");
 else
   System.out.println("Grade=E");

 System.out.println(".....................................................................");
 }
 void display()
 {
  System.out.println(".....................................................................");
  System.out.println("Name---->"+name);
  System.out.println("Reg Number---->"+regno);
 }
}
 class student
  {
   public static void main(String args[])
   {
   report ob = new report();
   ob.getdata();
   ob.calculation();
   ob.display();
   ob.grade();
   }
  }
  



 
