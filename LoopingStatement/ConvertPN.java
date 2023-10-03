/* Write a program to input a number check it wether it is positive or not if it is positive then calculate fatorial or
 else if it is negative then convert into Positive */
 // using for loop
 
class ConvertPN 
{
    int n=-10, facto=1;
    void display()
    {
        if(n>0)
        {
        System.out.println( +n+ "is a Positive number");
        for(int i=1; i<=n; i++)
        {
           facto=facto*i;
        }
        System.out.println(" factorial of "+n+" is "+facto);
        }
      else if(n<0)
      {
        System.out.println(+n+ "is a Negative number");
        n=n*(-1);  //convert negative to positive
        System.out.println("After convert "+n+ " is a Positive number");
      }
      else
      {
        System.out.println("Please Try with negtive number");
      }
    }
    public static void main(String[] args) 
    {
     ConvertPN c = new ConvertPN();
     c.display();    
    }
}
