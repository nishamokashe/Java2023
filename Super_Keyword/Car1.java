// 1. Super can be used to refere the immdite parent class instance variable.
class Car1
{
    String colour = "Black";
}
class Tigor extends Car1
{
    String colour = "Red";
    void show()
    {
        System.out.println("/n/n Colour is "+colour);
        System.out.println("/n/n Colour is "+super.colour);
    }
    public static void main(String[] args) 
    {
      Tigor t = new Tigor();
      t.show();    
    }
}