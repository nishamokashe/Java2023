/*Write a program to calculate HCF of Two given number.*/
// Using while loop.

class HCF1
{
   int i = 1,n1=20, n2=30,hcf; 
  void display()
 {
    while ( i <= n1 || i <= n2)
    {
        if (n1 % i == 0 && n2 % i == 0)
        hcf = i;
        i++;
    }
    System.out.println("Highest Common Factor of given two numbers is :"+hcf);
}  
 public static void main(String[] args) 
 {
   HCF1 h = new HCF1();
   h.display();   
 }  
}
