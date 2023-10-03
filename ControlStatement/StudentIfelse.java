public class StudentIfelse
{
 void check(int age)
 {
    if (age>=5)
    {
        System.out.println("\n Student is elligible for First Standard! ");
    } 
    else
    {
        System.out.println("\n Student is not elligible for First Standard! ");
    }
 }  
 public static void main(String[] args)
 {
   StudentIfelse s = new StudentIfelse();
   s.check(4);
   s.check(7);   
 }  
}
