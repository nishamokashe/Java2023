public class VotingIfelse
{
    void check(int age)
    {
        if (age>18)
        {
            System.out.println("\n Person is elligible for voting!");
        } 
        else
        {
            System.out.println("\n Person not elligible for Voting!");    
        }
    }
    public static void main(String[] args)
    {
      VotingIfelse v = new VotingIfelse();
      v.check(13);    
   
    }
}
