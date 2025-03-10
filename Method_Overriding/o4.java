//Method overriding with Access Modifiers
class Animal1
{
   protected void sound()
   {
           System.out.println("Animal makes sound!");
   }   
}
class Dog1 extends Animal1
{
   public void sound()
   {
           System.out.println("\n Dog makes sound!");
   }
}
class Main3
{
   public static void main(String args[])
   {
         Dog1 d = new Dog1();
         d.sound();  
   }
}

/* 
    Access level of the overriding method can be less restrictive but more restrcitive than the overridden method. 
*/ 