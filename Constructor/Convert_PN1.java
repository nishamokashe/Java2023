/* Write a program to input a number check it wether it is positive or not if it is positive then calculate fatorial or
   else if it is negative then convert into Positive */
 // using while loop
 
class ConvertPN1
{
    int i,n, facto;
    ConvertPN1(int I, int N, int F)  //  Parameterized Constructor or Special Method or Class name Method
   {
       i = I;
       n = N;
       facto = F;
    } 
    void display()  
    { 
        if(n>0)
        {
        System.out.println( +n+ "is a Positive number");
        while(i<=n)
        {
           facto=facto*i;
           i++;
        }
        System.out.println(" factorial of "+n+" is "+facto);
        }
      else if(n<0)
      {
        System.out.println(+n+ "is a Negative number");
        n=n*(-1);  //convert negative to positive
        System.out.println("After converting " +n+ " is a Positive number");
      }
      else
      {
        System.out.println("Please Try with negtive number");
      }
    }
    public static void main(String[] args) 
    {
     ConvertPN1 c = new ConvertPN1(1, -10, 1); 
     c.display();   
    }
}
