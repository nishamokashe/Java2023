/*
 Write a Java program to create a base class Vehicle with methods startEngine() and stopEngine(). 
 Create two subclasses Car and Motorcycle. Override the startEngine() and stopEngine() methods in each 
 subclass to start and stop the engines differently.
 */

class Vehical 
{
    void startEngine()
    {

    }
    void stopEngine()
    {

    }
}
class Car extends Vehical
{
    @Override
    void startEngine()
    {
        System.out.println("Car engine started !");
    }
    void stopEngine()
    {
        System.out.println("Car engine Stop! \n");
    } 
}
class Motorcycle extends Vehical
{
    @Override
    void startEngine()
    {
        System.out.println("Motorcycle engine started!");
    }
    void stopEngine()
    {
        System.out.println("Motorcycle engine Stop! \n");

    }
    public static void main(String[] args) 
    {
      Car c = new Car();
      c.startEngine();
      c.stopEngine();
      Motorcycle m = new Motorcycle();  
      m.startEngine();
      m.stopEngine();  
    }
}