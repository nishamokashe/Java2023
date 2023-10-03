class Voting
{
 void check(int age)
 {
   if(age>18)
    {
     System.out.println("\nPerson is eligible for voting");
    } 
 }   
 public static void main(String args[])
  {
    Voting v = new Voting();
    v.check(20);
  }
}