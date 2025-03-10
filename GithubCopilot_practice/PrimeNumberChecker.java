/*Create a Java program that checks if a given integer is a prime number. A prime number is a natural
 number greater than 1 that is not divisible by any number other than 1 and itself.*/

public class PrimeNumberChecker {

     static boolean isPrime(int n) 
     {
        // Check if n is less than 2, return false as numbers less than 2 are not prime
        if (n < 2) 
        {
            return false;
        }
        // Check if n is 2 or 3, both are prime numbers
        if (n == 2 || n == 3) 
        {
            return true;
        }
        // Check if n is divisible by 2 or 3, if so, it's not a prime number
        if (n % 2 == 0 || n % 3 == 0) 
        {
            return false;
        }
        // Check for factors from 5 to sqrt(n)
        for (int i = 5; i * i <= n; i += 6) 
        {
            if (n % i == 0 || n % (i + 2) == 0) 
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) 
    {
        // Test cases
        System.out.println(isPrime(29)); // true
        System.out.println(isPrime(15)); // false
        System.out.println(isPrime(1));  // false
        System.out.println(isPrime(2));  // true
        System.out.println(isPrime(999999937)); // true
    }
}
/* Test Case 1
Input: n = 2
Expected Output: true
Reason: 2 is the smallest prime number.

Test Case 2
Input: n = 3
Expected Output: true
Reason: 3 is a prime number.

Test Case 3
Input: n = 4
Expected Output: false
Reason: 4 is divisible by 2, hence not a prime number.

Test Case 4
Input: n = 17
Expected Output: true
Reason: 17 is a prime number.

Test Case 5
Input: n = 18
Expected Output: false
Reason: 18 is divisible by 2 and 3, hence not a prime number.

Test Case 6
Input: n = 1
Expected Output: false
Reason: 1 is not a prime number by definition.

Test Case 7
Input: n = 999999937
Expected Output: true
Reason: 999999937 is a large prime number.

Test Case 8
Input: n = 1000000000
Expected Output: false
Reason: 1000000000 is divisible by multiple numbers, hence not a prime number.
-----------------------------------------------------------------------------------------------

***Brief Analysis of Performance***
Time Complexity
The time complexity of the isPrime function is 
𝑂(𝑛)O( n). This is because:

The function checks for divisibility by 2 and 3 initially, which are constant time operations.
The for loop runs from 5 to the square root of n (i.e., n), incrementing by 6 in each iteration, making it more efficient. Each iteration involves constant time operations.

Space Complexity
The space complexity of the function is O(1), as it uses a constant amount of extra space regardless of the input size.

Performance on Large Inputs
The algorithm is efficient for large values of n up to 
1
0
9
10 
9. By limiting the iterations to the square root of n, the number of operations is significantly reduced compared to 
a naive approach that would iterate up to n. For example:

For n = 999999937, the square root is approximately 31622, meaning the loop runs around 5270 times (31622 / 6), 
making it manageable within computational limits. */


