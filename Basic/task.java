import java.util.ArrayList;
import java.util.List;

class Book
{
 private String title;
 private String author;
 private String isbn;
 
 public Book(String title, String author,String isbn)
 {
  this.title=title;
  this.author=author;
  this.isbn=isbn;
 }
 public String getTitle()
 {
  return title;
 }
 
 public String getauthor()
 {
  return author;
 }
 
 public String getisbn()
 {
   return isbn;
 }
}

  
  @override
  public String to_string()
  {
	  return "Book{"title = " , +title+ , "author= " , +author+ , "isbn= " , +isbn"};	 
  }
  
  
  class BookCollection
  {
	  private List<Book> books;
	  
	  public BookCollection()
	  {
		  this.books=new ArrayList<>();
	  }
	   
	   public void addBook(Book book)
	   {
		   books.add(book);
	   } 
      
        public void removeBook(Book book)
	   {
		   books.remove(book);
	   }  	  
  
     public void displayBooks()
	 {
		 System.out.println("Books in the collection:");
		 for(Book book:books)
		 {
			System.out.println(book);
		 }
	 }
    }
	
	public class Main
	{
		public static void main(String args[])
		{
			Book book1=new Book("The Great Gatsby","F.Scott Fitgerald","63463");
            Book book2=new Book("To Kill a Mockingbird","Harper Lee","89463");

            BookCollection Collection=new BookCollection();
			Collection.addBook( book1);
			Collection.addBook( book2);
			
			System.out.println("After adding books:");
			collection.displayBooks();
			
			collection.removeBook(book1);
			System.out.println("After removing a book:");
			collection.displayBooks();
		}
    }