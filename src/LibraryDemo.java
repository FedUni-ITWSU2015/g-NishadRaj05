
public class LibraryDemo {

	public static void main(String[] args) {
		
		Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", "42492", true);
        Patron patron1 = new Patron("Nishad Raj", "P001");
        
        System.out.println("Book: " + book1.getTitle() + " | Available: " + book1.getAvailable());
        System.out.println("Patron: " + patron1.getName() + " | Books Borrowed: " + patron1.getNumberOfBooksBorrowed());
        
        if (book1.getAvailable()) {
            book1.checkOut();
            patron1.borrowBook();
        }
        
        System.out.println("Book: " + book1.getTitle() + " | Available: " + book1.getAvailable());
        System.out.println("Patron: " + patron1.getName() + " | Books Borrowed: " + patron1.getNumberOfBooksBorrowed());
        
        book1.returnBook();
        patron1.returnBook();

        
        System.out.println("Book: " + book1.getTitle() + " | Available: " + book1.getAvailable());
        System.out.println("Patron: " + patron1.getName() + " | Books Borrowed: " + patron1.getNumberOfBooksBorrowed());
	}

}
