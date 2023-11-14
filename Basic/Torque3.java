class Torque3
{
    double m1=12, m2=6, area;
    void cal()
    {
      area = m1+m2/m1*m2; 
    }
    void display()
    {
      System.out.println("\n\n Area of Torque is: "+area);  
    }
   class Test_torque
   {
      public static void main(String[] args)
       {
        Torque3 t = new Torque3();
        t.cal();
        t.display();   
       }
   }    
}    
