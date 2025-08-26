
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
}
