class PN
{
 void check(int n)
 {
   if(n>0)
    {
     System.out.println(+n+"is Positive number");
    } 
    else
    {
     System.out.println(n+"is Negative number"); 
    }
 }   
 public static void main(String args[])
  {
    PN v = new PN();
    v.check(13);
  }
}