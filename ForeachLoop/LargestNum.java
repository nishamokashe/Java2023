//WAP to find the largest number.

class LargestNum
{
    public static void main(String[] args) 
    {
      int n[]= new int[]{433,233,333,345,124};
      int larg=n[0];
      for(int i:n)
      {
        if (i>larg) 
        {
            larg =n[i];
        }
        System.out.println("\n The Given Array Element is:"+larg);
        // if (n[i]>larg) 
        // {
        //     System.out.println(n[i]);
        // }
        // System.out.println("\n From the array elements largest number is:"+larg);
      }    
    }
}