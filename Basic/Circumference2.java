class Circumference2
{
    double PI=3.14, r=4.5, area;
    void cal()
    {
        area = 2*PI*r;
    }
    void display()
    {
        System.out.println("\n\n Area of Circumference is: "+area);    
    }
    public static void main(String[] args) 
    {
       Circumference2 c = new Circumference2();
       c.cal();
       c.display(); 
    }   
}