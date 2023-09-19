class Dog
{
    String name ;
    String breed;
    Dog()
    {
        name = "Charlie";
        breed = "Labrador Retriever";
    }
    void display()
    {
        System.out.println("\n Dog Name is:" +name+"\n Breed Name is:" +breed);
    }
    public static void main(String[] args)
    {
     Dog d = new Dog();
     d.display();    
    }
}
