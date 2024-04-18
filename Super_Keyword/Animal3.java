// 3. Super can be used to invoke (call) immidiate parent class construter
// Note: Super() is added in each class constructer automatically by complier if there is no super().
public class Animal3 
{
    Animal3()
    {
        System.out.println("\nAnimal Constrcuter called!!!");
    }
}
class Fox3 extends Animal3
{
    Fox3()
    {
        super(); // Note: Super() is added in each class constructer automatically by complier if there is no super().
        System.out.println("\nFox Constrcuter called!!!");
    }
    public static void main(String[] args) 
    {
        Fox3 x = new Fox3();
    }
}
