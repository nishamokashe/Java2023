public class Volume 
{
   void val(double a)   
   {
    return (a*a*a);
   } 
   void val(double r, double h)
   {
    return((22/7)*r*r*h);
   }
   public static void main(String[] args) 
   {
     Volume v = new Volume();
    System.out.println("\n Volume of Cube :-"+v.val(2.2));
     System.out.println("\n Volume of Cylender :-"+v.val(2.2,5));     
   }
}
