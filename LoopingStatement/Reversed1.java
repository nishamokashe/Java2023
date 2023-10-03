/*Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. 
For example, if the input is 12345, the output should be 54321.*/
//USing while loop.

class Reversed1
{
    int num=12345 , revers = 0, rem;
    void display()
    {
      while(num !=0)
      {
        rem = num % 10;  
        revers = revers * 10 + rem; 
        num=num/10; 
      }
        System.out.println("The reverse of the given number is: " + revers);  
    }
    public static void main(String[] args)
    {
      Reversed1 r = new Reversed1();
      r.display();     
    }
}