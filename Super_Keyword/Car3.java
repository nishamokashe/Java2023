// 2. Super() can be used to invoked parent class constructor.
class Car3
{
    Car3()
  {
    System.out.println("\n Car class Constructur is Executed");
  }
}
class Tigor2 extends Car3
{
     Tigor2()
    {
        super();   //Note: suoer() is added in each class Construter automatically by complier if there is no super().
        System.out.println("\n Tigor class Constructur is Executed");
    }
    
    public static void main(String[] args) 
    {
      Tigor2 t = new Tigor2();
    }
}