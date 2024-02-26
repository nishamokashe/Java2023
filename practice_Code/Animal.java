/*  Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances 
of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods 
and print the updated values. */

class Dog
{
  String name;
  String breed;
  Dog(String n, String b)
  {
    name = n;
    breed =b;
  }
   String getName()
    {
        return name; 
    }
    void  setName(String n)
    {
          name = n; 
    }
    String getBreed()
    {
        return breed;
    }
    void setBreed(String b)
    {
         breed = b;
    }
    void display_details()
    {
         System.out.println("Name : "+name);
         System.out.println("Breed : "+breed+"\n");		   
    }	  
public static void main(String[] args) 
{
  Dog d =new Dog("Charlie", "Golden Retriever.");
  Dog d1 =new Dog("Max", " German Shepherd.");
  d.display_details();
  d1.display_details();
  System.out.println("** After udating Dogs Name is : \n");
  d.setName("Teddy");
  d.setBreed("Samoyed"); 
  d.display_details();
  d1.setName("Maggie");
  d1.setBreed("Havanese ");
  d1.display_details();	
 }
}
