class Torque7
{
    double m1, m2, area;
    void getdata(double m, double n )
    {
       m1 = m;
       m2 = n; 
    }
    void display()
    {
       area = m1+m2/m1*m2; 
      System.out.println("\n\n Area of Torque is: "+area);  
    }
    class Torque_Seven
    {
      public static void main(String[] args)
       {
        double M1=19, M2=9;
        Torque7 t = new Torque7();
        t.getdata(M1,M2);
        t.display();   
       }
    }    
}    
