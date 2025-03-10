// Overriding with different return type
class Animal 
{
   public Animal getAnimal()
   {
      return this; 
   } 
}

class Dog extends Animal
{
   public Dog getAnimal()
   {
      return this; 
   }
}

class Main2
{
   public static void main(String args[])
   {
       Dog d = new Dog(); 
       d.getAnimal(); 
   }
}
/* 
  In java, we can override a method with different return type if return type is a subclass of the type declared in the original method. (Covariant return type)
*/