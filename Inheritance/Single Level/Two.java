// Create a base class or superclass. 
class A1
{ 
 // Declare an instance method. 
    public void methodA() 
    { 
       System.out.println("Parent class method"); 
    } 
} 
// Declare a derived class or subclass and extends base class A. 
class B2 extends A1 
{ 
   public void methodB() 
   { 
     System.out.println("Child class method"); 
   } 
} 
class Myclass 
{ 
public static void main(String[] args) 
{ 
 // Create an object of class B. 
    B2 obj = new B2(); 
    obj.methodA(); // methodA() of B will be called because by default, it is available in B. 
    obj.methodB(); // methodB() of B will be called. 
  } 
}
