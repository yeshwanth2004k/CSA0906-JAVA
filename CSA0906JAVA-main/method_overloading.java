import java.io.*;
import java.util.*;
class example
{
 int area(int a)
 {
  return a*a;
 }
 float area(float b)
 {
  return b*b;
 }
 int area(int c,int d)
 {
  return c*d;
 }

 float area(int e,float f)
 {
  return e*f;
 }
 float area(float g,float h)
 {
  return g*h;
 }
 String area(String name)
 {
  return name;
 }
}

class method_overloading
{
 public static void main(String args[])
 {
  example ob=new example();
  System.out.println(ob.area(10));
  System.out.println(ob.area(3.4f));
  System.out.println(ob.area(3,4));
  System.out.println(ob.area(5,2.5f));
  System.out.println(ob.area(2.4f,2.5f));
  System.out.println(ob.area("June"));
 }
}
    
  

