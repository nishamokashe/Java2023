
// 2. Super can be used to invoked immediate parent class method.

public class Animal1
{ 
  void bark()
  {
    System.out.println("Barksss...");
  }
}
class Fox1 extends Animal1
{
    void bark()
    {
      System.out.println("Barking....!!!!");    
    }
    void eat()
    {
      System.out.println("Eating....!!!!!");
    }
    void work()
    {
      eat();;
      bark();;
      super.bark();
    }
    public static void main(String[] args) 
    {
      Fox1 f = new Fox1();
      f.work();    
    }
}