class SumOfNum
{
  int  n=9 , sum;
 void display()    
 {
    for(int i=1;i<=n;i++)
    {
      System.out.println(i);
      sum=sum+i;
    }
 System.out.println("The Sum of Natural Number upto "+n+ " terms : " +sum);
 }
 public static void main(String[] args)
 {
   SumOfNum s = new SumOfNum();
   s.display();   
 }
 }

