public class Employee 
{
   int id;
   String name;
   Address ad;
   
   public Employee(int id, String name, Address ad)
   {
     this.id=id;
     this.name=name;
     this.ad=ad;
   }
   void display()
   {
    System.out.println("ID of Student is : "+id);
    System.out.println("ID of Student is : "+name);
    System.out.println("City : "+ad.city);
    System.out.println("State :"+ad.state);
    System.out.println("Country : "+ad.country);
   }
   public static void main(String[] args) 
   {
      Address ad1 = new Address("Amravati", "Maharshtra", "India"); 
      Address ad2 = new Address("Nagpur", "Maharshtra", "India"); 

      Employee e1 = new Employee(102, "Nisha", ad1);
      Employee e2 = new Employee(103, "Bharti", ad2);

      e1.display();
      System.out.println("\n");
      e2.display();


   }
}
