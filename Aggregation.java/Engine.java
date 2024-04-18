public class Engine 
{
    public void start()
    {
        System.out.println("Engine Started!");
    }
    public static void main(String[] args) 
    {
      Engine eng = new Engine();    
      eng.start();
      Car c1 = new Car("Tata Safari", eng);
      c1.start();
    }
}
