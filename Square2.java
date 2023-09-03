//WAP to calculate the area of square 
class Square2
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
}
class Test
{  
        public static void main(String[] args) 
    {
       Square2 s = new Square2();  //Object creation or Instance Creation
       s.getdata(34);  // Method call or Massage Passing or Calling Method with Arg. or Function call
       s.cal();     // Method call or Massage Passing or Calling Method with Arg. or Function call
    }
}
