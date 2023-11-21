// WAP to undersatnd the concept of Constructor Overlading or multiple Constructor

class Employee1
{
    double Salary;  //Data Member or Instance variable
    String name;  //Data Member or Instance variable
    int emp_id;   //Data Member or Instance variable

    Employee1() // Default constructor defintion
    {
        System.out.println("\n Emp ID:- "+(emp_id=111));
        System.out.println("\n Emp Name :- "+(name = "Nisha"));
        System.out.println("\n Emp Salary:- "+(Salary = 70000));
        System.out.println("\n-----------------------------");
    }
    
    Employee1(int e, String n, double s) // Parameterized Constructor Defintion
    {
        double Salary = s;  //Data Member or Instance variable
        String name = n;  //Data Member or Instance variable
        int emp_id = e;   //Data Member or Instance variable
    }    
      void display()
      {
        System.out.println("\n Emp ID:- "+(emp_id));
        System.out.println("\n Emp Name :- "+(name));
        System.out.println("\n Emp Salary:- "+(Salary));
      } 
    public static void main(String[] args)
    {
     double S = 45000; 
     String N= "Nisha";
     int E = 111;
     Employee1 e1 = new Employee1(); // Defualt Constructor call or instance or Object 
     Employee1 e2 = new Employee1(); // paramertized Constructor call or instance or Object Creation   
     e2.display();
     
    }
}