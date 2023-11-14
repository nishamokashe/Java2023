class Circumference3
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
} 
    class Circumference_Test
{
    public static void main(String[] args) 
    {
       Circumference3 c = new Circumference3();
       c.cal();
       c.display(); 
    }   
}