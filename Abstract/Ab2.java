interface Animal 
{
   void sound();
   void sleep(); 
} 

class Dog implements Animal
{
    public void sound()
    {
        System.out.println("Dog Barks");
    }
    public void sleep()
    {
        System.out.println("Dog sleep"); 
    } 
}

class Main
{
   public static void main(String args[])
   {
       Dog d = new Dog(); 
       d.sound(); 
       d.sleep(); 
   }
}

/* 
  1] Animal is interface with 2 abstarct method sound() and sleep(). 
 
  2] Dog implements Animal interface providing implementations for both sound () and sleep(). 
  ---------------------------------------------------------------------------------------------
  Main Points to remember
  
  1) abstarct class :  Can have abstarct methods(without body) and concrete method (with body). Used when we want to       
                       share code among several closely related classes. 

  2) interface : Can have abstarct methods and defulat methods. Used when we want to specify that a class must 			 implement particual methods but dont need to share among the classes. 
  

*/ 