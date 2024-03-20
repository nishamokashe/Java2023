public class Area 
{
  double val(double r, double h)  
  {
    return (2*(22/7)*r*h);
  } 
  double val(double r)  
  {
    return((22/7)*r*r);
  } 
  public static void main(String[] args) 
  {
    Area a = new Area();
    System.out.println("Area of Cylender is :-"+a.val(22.2, 34.2));  
    System.out.println("Area of Cylender is :-"+a.val(45.5));  
  }
}
