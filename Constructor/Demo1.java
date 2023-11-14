class Demo1
{
    int rol_no; //Data Member 
    double per; // Data Member
    Demo1() // Spical Method or Class_name_method or Constructor Definition
    {
        rol_no = 102;
        per = 77.87;
    }
    void display() // Method defintion
    {
      System.out.println("\n\n Roll Number: " +rol_no+ "\n\n Percentage is: "+per);
    }
    public static void main(String[] args)
    {
      Demo1 d1 = new Demo1();  // Instance Creation or Object Creation
      d1.display();    //Method Call
    }
}