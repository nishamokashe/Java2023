/*Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the 
power of another. (Do not use Java built-in method)*/
//Using do while loop.

class Power4
{
 int i=1, base=2,power=20,result=1;  
 void display()
 {
   do
   {
    result=result* base;
    i++;
   }
   while(i<=power);
   System.out.println("2 to the Power of 20 is equal to:-" +result);
 }    
 public static void main(String[] args)
 {
   Power4 p = new Power4();
   p.display();   
 }
}
