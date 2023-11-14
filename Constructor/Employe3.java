class Employe3 
{
    String name;  // Data Member or Instance Variable
    int id;       // Data Member or Instance Variable

    Employe3(String n, int i) // Parameterized Constructor or Special Method or Class name Method
    {
        name = n;
        id = i;
    }
    void display() // Display() Method Defintion
    {
        System.out.println("\n\n Name is:- "+name+"\n Id:-"+id);
    }
    public static void main(String[] args)
    {
      Employe3 e = new Employe3("Nisha", 105);  // Instance Creation or Object Creation
      e.display();                                  // Method call Or Massage Passing
      Employe3 e1 = new Employe3("Bharti", 106); // Instance Creation or Object Creation
      e1.display();           // Method call Or Massage Passing
    }
}
