/* Java Abstraction 
Abstarction is nothing but the concept of hiding the complex implementation details and showing only the essential features of an object Which is used to reduce the programming complexity and effort. By using abstraction, we can focus on what an object does rather than how it does. 

1) Abstract class

2) interface 

1) Abstract Class 
An abstract class cannot be instantiated (we cant create an object of it). It can have abstract methods (methods without body) that must be implemented by its subclasses, and it can also have regular methods with body. 

  
2) Interface 
An interface is a reference type in java, similar to class that contain only constants, method signatures, default methods, static methods and nested types. Methods in interfaces are by default abstract. */ 

abstract class Animal 
{
   public abstract void sound(); 
   public void sleep()
   {
       System.out.println("This is sleep method in Animal Abstarct class");
   }
} 

class Dog extends Animal 
{
    public void sound()
    {
        System.out.println("Dog Barks");
    }
}

class Main
{
   public static void main(String args[])
   {
       Dog d = new Dog(); 
       d.sound(); 
       d.sleep(); 
   }
}

/* 
   1] Animal is an abstract class with an abstract method sound() and regular method sleep. 

   2] Dog is a subclass of Animal that provides implementation of the sound() method. 

*/ 