//WAP to calculate the Square

class Square2
{
    double side=25, area;
    void cal()   //cal() defination
    {
      area=(side*side);
    }
    void display()  //display() defination
    {
        System.out.println("\n\n Area of Square is: "+area);
    }
    public static void main(String[] args) 
    {
      Square2 s = new Square2();  // Instance or Object Creation
      s.cal();    //Method call or Massage Passing
      s.display();    //Method call or Massage Passing
    } 
}