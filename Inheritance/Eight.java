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
    }
    void getLastName()
    {
       lastName = "Kalalkar";
    }
}
class Employee extends Person
{
    
    void getEmployeeId()
    {
      EmployeeId = 123;
      JobTitle = "HR Manager";
    }
    void getLastName()
    {
      System.out.println("\n First Name is: " +firstName+ "\n Last Name is: "+lastName+ "\n EmployeeID is: "+EmployeeId+ "\n JoTitle is: "+JobTitle);
    }
     public static void main(String[] args)
    {
        Employee e = new Employee();
        e.getFirstName();        
        e.getLastName();
        e.getEmployeeId();
    }
}