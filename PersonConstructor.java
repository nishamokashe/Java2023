class Person
{
 String name;
 int age;
 Person()
 {
    name = "Jack";
    age = 35;
 }
 void display()
 {
    System.out.println("\nName is:"+name+ "\n Age is:"+age);
 }
 public static void main(String[] args)
 {
  Person p = new Person();
  p. display();   
 }
}
