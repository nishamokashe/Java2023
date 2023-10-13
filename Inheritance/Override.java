class Car
{
    void show()
    {
        System.out.println("\n Car Price is 5.5 lakhs");
    }
}
class Alto extends Car
{
    void show()
    {
        System.out.println("\n Car Price is 5.7 lakhs");
    }
    public static void main(String[] args)
    {
        Alto  a = new Alto();
        a.show();
    }
}