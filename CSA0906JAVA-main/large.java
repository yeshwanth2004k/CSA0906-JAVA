import java.io.*;
import java.util.*;
class large
{  
public static void main(String args[])  
{    
int a[]=new int[20];
int n,i,m,j,t,max=0;
Scanner s=new Scanner(System.in);
System.out.println("enter number of elements");
n=s.nextInt();
System.out.println("enter elements");
for(i=1;i<=n;i++){
a[i]=s.nextInt();
}
for(i=1;i<=n;i++){
System.out.println(a[i]);}
for(i=1;i<=n;i++){
for(j=i+1;j<=n;j++);
{
if(a[i]>a[j]){
t=a[i];
a[i]=a[j];
a[j]=t;
}
System.out.println(a[j]);
}  } 
System.out.println("nth number is");
m=s.nextInt();
for(i=0;i<=m;i++){
max=a[m-1];
}
System.out.println("nth number is =" +max);


}}
