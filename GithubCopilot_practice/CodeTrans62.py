# Python code to calculate the factorial of a number
#the translation of the provided Java code into Python
#Code Translation Exercise:* task 6

def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)

def main():
    num = 5
    print("Factorial of", num, "is", factorial(num))

if __name__ == "__main__":
    main()
    
"""Both Python and JavaScript translations closely mirror the structure and
logic of the original Java code.

In Python, there's an additional main() function and 
an if __name__ == "__main__": block to execute the main function when the 
script is run directly.

JavaScript uses console.log() for output instead of System.out.println() in 
Java and Python's print().

Syntax and conventions are adapted to each language,
such as the use of let instead of int for variable declaration in JavaScript.
"""