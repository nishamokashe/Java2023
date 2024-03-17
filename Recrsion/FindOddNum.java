/*Write a program to find the Odd number in given natural num. */
// Using Recursive method

public class FindOddNum
{
    public static void findOddRecursive(int n) 
    {
        if (n % 2== 0) 
        {
            return;
        } 
        else 
        {
            if (n % 2 != 0) 
            {
                System.out.print(n + " ");
            }
             findOddRecursive(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 10; 
        System.out.print("Odd numbers up to " + number + " : ");
        findOddRecursive(number);
    }
}
