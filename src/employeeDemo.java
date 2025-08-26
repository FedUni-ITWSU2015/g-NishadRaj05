import java.util.Scanner;

public class employeeDemo {
	public static void main(String[] args) {
	    /*
	     * This program demonstrates the use of the Employee class and some of its
	     * methods including the two constructors
	     */
/*
	    Employee person = new Employee(54545, "Bob", "Down", 7.5);
	    System.out.println("Values for person object:");
	    System.out.println("Staff ID: " + person.getStaffID());
	    System.out.println("First Name: " + person.getFirstName());
	    System.out.println("Long Service Leave: " + person.getLongServiceLeave());
	    System.out.println("Home Address: " + person.getAddress());

	    System.out.println("\nValues for accountant object:");
	    Employee accountant = new Employee();
	    System.out.println("Staff ID: " + accountant.getStaffID());
	    System.out.println("First Name: " + accountant.getFirstName());
	    System.out.println("Surname: " + accountant.getSurname());
	    System.out.println("Annual Leave: " + accountant.getAnnualLeave());
	    System.out.println("Long Service Leave: " + accountant.getLongServiceLeave());
	    System.out.println("Home Address: " + accountant.getAddress());
	    */
	    Scanner scan = new Scanner(System.in);
	    
        System.out.print("Let's create the geek object. Please enter the following data for the geek object.");
	    
        System.out.print("\nEnter staffID: ");
        int ID = scan.nextInt();
        
        scan.nextLine();
        
        System.out.print("Enter First Name: ");
        String fName = scan.nextLine();
        
        System.out.print("Enter Surname: ");
        String sName = scan.nextLine();
        
        System.out.print("Enter address: ");
        String addr = scan.nextLine();
        
        Employee geek = new Employee(ID, fName, sName, addr);
        
        System.out.println("\nWe just created the geek object. Let's check the value of it's data fields. ");
        
        System.out.println("StaffID: " + geek.getStaffID());
        System.out.println("First Name: " + geek.getFirstName());
        System.out.println("Surname: " + geek.getSurname());
        System.out.println("Annual Leave: " + geek.getAnnualLeave());
	    System.out.println("Long Service Leave: " + geek.getLongServiceLeave());
        System.out.println("Address: " + geek.getAddress());
        
        geek.setAnnualLeave(40);
        
	    System.out.println("\nCongratulaions " + geek.getFirstName() + ", you made it through your first year.");
	    System.out.println("You now have annual leave available to you.");
	    System.out.println("\nLet's check the values of you employee object to see hw much leave you can take.");
	    
        System.out.println("StaffID: " + geek.getStaffID());
        System.out.println("First Name: " + geek.getFirstName());
        System.out.println("Surname: " + geek.getSurname());
        System.out.println("Annual Leave: " + geek.getAnnualLeave());
	    System.out.println("Long Service Leave: " + geek.getLongServiceLeave());
        System.out.println("Address: " + geek.getAddress());
	  }
}
