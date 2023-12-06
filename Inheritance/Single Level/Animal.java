class Animal
{
    void makeSound()
    {
       System.out.println(" The Animal Make a Sound.");
    }
}
class Cat extends Animal
{
    void makeSound()
    {
       System.out.println(" The Cat Meow.");
    }
  public static void main(String[] args) 
  {
    Cat c = new Cat();  
    c.makeSound();
  }  
}
