/*
 Write a Java program to create a class Employee with a method called calculateSalary(). 
 Create two subclasses Manager and Programmer. In each subclass, override the calculateSalary() method 
 to calculate and return the salary based on their specific roles.
 */

 class Employee
 {
     String name;
     String role;

     Employee(String name, String role) 
    {
        this.name = name;
        this.role = role;
    }
     String getName() 
     {
        return name;
     }

     String getRole() 
     {
        return role;
     }
    double calculateSalary()
    {
      return 0;
    }
 }
 class Manager extends Employee
 {
    
     double baseSalary;
     double bonus;

     Manager(String name, double baseSalary, double bonus) 
    {
        super(name, "Manager");
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }
    @Override

    double calculateSalary()
    {
        return baseSalary + bonus;
    }
 }
class Programmer extends Employee
 {
     double baseSalary;
     double overtimePay;

     Programmer(String name, double baseSalary, double overtimePay) 
     {
        super(name, "Programmer");
        this.baseSalary = baseSalary;
        this.overtimePay = overtimePay;
    }
    @Override
    double calculateSalary()
    {
        return baseSalary + overtimePay;
    }
    public static void main(String[] args) 
    {
        Manager e = new Manager("Amit Bari", 7500.0, 1500.0);
        Programmer e1 = new Programmer("Sumit Somwanshi", 5000.0, 600.0);

        System.out.println("\nName: " + e.getName() + "\nRole: " + e.getRole() + "\nSalary: " + e.calculateSalary());
        System.out.println("\nName: " + e1.getName() + "\nRole: " + e1.getRole() + "\nSalary: " + e1.calculateSalary());

    }
 }