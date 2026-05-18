import java.io.*;
import java.util.*;
class bill1
{
  String cust_name;
  int cust_no;
  float cmr,lmr,amount,unit;
  
  bill1(String cust_name,int cust_no)
  {
   System.out.println("Name:"+cust_name);
   System.out.println("Number:"+cust_no);
  }
  
  bill1(float cmr,float lmr) 
  {
   unit=cmr-lmr;
   if(unit<=100)
     amount=0;
  else if((unit>100)&&(unit<=300))
     amount=(unit-100)*2.25f;
  else if((unit>300)&&(unit<=500))
     amount=((unit-100)*2.25f)+((unit-300)*3.75f);
  else
     amount=((unit-100)*2.25f)+((unit-300)*3.75f)+((unit-500)*5.50f);
  }
 
 void display()
  {
   System.out.println("Units="+unit); 
   System.out.println("Amount="+amount); 
  }
}  
 
class bill
{
 public static void main(String args[])
 {
  bill1 ob=new bill1("Jujhdsd",1234);
  bill1 ob1=new bill1(650,450);
  ob1.display();
 }
}