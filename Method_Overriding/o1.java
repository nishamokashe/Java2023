/* Method Overriding in java 

Method overloading in java is a feature that allows a subclass to provide a specific implementation of method that is already defined in its super class. The main points about method overloading is : 

1) Same Method Name : The subclass method must have same name as method in the super class.  

2) Same Parameters : The subclass method must have the same parameter list as the method in the super class. 

3) Inheritance : There must be an inheritance relationship between superclass and subclass.   */   

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
      System.out.println("Dog makes sound!");
   } 
}
class Main1
{
   public static void main(String args[])
   {
      Animal a = new Animal();
      a.sound();     
  
      Dog d = new Dog();
      d.sound();  
   }
}