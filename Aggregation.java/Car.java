class Car   // Define a class gor car
{
    String Model;   // data member
    Engine en;      //Aggregation : Car has a Engine  //data member
    public Car(String model, Engine e)   // parameterized construter
    {
        Model = model;
        en = e;
    }
    void start()
    {
        System.out.println("Starting the " +Model+ "Car");
        en.start();
        System.out.println("Car Started Successfully!");
    }
}