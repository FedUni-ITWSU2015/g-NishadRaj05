
public class Patron {
	
	private String name;
    private String patronId;
    private int numberOfBooksBorrowed;
    
    public Patron(String name, String patronId) {
        this.name = name;
        this.patronId = patronId;
        this.numberOfBooksBorrowed = 0; 
    }
}
