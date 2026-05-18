import java.io.*;
import java.util.*;
class student
{
 String name;
 int regno;
 void s(String stuname,int reg)
 {
  name=stuname;
  regno=reg;
 }
}

class testmark extends student
{
 int m1,m2,m3;
 void tmarks(int maths,int phy,int chem)
 {
  m1=maths;
  m2=phy;
  m3=chem;
 }
}

interface sportsmark
{
 public void smarks();
}

class result extends testmark implements sportsmark
{
 void display()
 {
 System.out.println("-------------------------------------------------------");
 System.out.println("Name:"+name);
 System.out.println("Reg.no:"+regno);
 System.out.println("MATHS---->"+m1);
 System.out.println("PHYSICS---->"+m2);
 System.out.println("CHEMISTRY---->"+m3);
 }
 public void smarks()
 {
  System.out.println("Sports mark=90");
  System.out.println("-------------------------------------------------------");
 }
}

class hybrid1
{
 public static void main(String args[])
 {
  result r1=new result();
  r1.s("Rio",12345);
  r1.tmarks(90,98,89);
  r1.display();
  r1.smarks();
 }
}