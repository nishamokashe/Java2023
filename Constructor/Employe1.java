// WAP to Undersatnd the Concept of Parameterized Constructor
class Employe1
{
  double Salary;  // Data Member or Instance Variable
  String name;    //Data Member or Instance Variable
  Employe1()
  {
    Salary = 0;
    name = null;
  }
  Employe1(int s , String n) // Parameterized Constructor or Special Method or Class name Method
  {
     Salary = s;
     name = n;
  }    
  void display() //Display() Method defintion
  {
    System.out.println("\n\n Name is: "+name+ "\n Salary is: "+Salary);
  }
  public static void main(String[] args)
  {
    Employe1 e = new Employe1();
    e.display();
    Employe1 e1 = new Employe1(54000, "Bharti"); // Object Creation or Instance Creation
    e1.display(); //display() Method call or massage Passing  
  }
}
