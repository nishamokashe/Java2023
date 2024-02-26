import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private int age;
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
}

 class StudentManagementSystem 
{
    private static ArrayList<Student> students = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        while (!exit) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    searchStudentByID(scanner);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
        
        scanner.close();
    }
    
    private static void addStudent(Scanner scanner) {
        System.out.println("\nAdding Student");
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        
        Student student = new Student(id, name, age);
        students.add(student);
        
        System.out.println("Student added successfully.");
    }
    
    private static void displayAllStudents() {
        System.out.println("\nAll Students");
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge());
            }
        }
    }
    
    private static void searchStudentByID(Scanner scanner) {
        System.out.println("\nSearch Student by ID");
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        
        boolean found = false;
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge());
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
}