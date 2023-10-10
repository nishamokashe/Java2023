//WAP Check the Greater number.

class NestedIfelse
{
    public static void main(String[] args)
    {
        int a=20, b=30, c=25;  
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