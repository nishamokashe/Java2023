class Addition
{
    int add(int x, int y)  //Method 1 having 2 parameter
    {
        return(x+y);
    }
    int add(int p,int q,int r) //Method 2 having 3 parameter
    {
        return(p+q+r);
    }
    double add(double a,double b)
    {
        return (a+b);
    }
    public static void main(String[] args) 
    {
      Addition a = new Addition();
      System.out.println("Addition of Two number is :- "+a.add (10,20)); // Method call inside print statement   
      System.out.println("Addition of Three number is :- "+a.add (10,20,50)); // Method call inside print statement   
      System.out.println("Addition of Two number is :- "+a.add (2.2,5.6)); // Method call inside print statement   
    }

}