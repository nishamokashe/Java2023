/*Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1,
 or "large" if it exceeds 1,000,000.*/
 
 class PNZSL 
{
  int num=25;  
  void display()
  {
      if (num>0)
    {
        if(num<1)
      {
        System.out.println("Positive small");
      }
      else if (num>1000000) 
      {
        System.out.println("Positive large");
      } 
      else 
      {
        System.out.println("Positive");   
      }
    }
      else if (num<0) 
    {
      if (num<1) 
       {
         System.out.println("Negaitive small"); 
       }
       else if(num>1000000)
       {
        System.out.println("Negative large");
       }
       else
       {
        System.out.println("Negative");
       } 
    }   
    else
    {
      System.out.println("Zero");  
    } 
  }
  public static void main(String[] args)
  {
   PNZSL p = new PNZSL();
   p.display(); 
  }    
}
