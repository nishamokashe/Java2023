class Rectangle3
{
    double length , width ,area;  
    void getdata(double len, double wid)  //Formal Arg.
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
class Test1
{
    public static void main(String[] args)
    {
      Rectangle3 p = new Rectangle3();  //Object creation or Instance creation
      double l=4.5, w = 2.2;  //Actual Arg.
      p.getdata(l,w);  // Method call or Calling Method without arguments
      p.cal();  // Method call or Calling Method without arguments
    }

}