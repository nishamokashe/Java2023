/*Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. 
For example, if the input is 12345, the output should be 54321.*/
//Using for loop.

class Reversed
{
    int num , revers , rem;
    Reversed()
    {
      revers = 0;
    }
    void display()
    {
      for(num=12345;num !=0;num=num/10)
      {
        rem = num % 10;  
        revers = revers * 10 + rem;  
      }
      System.out.println("\n The Number is: 12345");
      System.out.println("\n The reverse of the given number is: " + revers);  
    }
    public static void main(String[] args)
    {
      Reversed r = new Reversed();
      r.display();     
    }
}