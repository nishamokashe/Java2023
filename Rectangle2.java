class Rectangle1
{
    double length, width, area;  
    void getdata(double len, double wid)
    {
        length = len;
        width = wid;
    }
    void cal()
    {
        area= (length*width);
        System.out.println("\n\n Area of rectangle is"+area);
    }
}
class Test
{
    public static void main(String[] args)
    {
      Rectangle1 p = new Rectangle1();  //Object creation or Instance creation
      p.getdata(4.5, 2.2);  // Method call or Calling Method without arguments
      p.cal();  // Method call or Calling Method without arguments
    }

}