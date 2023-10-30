/* Write a Java program to create a class called Animal with a method named move(). Create a subclass 
called Cheetah that overrides the move() method to run. */

class Animal
{
    void move()
    {
       System.out.println("Animal moves");
    }
}
class Cheetah extends Animal
{
    void move()
    {
       System.out.println("This cheetah is running!");
    }
    public static void main(String[] args)
    {
       Cheetah c = new Cheetah();
       c.move();    
    }
}