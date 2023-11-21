// WAP to undersatnd the concept of Constructor Overlading or multiple Constructor

class Employee
{
    double Salary;  //Data Member or Instance variable
    String name;  //Data Member or Instance variable
    int emp_id;   //Data Member or Instance variable

    Employee() // Default constructor defintion
    {
        System.out.println("\n Emp ID:- "+(emp_id=111));
        System.out.println("\n Emp Name :- "+(name = "Nisha"));
        System.out.println("\n Emp Salary:- "+(Salary = 70000));
        System.out.println("\n-----------------------------");
    }
    
    Employee(int e, String n, double s) // Parameterized Constructor Defintion
    {
        System.out.println("\n Emp ID:- "+(emp_id=e));
        System.out.println("\n Emp Name :- "+(name = n));
        System.out.println("\n Emp Salary:- "+(Salary = s));
    }
    public static void main(String[] args)
    {
     Employee e1 = new Employee(); // Defualt Constructor call or instance or Object Creation
     Employee e2 = new Employee(111, "Nisha", 45000); // paramertized Constructor call or instance or Object Creation   
     Employee e3 = new Employee(112, "Bharti", 50000); // paramertized Constructor call or instance or Object Creation   

    }
}