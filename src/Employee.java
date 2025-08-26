/**
 * Week 5 example code. Not to be used without permission and appropriate
 * referencing
 */

public class Employee {
  private int staffID;              // employee unique identifier
  private String firstName;
  private String surname;
  private String address;           // home address
  private double annualLeave;       // accrued annual leave available (hours)
  private double longServiceLeave;  // accrued long service leave available
  // other data fields from lecture 4 not implemented in this example to keep it
  // brief

  /**
   * Constructor - create the new employee object using the values from the
   * parameters as listed
   *
   * @param ID - The new employees staff ID.
   * @param fName - The new employees first name
   * @param sName - The new employees surname
   * @param leave - The new employees annual leave
   */
  public Employee(int ID, String fName, String sName, double leave) {
    staffID = ID;
    firstName = fName;
    surname = sName;
    annualLeave = leave;
    longServiceLeave = 10.0; // new staff are given a bonus 10 hours long
                             // service leave
  }
  
  public Employee(int ID, String fName, String sName, String add) {
	  staffID = ID;
	  firstName= fName;
	  surname = sName;
	  address = add;
  }

  /**
   * No-Arg Constructor - create the new employee object with some default
   * values. Note: these values are for the purpose of the example only and are
   * not particularly sensible values to choose.
   */
  public Employee() {
    staffID = -1;
    firstName = "not known";
    surname = "not known";
  }
  
  /**
   * @param ID
   *          - The new employees staff identification number
   */
  public void setStaffID(int ID) {
    staffID = ID;
  }
  
  public void setFirstName(String fName) {
	firstName = fName;
  }
  
  public void setSurname(String lName) {
	  surname = lName;
  }
  
  public void setAddress(String add) {
	  address = add;
  }
  
  public void setAnnualLeave(double leave) {
	  annualLeave = leave;
  }
  
  public void setLongServiceLeave(double srleave) { 
	  longServiceLeave = srleave; 
  }
  
  /*
   * All other 'set' methods should also be defined in this class file.
   */

  /**
   * @return staff Identification number
   */
  public int getStaffID() {
    return staffID;
  }

  public String getFirstName() {
    return firstName;
  }
  
  public String getSurname() {
	  return surname; 
  }

  public String getAddress() {
    return address;
  }
  
  public double getAnnualLeave() {
	  return annualLeave; 
  }

  public double getLongServiceLeave() {
    return longServiceLeave;
  }

  /**
   * Determines if the employee has sufficient accrued leave to cover the
   * requested number of hours of leave.
   *
   * @param leaveType – the type of leave requested. A = Annual, L = long service
   * @param requestedHours  – the number of hours of leave requested by the employee
   * @return true if has enough leave, false otherwise
   */
   public boolean requestLeave(String leaveType, float requestedHours) {
	   if (leaveType.equalsIgnoreCase("A")) {
	     if (annualLeave >= requestedHours) { 
	    	 annualLeave = annualLeave - requestedHours;
	       return true;
	     }
	    }  else
	     if (longServiceLeave >= requestedHours) {
	    	 longServiceLeave -= requestedHours; 
	       return true;
	     } 
	     return false;
	   
   }

} // end Employee class