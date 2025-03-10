// Overriding with super keyword 
class Animal 
{
   public void sound() 
   {
      System.out.println("Animal makes sound!");
   } 
}
class Dog extends Animal 
{
   public void sound() 
   {
      super.sound(); 
      System.out.println("Dog makes sound!");
   } 
}
class Main1
{
   public static void main(String args[])
   {
      Dog d = new Dog();
      d.sound();  
   }
}