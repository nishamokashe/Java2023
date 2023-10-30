/* Write a Java program to create a class called Employee with methods called work() and getSalary(). 
Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee(). */

class Employee
{
    void work()
    {
        System.out.println("Employee Information:");
    }
    void getSalary()
    {
        System.out.println("\nAdding new employee!");
    }
}
class HRManager extends Employee
{
    double Salary;
    String CompanyName;
    void work()
    {
        Salary = 35000;
        CompanyName = "TCS";
    }
    void addEmployee()
    {
       System.out.println("\n Company Name is: "+CompanyName);
       System.out.println("\n Salary is: "+Salary );
    }
  public static void main(String[] args)
  {
     HRManager h = new HRManager();
     h.getSalary();
     h.work();
     h.addEmployee();  
  }
}