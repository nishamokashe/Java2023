class Percent4
{
    double om, tm,per;
    void input(double o, double t)   // getdata() defination
    {
        om = o;
        tm = t;
    }
    void cal()    // Calculate() defination
    {  
        per = ((om*100)/tm);
        System.out.println("\n\n Percentage of Student is"+per);
    }
    public static void main(String[] args)
    {
      double OM=433, TM=500; 
      Percent3 p = new Percent3(); //Object creation or Instance Creation
      p.input(OM, TM);  // Method call or Massage Passing or Calling Method with Arg. or Function call
      p.cal();     // Method call or Massage Passing or Calling Method with Arg. or Function call
    }
}