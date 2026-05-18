import java.io.*;
import java.util.*;
class leap{
public static void main(String [] args){
int d,m,year;
Scanner s= new Scanner(System.in);
System.out.println("enter the date/month/year");
d=s.nextInt();
m=s.nextInt();
year=s.nextInt();
System.out.println(d+"/"+m+"/"+year);
if(d>0 && m>0 && year>0 && year!=0.0f){
if(year%4==0){
System.out.println("its a leap year");
}
else{
System.out.println("not a leap year");}}
else{
System.out.println("not a valid date");}
}}