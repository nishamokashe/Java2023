class NestedIfelse1
{
    public static void main(String[] args)
    {
        int a=100, b=100, c=100;  
        if(a>b)
        {
          if(a>c)  
          {
            System.out.println("A is Greater");
          }
          else
          {
            System.out.println("C is Greater"); 
          }
        }
        else
        {
            if (b>c) 
            {
             System.out.println("B is Greater"); 
            }
            else
            {
             System.out.println("C is Greater");
            }
        }
    }
}