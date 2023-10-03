class VowelConsonant
{
  int l;
  void check()  
  {
    if(l=='a'||l=='e'||l=='i'||l=='o'||l=='u'||l=='A'||l=='E'||l=='I'||l=='O'||l=='U')
	{
	  System.out.println("Entered character "+l+" is  Vowel"); 
	}
	 else if((l>='a'&&l<='z')||(l>='A'&&l<='Z'))
    {
	   System.out.println("Entered character "+l+" is Consonant");
    }
	else
    {
	  System.out.println("Not an alphabet");	
    }	
  }
  public static void main(String[] args) 
  {
    VowelConsonant v = new VowelConsonant();
    v.check();  
  }
}  
