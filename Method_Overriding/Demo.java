class Animal
{
    public void makesound()
    {
        System.out.println("Animal Make Sound !");
    }
}
class Dog extends Animal
{
    @Override
    public void makesound()
    {
        System.out.println("Dog Barks!");
    }
    public static void main(String[] args) 
    {
        Animal a = new Animal();
        a.makesound();
        Dog d = new Dog();
        d.makesound();
    }
}


/*
 1.We have parent class Animal with method "mekasound()".
 2. "Dog" class extends "Animal" and overrides the "mekesound()" method with its implementa.
 3. in this "main()" method we create objects of both "Animal" and "Dog" classes and call the makesound() method
  on each object.
 4. When calling makesound() method on the "Dog" Object, it invokes the override method from the Dog class.
 5. When calling makesound() on the "Animal" objects,it invokes the method from the Animal class. 
 */