public class Volume1 
{
   void val(double a)   
   {
    System.out.println("\n Volume of Cube :-"+(a*a*a));
   } 
   void val(double r, double h)
   {
     System.out.println("\n Volume of Cylender :-"+((22/7)*r*r*h));     
   }
   public static void main(String[] args) 
   {
     Volume1 v = new Volume1();
	 v.val(2.2);
	 v.val(2.2,5);
   }
}
