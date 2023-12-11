class A
{
    int x = 10;
    void msg()
    {
        System.out.println("\n\n Hi you are in A class !");
    }
}
class B
{
    int y = 20;
    void msg()
    {
        System.out.println("\n\n Hi you are in B class !");
    }
}
class C extends A,B
{
    void add()
    {
        System.out.println("\n\n Addition is "+(x+y));
    }
    public static void main(String[] args)
    {
        C c = new C();
        c.add();
        c.msg();
        c.msg();  //Show the error mass. //Ambiguity Error
    }
}