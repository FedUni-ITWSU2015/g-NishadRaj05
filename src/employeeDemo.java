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
        
        System.out.print("\nDo you wish to take leave? Y/N: ");
        String ans = scan.nextLine().toUpperCase();

        if (ans.equals("Y")) {
            System.out.print("How many days leave? ");
            int days = scan.nextInt();
            scan.nextLine(); // consume newline

            System.out.print("(A)nnual Leave or (L)ong Service leave? A/L: ");
            String type = scan.nextLine().toUpperCase();

            int hoursRequested = days * 8;

            boolean granted = geek.requestLeave(type, hoursRequested);

            if (granted) {
                System.out.println("\n" + geek.getFirstName() + 
                                   " is able to take the leave");
                if (type.equals("A")) {
                    System.out.println("Annual Leave remaining for " + 
                                       geek.getStaffID() + " is " + 
                                       geek.getAnnualLeave());
                } else {
                    System.out.println("Long Service Leave remaining for " + 
                                       geek.getStaffID() + " is " + 
                                       geek.getLongServiceLeave());
                }
            } else {
                System.out.println("\nSorry, not enough leave available.");
            }

            // Redisplay Bob's details
            System.out.println("\nLet's check the values of your employee object to see what has changed.");
            displayEmployee(geek);
        }

        
    }

    // Helper method to display employee details
    	public static void displayEmployee(Employee e) {
    		System.out.println("Staff ID: " + e.getStaffID());
    		System.out.println("First Name: " + e.getFirstName());
    		System.out.println("Surname: " + e.getSurname());
    		System.out.println("Annual Leave: " + e.getAnnualLeave());
    		System.out.println("Long Service Leave: " + e.getLongServiceLeave());
    		System.out.println("Home Address: " + e.getAddress());
	  }
}
