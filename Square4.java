//WAP to calculate the area of square 
class Square4
{
   double side, area;
   void getdata(double S)
   {
    side = S;
   }
   void cal()
   {
        area= (side*side);
        System.out.println("\n\n Area of square is" +area);
   }
     public static void main(String[] args) 
    {
       double SIDE=34;
       Square1 s = new Square1();  //Object creation or Instance Creation
       s.getdata(SIDE);  // Method call or Massage Passing or Calling Method with Arg. or Function call
       s.cal();     // Method call or Massage Passing or Calling Method with Arg. or Function call
    }
}
