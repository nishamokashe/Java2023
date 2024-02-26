class Student 
{
  String name;
  int roll_no;
  double per;
  
  void getdata()
  {
    name ="Ashish";
	roll_no =101;
	per =44.5;
  }
  
  void display()
  {
    System.out.println("\n Name of Student is :" +name+ "\n Name of Student is :" +roll_no+ " Name of Student is :" +per);
  }
public static void main(String args[])
 {
       Student s = new Student();
 }
} 