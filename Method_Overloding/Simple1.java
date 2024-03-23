// 1) Method Overloding By Changing the Number of Prameter 
public class Simple1 
{
      void sum(int x, int y)
      {
        System.out.println(x+y);
      }
      void sum(int a, int b, int c)
      {
        System.out.println(a+b+c);
      }
      public static void main(String[] args) 
      {
        Simple1 s1 = new Simple1();
        s1.sum(22, 23);
        s1.sum(2,3,4);  
      }
}
