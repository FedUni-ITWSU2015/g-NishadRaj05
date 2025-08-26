
public class Patron {
	
	private String name;
    private String patronId;
    private int numberOfBooksBorrowed;
    
    public Patron(String name, String patronId) {
        this.name = name;
        this.patronId = patronId;
        this.numberOfBooksBorrowed = 0; 
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPatronId(String patronId) {
        this.patronId = patronId;
    }
    
    public void setNumberOfBooksBorrowed(int numberOfBooksBorrowed) {
        this.numberOfBooksBorrowed = numberOfBooksBorrowed;
    }
    
    public String getName() {
        return name;
    }
    
    public String getPatronId() {
        return patronId;
    }
    
    public int getNumberOfBooksBorrowed() {
        return numberOfBooksBorrowed;
    }
    
    public void borrowBook() {
        numberOfBooksBorrowed++;
        System.out.println(name + " has borrowed a book. Total number of books now: " + numberOfBooksBorrowed);
    }

    public void returnBook() {
        if (numberOfBooksBorrowed > 0) {
            numberOfBooksBorrowed--;
            System.out.println(name + " has returned a book. Total number of books now: " + numberOfBooksBorrowed);
        } else {
            System.out.println(name + " does not have any books to return.");
        }
    }
}
