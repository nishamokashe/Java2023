class Circumference7
{
    double PI, r, area;
    void getdata(double pi, double R)
    {
       PI = pi;
       r = R;
    }
    void display()
    {
         area = 2*PI*r;
        System.out.println("\n\n Area of Circumference is: "+area);    
    }
}
    class Circumference_Seven
 {  
    public static void main(String[] args) 
    {
       double P=3.14, Rr = 3.4;
       Circumference4 c = new Circumference4();
       c.getdata(P,Rr);
       c.display(); 
    }   
 }