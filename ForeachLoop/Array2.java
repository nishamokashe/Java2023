import java.util.Scanner;

public class Array2 
{
 public static void main(String[] args) 
 {
   int x[] = new  int[3];   
   Scanner sc = new Scanner(System.in);
   System.out.println("\n Enter the 3 elements: \n");

   for(int i:x)
   {
     x[i] = sc.nextInt();
     System.out.println(i+" ");
   }
 }    
}
