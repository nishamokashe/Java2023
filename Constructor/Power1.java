/*Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the 
power of another. (Do not use Java built-in method)*/
//Using for loop.

class Power1
{
 int base,power,result;  
 Power1(int B, int P, int R)
 {
   base = B;
   power = P;
   result = R;
 }
 void display()
 {
   for(int i=1; i<=power; i++)
   {
    result=result* base;
   }
   System.out.println("2 to the Power of 20 is equal to:- " +result);
 }    
 public static void main(String[] args)
 {
   Power1 p = new Power1(2,20,1);
   p.display();   
 }
}
