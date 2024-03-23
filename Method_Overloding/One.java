// Function with no arguments and no return value

public class One 
{
   int X=10, Y=20,s;
   void val()   
   {
    s=X+Y;
    System.out.println("Sum of the two number is: "+s);
   } 
   
   public static void main(String[] args) 
   {
     One o = new One();
     o.val();
    }
}

