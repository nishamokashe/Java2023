/*Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. 
For example, if the input is 12345, the output should be 54321.*/
//Using do while loop.

class Reversed2
{
    int num=12345 , revers = 0, rem;
    void display()
    {
      do
      {
        rem = num % 10;  
        revers = revers * 10 + rem; 
        num=num/10; 
      }
      while(num !=0);
        System.out.println("The reverse of the given number is: " + revers);  
    }
    public static void main(String[] args)
    {
      Reversed2 r = new Reversed2();
      r.display();     
    }
}