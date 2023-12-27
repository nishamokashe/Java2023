abstract class Student
{
    abstract void display();
}
class MCA extends Student
{
    // Implementation of abstract method
    void display()
    {
        System.out.println("\n\n WelCome in Collage ! \n");
    }
public static void main(String args[])
 {
    MCA m = new MCA();
    m.display();
 }
}