//Addition of two nos. task 3 original code

public class CodeRefactor3 {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 10;
        
        int sum = add(number1, number2);
        
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);
    }
}

/*This code defines a method add that takes two integers
 as input parameters and returns their sum. In the main method, 
 two numbers (number1 and number2) are initialized with values 5 and 10 
 respectively. Then, the add method is called with
  these numbers, and the result is printed to the console.*/
