class Demo3 
{
   void check(int x[])
   {
    int X[]=x;
    int num=X[0];
    for(int i:X)
    {
       if(i>num)
       {
        num=i;
       }
    }
    System.out.println("Maximum Number is:"+num);

    for(int i:X)
    {
        if(i<num)
        {
            num=i;
        }
    }
    System.out.println("Minimum value is:"+num);
   } 
   public static void main(String[] args)
   {
     Demo3 f = new Demo3();
     int arr[]={23,77,56,34,97,99,45};
     f.check(arr); 
   }
}
