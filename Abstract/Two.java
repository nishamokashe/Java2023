abstract class Animal
{
   abstract void flay();    
}
class Birds extends Animal
{
  // implementation of abstract method 
    void flay()
    {
        System.out.println("\n\n Birds are flaying ");
    }
}
class Reptile extends Animal
{
    // implementation of abstract method
    void flay()
    {
        System.out.println("\n\n Reptile are not flaying ");
    }
}
class Test
{
    public static void main(String[] args) 
    {
      Animal a = new Birds();   
      a.flay();    
      Animal r = new Reptile();
      r.flay();
    }
}