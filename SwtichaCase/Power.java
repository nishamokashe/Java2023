/*Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the 
power of another. (Do not use Java built-in method)*/
//Using Switcha Case.

class Power2 
{
 int base=2,power=20,result=1;  
 void display()
 {
   for(int i=1; i<=power; i++)
   {
    result=result* base;
    {
    continue;
    }
   }
   System.out.println("2 to the Power of 20 is equal to:- " +result);
 }    
 public static void main(String[] args)
 {
   Power2 p = new Power2();
   p.display();   
 }
}
