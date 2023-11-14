 
 class Torque
 {
    double m1, m2, area;
    Torque()     //  default Constructor or Special Method or Class name Method
    {
      m1=22;
      m2=66;
    }
    void display()
    {
        area = m1+m2/m1*m2;
        System.out.println("\n\n Area of Torque is: "+area);
    }
    public static void main(String[] args)
    {
      Torque t = new Torque();
      t.display();
    }
 }
