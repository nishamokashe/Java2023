class Torque2
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
    public static void main(String[] args)
    {
       Torque2 t = new Torque2();
       t.cal();
       t.display();   
    }  
}    
