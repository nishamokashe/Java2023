class Vehicle
{
    void drive()
    {
       System.out.println("Repairing a vehicle");
    }
}
class Car extends Vehicle
{
    void drive()
    {
       System.out.println("Repairing a Car");
    }
}
class Veh
{
    public static void main(String[] args)
    {
      Car c = new Car();
      c.drive();    
    }
}

