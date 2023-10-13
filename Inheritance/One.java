//WAP to understand the concept of  Inheritance.

class A
{
   int a,b;
   void getdata()
    {
        a=10;
        b=20;
    }
}
class Z extends A
{
    int add;
    void sum()
    {
        add = a+b;
        System.out.println("\n \n Addition to two number is"+add);
    }
public static void main(String args[])
  {
    Z z = new Z();
    z.getdata();
    z.sum();
  }
}