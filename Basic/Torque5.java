class Torque5
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
    class Test_Five
    {
      public static void main(String[] args)
       {
        Torque5 t = new Torque5();
        t.getdata(16,9);
        t.display();   
       }
    }    
}    
