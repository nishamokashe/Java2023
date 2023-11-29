/* Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). 
Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName()
 method to include the employee's job title. */

 class  Person
 {
    String firstName;
    String lastName; 
    int EmployeeId;
    String JobTitle;
    
    void getFirstName()
    {
        firstName ="Nisha";
        System.out.println("First Name is: "+firstName);
    }
    void getLastName()
    {
       lastName = "Kalalkar";
       System.out.println("First Name is: "+lastName);

    }
}
class Employee extends Person
{
    
    void getEmployeeId()
    {
      EmployeeId = 123;
      System.out.println("First Name is: "+EmployeeId);

      JobTitle = "HR Manager";
      System.out.println("First Name is: "+JobTitle);

    }
    void getLastName()
    {
      lastName = "Kalalkar";
       System.out.println("First Name is: "+lastName);
    }
}
class Per
{  
     public static void main(String[] args)
    {
        Employee e = new Employee();
        e.getFirstName();        
        e.getLastName();
        e.getEmployeeId();
    }
}