//WAP to calculate the Square

class Square3
{
    double side=25, area;
    void cal()    // cal() definition
    {
      area=(side*side);
    }
    void display()    // display() definition
    {
        System.out.println("\n\n Area of Square is: "+area);
    }
    class Test
    {
      public static void main(String[] args) 
       {
        Square3 s = new Square3();   // Instance or Object Creation
         s.cal();         //Method call or Massage Passing
         s.display();    //Method call or Massage Passing
       }
    }  
}