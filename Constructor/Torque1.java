 
 class Torque1
 {
    double m1, m2, area;
    Torque1(double M1,double M2)  //  Parameterized Constructor or Special Method or Class name Method
    {
      m1 = M1;
      m2=M2; 
    }
    void display()
    {
        area = m1+m2/m1*m2;
        System.out.println("\n\n Area of Torque is: "+area);
    }
    public static void main(String[] args)
    {
      Torque1 t = new Torque1(22, 66);
      t.display();
    }
 }
