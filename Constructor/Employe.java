// WAP to Undersatnd the Concept of Parameterized Constructor
class Employe
{
  double Salary;  // Data Member or Instance Variable
  String name;    //Data Member or Instance Variable
  Employe(int s , String n) // Parameterized Constructor or Special Method or Class name Method
  {
     Salary = s;
     name = n;
  }    
  void display() //Display() Method definition
  {
    System.out.println("\n\n Name is: "+name+ "\n Salary is: "+Salary);
  }
  public static void main(String[] args)
  {
    Employe e1 = new Employe(54000, "Bharti"); // Object Creation or Instance Creation
    e1.display(); //display() Method call or massage Passing  
  }
}
