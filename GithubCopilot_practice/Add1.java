//This is simple addition program task 1
//Code Review Exercise
public class Add1 {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) 
    {
        int num1 = 5;
        int num2 = 10;
        int sum = add(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}

/*
 *  This is a Java program that consists of a single class called Add1. 
     The class has two methods: add and main.
     The add method takes two int parameters, a and b, and returns their sum. 
    **This method is static, which means it can be called without creating an instance of the class.
     
    in the main method:--
    Two int variables, num1 and num2, are declared and initialized with values 5 and 10, respectively.
   The add method is called with num1 and num2 as arguments, and the result is stored in the sum variable.
   The System.out.println statement is used to print a message to the console. The message includes the values of num1, num2, and sum,
 */