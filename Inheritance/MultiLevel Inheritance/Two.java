class X   //Child class Or Old class or Sub class 
{ 
   void methodX() 
  { 
     System.out.println("Class X method"); 
  } 
} 
class Y extends X    // Intermidiate class 
{ 
   void methodY() 
  { 
     System.out.println("Class Y method"); 
  } 
} 
class Z extends Y    // Parent class or new class or Super class
{ 
   void methodZ() 
  { 
     System.out.println("Class Z method"); 
  } 
}
class XYZ 
{ 
public static void main(String[] args) 
{ 
    Z z = new Z(); 
    z.methodX(); // Calling X grand class method. 
    z.methodY(); // Calling Y parent class method. 
    z.methodZ(); // Calling Z class local method. 
 } 
}
