class AccessSpecifier3
{
  public
      int x = 1;
  public
      void display()
       {
        System.out.println("x = " +x);
       }        
}
class TestA
{
 public static void main(String[] args)
   {
      AccessSpecifier3 as = new AccessSpecifier3();
      as.display();
      System.out.println("x="+as.x);
   }
}
