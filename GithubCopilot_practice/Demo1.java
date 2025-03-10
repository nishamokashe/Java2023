// Program to understand the concept of constrcutor

class Student
{
    int roll;
    String name;

    Student(int r, String n)
    {
        roll = r;
        name = n;
    }
}

public class Demo1 {
    public static void main(String args[])
    {
        Student s = new Student(101, "Masud");
        System.out.println(s.roll + " " + s.name);
    }
}


