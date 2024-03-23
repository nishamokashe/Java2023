//Function With Arguments and With Return Value

public class Four 
{
    int val(int X, int Y)   
    {
     return X+Y;
    } 
    public static void main(String[] args) 
    {
     Four th = new Four();
     System.out.println("Sum of the two number is: "+th.val(10,20)); 
     }  
}
