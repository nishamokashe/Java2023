class Car
{
    String brand;
    Car()
    {
        brand = "Ford";
    }
    void getbrand()
    {
        System.out.println("\n Brand is:"+brand);
    }
}
class Sample
{
    public static void main(String[] args)
    {
        Car c = new Car();
        c.getbrand();
    }
}