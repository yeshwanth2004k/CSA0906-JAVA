import java.io.*;
import java.util.*;
class bank
{
 int cus_no,initial,total;
 void getdata()
 {
  Scanner s = new Scanner(System.in);
  System.out.println("Enter the customer id:");
  cus_no = s.nextInt();
  System.out.println("Enter amount in bank:");
  total = s.nextInt();
 }
 void deposit()
 {
  Scanner s = new Scanner(System.in);
  System.out.println("Enter amount to be deposited:");
  initial=s.nextInt();
  total+=initial;
 }
 void withdraw()
 {
  Scanner s = new Scanner(System.in);
  if(total>=500)
   {
    System.out.println("Enter amount to withdraw:");
    initial=s.nextInt();
    total-=initial;
   }
  else
   System.out.println("LOW BALANCE------CANNOT WITHDRAW"); 
 }
 void balance()
 {
  System.out.println("Customer id:"+cus_no);
  System.out.println("Balance:"+total);
  }
}

class Bank_Account
{
 public static void main(String args[])
 { 
  int choice; 
  Scanner s = new Scanner(System.in);
  bank ob=new bank();
  ob.getdata();
  System.out.println("1->DEPOSIT  2->WITHDRAW  3->CHECK BALANCE");
  choice=s.nextInt();
  Switch(choice)
  {
   case 1:
          ob.deposit();
          break;  
   
  case 2:
          ob.withdraw();
          break;  
  
  case 3:
          ob.balance();
          break;  
   
  default:
         System.out.println(Enter a valid input choice");
  }
 }
}
         


}