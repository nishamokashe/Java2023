//WAP to calculate the Square

class Square7
{
    double side, area;
    void getdata(double S)
    {
      side = S;
    }
    void cal()
    {
        area=(side*side);
        System.out.println("\n\n Area of Square is: "+area);
    }
   class Test_Seven
   { 
     public static void main(String[] args) 
      {
       double SIDE=25;
       Square7 s = new Square7();
       s.getdata(SIDE);
       s.cal();    
      }
   } 
}