class DemoAccess1
{
    private
        int X = 1;
    public
       void display()
       {
        System.out.println("x ="+X);
       }   
    public static void main(String[] args)
    {
      DemoAccess1 dm = new DemoAccess1();
      dm.display();
      System.out.println("x ="+dm.X);    
    }
}