abstract class MotorBike 
{
  abstract void brake();
}

class SportsBike extends MotorBike 
{    
  // implementation of abstract method
  public void brake() 
  {
    System.out.println("\n SportsBike Brake \n");
  }
}
class MountainBike extends MotorBike 
{   
  // implementation of abstract method
  public void brake() 
  {
    System.out.println("\n MountainBike Brake");
  }
}
class Main 
{
  public static void main(String[] args) {
    MountainBike m1 = new MountainBike();
    m1.brake();
    SportsBike s1 = new SportsBike();
    s1.brake();
  }
}