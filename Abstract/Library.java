
abstract class Book 
{
   private String  title;
   private String author;
   private String ISBN;
   private int numberOfPage;

   public Book(String title, String author, String ISBN, int numberOfPage)
   {
       this.title = title;
       this.author = author;
       this.ISBN = ISBN;
       this.numberOfPage = numberOfPage;
   }
   public String gettitle()
   {
       return title;
   }
   public String getauthor()
   {
       return author;
   }
   public String getISBN()
   {
       return ISBN;
   }
   public int getnumberOfPage()
   {
       return numberOfPage;
   }

   public abstract void displayInfo();
}
class FictionBook extends Book
{
   private String genre;
   public FictionBook(String title, String author, String ISBN, int numberOfPage, String genre)
   {
       super(title, author, ISBN, numberOfPage);
       this.genre = genre;
   }
   public void displayInfo()
   {
       System.out.println("Title: " + gettitle());
       System.out.println("Author: " + getauthor());
       System.out.println("ISBN: " + getISBN());
       System.out.println("Number of pages: " + getnumberOfPage());
       System.out.println("Genre: " + getGenre());
   }
   public String getGenre() 
   {
    return genre;
   }
}
class NonFictionBook extends Book
{
   private String subject;
   public NonFictionBook(String title, String author, String ISBN, int numberOfPage, String subject )
   {
       super(title, author, ISBN, numberOfPage);
       this.subject = subject;
   }
   public void displayInfo()
   {
       System.out.println("Title: " + gettitle());
       System.out.println("Author: " + getauthor());
       System.out.println("ISBN: " + getISBN());
       System.out.println("Number of pages: " + getnumberOfPage());
       System.out.println("Subject: " + getSubject());
   }
   public String getSubject() 
   {
    return subject;
  }

}

interface LibraryOperations 

{
   public void addBook(Book book);
   public void removeBook(String ISBN);
   public void displayAllBook();

}
class Library implements LibraryOperations   // main class
{
   public static void main(String[] args)
   {
       Library l = new Library();

       FictionBook b1 = new FictionBook("Harry Potter", "J.K Rowling", "978-3-16-148410-0", 400, "Fantasy");
       NonFictionBook b2 = new NonFictionBook("dnmszc", "s.sccxz", "24-5312-5251", 300,"Ganerals");

    
   }
}

