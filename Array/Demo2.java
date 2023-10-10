import java.util.Scanner;

public class Demo2
{
  public static void main(String[] args)
  {
     int x[] = new int[3];
     Scanner sc = new Scanner(System.in);
     System.out.println("\n Enter the 3 elements:");
     for (int i=0; i<3; i++)
     {
        x[i] = sc.nextInt();
     }  
     System.out.println("\n The 3 elements are as follows: ");
     for(int i=0; i<3; i++)
     {
        System.out.println(x[i]+"   ");
     }
  }    
}
