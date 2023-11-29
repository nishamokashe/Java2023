/* Write a Java program to create a class called Employee with methods called work() and getSalary(). 
Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee(). */

class Employee1
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
class HRManager1 extends Employee1
{
    double Salary, EMP_ID;
    String CompanyName;
    void work()
    {
        Salary = 35000;
        CompanyName = "TCS";
        EMP_ID = 1234;
    }
    void addEmployee()
    {
       System.out.println("\n Company Name is: "+CompanyName);
       System.out.println("\n Employee ID is: "+EMP_ID);
       System.out.println("\n Salary is: "+Salary );
    }
  public static void main(String[] args)
  {
     HRManager1 h = new HRManager1();
     h.getSalary();
     h.work();
     h.addEmployee();  
  }
}