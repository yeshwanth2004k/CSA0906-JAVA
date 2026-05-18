class F
{
 int x=5;
 void disp()
 {
  System.out.println(x);
 }
}

interface M1
{
 int y=10;
 public void disp1();
}

interface M2
{
 int z=15;
 public void disp2();
}

class C extends F implements M1,M2
{
 public void disp1()
 {
  System.out.println(y);
 }
 public void disp2()
 {
  System.out.println(z);
 }
}

class Multiple
{
 public static void main(String args[])
 {
  C ob=new C();
  ob.disp();
  ob.disp1();
  ob.disp2();
 }
}
  
  