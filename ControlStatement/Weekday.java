class Weekday
{
  int day=5;
  void check()
  {
    if(day == 1)
    {
        System.out.println("Monday");
    }
    else if(day == 2)
    {
        System.out.println("Tuesday");      
    }
    else if(day == 3)
    {
        System.out.println("Wednesday");      
    }else if(day == 4)
    {
        System.out.println("Thursday");      
    }
    else if(day == 5)
    {
        System.out.println("Friday");      
    }
    else if(day == 6)
    {
        System.out.println("Saturday");      
    }
    else if(day == 7)
    {
        System.out.println("Sunday");      
    }
    else
    {
        System.out.println("Invalid Input! Please enter week number between 1 to 7.");
    }
  }  
  public static void main(String[] args) 
  {
    Weekday w = new Weekday();
    w.check();  
  }  
}
