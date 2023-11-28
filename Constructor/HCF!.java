/*Write a program to calculate HCF of Two given number.*/
// Using for loop.
/* Prime factorisation of 20 = (2 × 2 × 5)

Prime factorisation of 30 = (2 × 3 × 5)

The common prime factors of 20 and 30 are 2 and 5.

Hence, HCF (20, 30) = 2 × 5 = 10 */

class HCF1
{
  int n1, n2,hcf;
  HCF1( int N1, int N2)  // Default constructor or Special Method or Class Name Method
  {
    n1 = N1;
    n2 = N2;
  }
  void display()
 {
    for (int i = 1; i <= n1 || i <= n2; i++)
    {
        if (n1 % i == 0 && n2 % i == 0)
        hcf = i;
    }
    System.out.println("Highest Common Factor of given two numbers is: "+hcf);
}  
 public static void main(String[] args) 
 {
   HCF1 h = new HCF1(20, 30);
   h.display();   
 }  
}
