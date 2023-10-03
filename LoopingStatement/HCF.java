/*Write a program to calculate HCF of Two given number.*/
// Using for loop.

class HCF
{
   int n1=20, n2=30,hcf; 
  void display()
 {
    for (int i = 1; i <= n1 || i <= n2; i++)
    {
        if (n1 % i == 0 && n2 % i == 0)
        hcf = i;
    }
    System.out.println("Highest Common Factor of given two numbers is :"+hcf);
}  
 public static void main(String[] args) 
 {
   HCF h = new HCF();
   h.display();   
 }  
}
