import java.io.*;
import java.util.*;
class employee
{
 public static void main(String args[])
 {
  String employee_name,designation;
  int id;
  float base_salary,gross_salary,net_salary,hra,da,ta,ca,deduction,pf,home_loan,lic,bonus,salary,annual_salary,tax;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Employee name,designation and id:");
  employee_name=sc.nextLine();
  designation=sc.nextLine();
  id=sc.nextInt();
  System.out.println("Enter the base salary:");
  base_salary=sc.nextFloat();
  System.out.println("Enter home loan amount and LIC amount:");
  home_loan=sc.nextFloat();
  lic=sc.nextFloat();
  hra=base_salary*(20.0f/100.0f);
  da=base_salary*(20.0f/100.0f);
  ta=base_salary*(100.0f/100.0f);
  ca=base_salary*(5.0f/100.0f);
  gross_salary=base_salary+hra+da+ta+ca;
  pf=gross_salary*(12.0f/100.0f);
  deduction=pf+home_loan+lic;
  net_salary=gross_salary-deduction;
  if(net_salary<10000)
  {
   bonus=net_salary*(5.0f/100.0f);
   salary=net_salary+bonus;
  }
  else if(net_salary<30000)
  {
   bonus=net_salary*(10.0f/100.0f);
   salary=net_salary+bonus;
  }
  else if(net_salary<50000)
  {
   bonus=net_salary*(20.0f/100.0f);
   salary=net_salary+bonus;
  }
  else
  {
   bonus=net_salary*(30.0f/100.0f);
   salary=net_salary+bonus;
  }
  annual_salary=net_salary*12.0f;
  if(annual_salary<=250000)
  {
   tax=0;
  }
  else if(annual_salary<=500000)
  {
   tax=annual_salary*(5.0f/100.0f);
  }
  else if(annual_salary<=750000)
  {
   tax=annual_salary*(10.0f/100.0f);
  }
  else if(annual_salary<=1000000)
  {
   tax=annual_salary*(15.0f/100.0f);
  }
  else 
  {
   tax=annual_salary*(20.0f/100.0f);
  }
  System.out.println(".....................................................................................................");
  System.out.println("...................................      Employee Report   ..........................................");
  System.out.println("Employee Name:"+employee_name);
  System.out.println("Employee ID:"+id);
  System.out.println("Base Salary:"+base_salary);
  System.out.println("hra:"+hra+"\tda:"+da+"\tta:"+ta+"\tca:"+ca);
  System.out.println("Gross Salary:"+gross_salary);
  System.out.println("Pf:"+pf);
  System.out.println("Home Loan:"+home_loan);
  System.out.println("LIC Amount:"+lic);
  System.out.println("Deduction:"+deduction);
  System.out.println("Net Salary:"+net_salary);
  System.out.println("Bonus:"+bonus);
  System.out.println("Salary after crediting Bonus:"+salary);
  System.out.println("Annual Salary:"+annual_salary);
  System.out.println("Tax amount:"+tax);
  System.out.println("Amount after paying tax="+(annual_salary-tax));
  System.out.println("....................................................................................................");
  }
}
  
  
  
  
  
  
  
  
  
   
  