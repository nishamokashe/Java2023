public class CircleCircumference 
{
  double radius=6, PI=(22/7), result; 
  
  void getCircle()
  {
     result = PI*radius*radius;
     System.out.println("Area of Circle is:"+result);
  }
  void getCircum()
  {
    result = 2*PI*radius;
    System.out.println("Area of Circumference is:"+result);
  }
  public static void main(String[] args)
  {
    CircleCircumference c = new CircleCircumference();
    c.getCircle();
    c.getCircum();  
  }
}
