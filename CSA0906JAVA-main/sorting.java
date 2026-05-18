import java.io.*;
import java.util.*;
class A
{  
public static void main(String args[])  
{    
 int i,j,n,M,N,t,max,min,sum,dif; 
 int x[]=new int[20];
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter no.of elements:");
 n=sc.nextInt();
 System.out.println("Enter M and N value:");
 M=sc.nextInt();
 N=sc.nextInt();
 System.out.println("Enter the values:");
 for(i=0;i<n;i++)
 { 
   x[i]=sc.nextInt();
 }
 for(i=0;i<n;i++)
 {
  for(j=i+1;j<n;j++)
  {
   if(x[i]>x[j])
   {
     t=x[i];
     x[i]=x[j];
     x[j]=t;
   }
  }
 }
 sum=x[-M]+x[N];
 dif=x[-M]-x[N];
 System.out.println("SUM="+sum);
 System.out.println("DIFFERNCE="+dif);
 }
}
 
   