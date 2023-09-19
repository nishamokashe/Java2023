class Amruta
{
    AccessSpecifier3 am;
    void display()
    {
        am = new AccessSpecifier3();
        System.out.println("Amruta Class---> x =" +am.x);
    }
}
class Shreya
{
    AccessSpecifier3 sh;
    void print()
    {
        sh = new AccessSpecifier3();
        System.out.println("Shreya Class---> x =" +sh.x);
    }
}
class Sameer
{
    AccessSpecifier3 sm;
    void show()
    {
        sm = new AccessSpecifier3();
        System.out.println("Amruta Class---> x =" +sm.x);
    }
}

class Check1
{
    public static void main(String[] args)
    {
      Amruta a = new Amruta();
      a.display();
      Shreya s = new Shreya();
      s.print();
      Sameer ss = new Sameer();
      ss.show();
    }
}