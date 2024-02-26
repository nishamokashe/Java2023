/*  Write a Java program to create a class called "Person" with a name and age attribute. Create two 
instances of the "Person" class, set their attributes using the constructor, and print their name and age.
 */
class Person 
{
    String name;
    int age;
    Person(String n, int a)
    {
        name = n;
        age = a;
    }
    String getNameString()
    {
      return name;
    }
    int getAge()
    {
        return age;
    }
  public static void main(String[] args) 
  {
    Person p = new Person("Amar",18 );
    Person p1 = new Person("OM", 20);  
    System.out.println("The Name of the Person is "+p.name+" and Age is "+p.age);
    System.out.println("The Name of the Person is "+p1.name+" and Age is "+p1.age);

  }
}
