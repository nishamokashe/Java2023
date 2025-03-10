import java.util.Array;
import java.;
abstract class Book 
{
    private String title;
    private String author;
    private String ISBN;
    private int numberOfPages;

    public Book(String title, String author, String ISBN, int numberOfPages) 
    {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() 
    {
        return title;
    }

    public String getAuthor() 
    {
        return author;
    }

    public String getISBN() 
    {
        return ISBN;
    }

    public int getNumberOfPages() 
    {
        return numberOfPages;
    }

    public abstract void displayInfo();
}

class FictionBook extends Book 
{
    private String genre;

    public FictionBook(String title, String author, String ISBN, int numberOfPages, String genre) 
    {
        super(title, author, ISBN, numberOfPages);
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Fiction Book:");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("ISBN: " + getISBN());
        System.out.println("Number of Pages: " + getNumberOfPages());
        System.out.println("Genre: " + genre);
    }

    public String getGenre() 
    {
        return genre;
    }
}

class NonFictionBook extends Book 
{
    private String subject;

    public NonFictionBook(String title, String author, String ISBN, int numberOfPages, String subject) 
    {
        super(title, author, ISBN, numberOfPages);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        System.out.println("Non-Fiction Book:");

        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("ISBN: " + getISBN());
        System.out.println("Number of Pages: " + getNumberOfPages());
        System.out.println("Subject: " + subject);
    }

    public String getSubject() 
    {
        return subject;
    }
}

interface LibraryOperations
{
    void addBook(Book book);
    void removeBook(String ISBN);
    void displayAllBooks();
}
class Library implements LibraryOperations 
{
    private List<Book>books;
    public Library()
    {
        books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) 
    {
         books.add(book);
        System.out.println("Book added" +book.getTitle);
    }
    public void removeBook(Book book) 
    {
         for(Book book : books)
         {
            book.displayInfo();
            System.out.println();
         }





    public Book[] books; // Array to store books
    public int numBooks; // Current number of books
    
    // Constructor
    public Library()  // Constructor
    {
        books = new Book[100];
        numBooks = 0;
    }
    
    // Implementing methods from LibraryOperations interface
    @Override
    public void addBook(Book book) {
        if (numBooks < 100) 
        {
            books[numBooks] = book;
            numBooks++;
            System.out.println("Book added successfully.");
        } 
        else 
        {
            System.out.println("Cannot add more books the is Library is full.");
        }
    }
    
    @Override
    public void removeBook(String ISBN) {
        boolean found = false;
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getISBN().equals(ISBN)) {
                // Shift books to fill the gap
                for (int j = i; j < numBooks - 1; j++) {
                    books[j] = books[j + 1];
                }
                numBooks--;
                found = true;
                System.out.println("Book with ISBN " + ISBN + " removed successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ISBN " + ISBN + " not found.");
        }
    }
    
    @Override
    public void displayAllBooks() 
    {
        if (numBooks == 0) 
        {
            System.out.println("No books in the library.");
        } 
        else 
        {
            System.out.println("Books in the library:");
            for (int i = 0; i < numBooks; i++) 
            {
                books[i].displayInfo();
                System.out.println("---------------------------");
            }
        }
    }
    
    // Main method to demonstrate usage
    public static void main(String[] args) {
        Library li = new Library();
        
        // Adding fictional books
        FictionBook f1 = new FictionBook("Harry Potter", "J.K. Rowling", "9780545069670", 400, "Fantasy");
        FictionBook f2 = new FictionBook("The Hobbit", "J.R.R. Tolkien", "9780547928227", 300, "Fantasy");
        li.addBook(f1);
        li.addBook(f2);
        
        // Adding non-fictional books
        NonFictionBook nF1 = new NonFictionBook("Sapiens", "Yuval Noah Harari", "9780062316097", 450, "Anthropology");
        li.addBook(nF1);
        
        // Display all books
        li.displayAllBooks();
        
        // Removing a book
        li.removeBook("9780547928227");
        
        // Display all books again
        li.displayAllBooks();
    }
}

