// Function with No Arguments and With Return Value

public class Two 
{
   int X=10, Y=20,s=0;
   int val()   
   {
    s=X+Y;
    return s;
   } 
   public static void main(String[] args) 
   {
    Two t = new Two();
    System.out.println("Sum of the two number is: "+t.val()); 
    }
}

