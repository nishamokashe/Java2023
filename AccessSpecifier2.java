class DemoAccess2
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
      DemoAccess2 dm = new DemoAccess2();
      dm.display();
      System.out.println("x ="+dm.X);    
    }
}