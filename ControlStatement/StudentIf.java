public class StudentIf
{
    void check(int age)
    {
        if (age>=5)
        {
         System.out.println("\n Student is elligible for First Standard!");    
        }
    }
    public static void main(String[] args)
    {
     StudentIf s = new StudentIf();
     s.check(6);    
    }
}
