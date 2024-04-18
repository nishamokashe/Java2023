
// 1. Super can be used to refer immediate parent class instance variable.

public class Animal 
{ 
  String colour = "Red";  
}
class Fox extends Animal
{
    String colour = "Marron";
    void display()
    {
        System.out.println(colour);
        System.out.println(super.colour);
    }
    public static void main(String[] args) 
    {
      Fox f = new Fox();
      f.display();    
    }
}