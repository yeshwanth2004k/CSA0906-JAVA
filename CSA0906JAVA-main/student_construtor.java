import java.io.*;
import java.util.*;
class student
{
 int stu_reg,a,b,c,d,e;
 float total,avg;
 String stu_name;
 
 student(int reg,String name)
 {
  stu_reg=reg;
  stu_name=name;
  System.out.println("------------------------------------------------------------------------------------");
  System.out.println("Name--->"+stu_name);
  System.out.println("Register Number--->"+stu_reg);
 }
 
 student(int m1,int m2,int m3,int m4,int m5)
 {
  a=m1;
  b=m2;
  c=m3;
  d=m4;
  e=m5;
 }
 
 void calculate()
  {
  total=a+b+c+d+e;
  avg=total/5;
  }
 
 void display()
 {
  System.out.println("Total--->"+total);
  System.out.println("Average--->"+avg);
  if((a<40)||(b<40)||(c<40)||(d<40)||(e<40))
     {System.out.println("Fail");
     }
  else
  {
  if(avg>90)
    {System.out.println("A+");}
  else if(avg>=80)
    {System.out.println("A");}
  else if(avg>=70)
    {System.out.println("B");}
  else if(avg>=60)
    {System.out.println("C");}
  else
    {System.out.println("E");}
   }
 System.out.println("------------------------------------------------------------------------------------");
  
 }
}

class student_constructor
{
 public static void main(String args[])
 {
  student ob1=new student(1234567,"Schifrin Beckham");
  student ob2=new student(90,90,90,90,90);
  ob2.calculate();
  ob2.display();
 }
}
   
  
  	