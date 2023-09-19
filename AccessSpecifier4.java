class AccessSpecifier4
{
  public
      int x = 1;
  public
      void display()
       {
        System.out.println("x = " +x);
       }    
     public static void main(String[] args)
       {
         AccessSpecifier4 as = new AccessSpecifier4();
         as.display();
         System.out.println("x="+as.x);
       }
}
