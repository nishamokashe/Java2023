// 2. Super can be used to invoked parent immidate parent class method
class Car2
{
  void Show_Colour()
  {
    System.out.println("\n Car class Show_colour method is Executed");
  }
}
class Tigor1 extends Car2
{
    void Show_Colour()
    {
        super.Show_Colour();
        System.out.println("\n Tigor class Show_colour method is Executed");
    }
    void display()
    {
        System.out.println("Tigor class display method is executed");
        Show_Colour();   // Method call statement
    }
    void check()
    {
         display();  // Method call statement 
    }
    public static void main(String[] args) 
    {
      Tigor1 t = new Tigor1();
      t.check();    
    }
}