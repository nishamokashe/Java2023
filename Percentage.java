class Percentage
{
 public static void main(String[] args)
 { 
    float eng=66, phy=78, chem=76, math=88, comp=86;
    double obt_marks, percent;

    System.out.println("\n Marks of English Subject is:"+eng);
    System.out.println("\n Marks of English Subject is:"+phy);
    System.out.println("\n Marks of English Subject is:"+chem);
    System.out.println("\n Marks of English Subject is:"+math);
    System.out.println("\n Marks of English Subject is:"+comp);

    obt_marks = eng+phy+chem+math+comp;
    percent = (obt_marks*100)/500;  // formula==> (obt_marks/tot_marks)*100

    System.out.println("\n Total Marks Student is:"+obt_marks);
    System.out.println("\n Persentage of Student is:"+percent);
 }
}