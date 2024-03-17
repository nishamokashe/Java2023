/*
 Write a Java program to create a base class Animal with methods move() and makeSound(). 
 Create two subclasses Bird and Panthera. Override the move() method in each subclass to describe
 how each animal moves. Also, override the makeSound() method in each subclass to make a specific 
 sound for each animal.
 */

 class Animal
 {
    void move()
   {
    System.out.println("Animal moves");
   }
    void makeSound()
   {
    System.out.println("Animal makes a sound");
   }
 }
  class Bird extends Animal
 {
    @Override
    void move()
   {
    System.out.println("Bird flies");   
   }
   @Override
    void makeSound()
   {
    System.out.println("Bird chire");   
   }
 }
  class Panthera extends Animal
 {
    @Override
    void move()
   {
    System.out.println("Panthera walks");
   }
   @Override
    void makeSound()
   {
      System.out.println("Panthera roars");
   }
   public static void main(String[] args) 
   {
     Animal a = new Animal();
     a.move();
     a.makeSound(); 

     Bird b = new Bird();
     b.move();
     b.makeSound();

     Panthera p = new Panthera();
     p.move();
     p.makeSound();

   }
 }
