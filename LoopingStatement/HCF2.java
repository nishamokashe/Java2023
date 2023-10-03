/*Write a program to calculate HCF of Two given number.*/
// Using do while loop.

class HCF3
{
   int i = 1,n1=20, n2=30,hcf; 
  void display()
 {
   do
    {
        if (n1 % i == 0 && n2 % i == 0)
        hcf = i;
        i++;
    }
    while ( i <= n1 || i <= n2);
    System.out.println("Highest Common Factor of given two numbers is :"+hcf);
}  
 public static void main(String[] args) 
 {
   HCF h = new HCF();
   h.display();   
 }  
}
