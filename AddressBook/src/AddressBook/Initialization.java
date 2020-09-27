package AddressBook;

public class Initialization {
	
	// declaring variables for details of contact
	public String firstName;
	public  String lastName;
	public  String addressCity;
	public  String addressState;

	public  int addresszip;
	public  String phoneNumber;
	public  String email;

	  // constructor for variable initilization
	public Initialization(String firstName, String lastName, String addressCity, String addressState, int addresszip,
			String phoneNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.addressCity = addressCity;
		this.addressState = addressState;
		this.addresszip = addresszip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the address
	 */
	
	public String getCity() {
		return addressCity;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.addressCity = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return addressState;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.addressState = state;
	}
	/**
	 * @return the zip
	 */
	public int getZip() {
		return addresszip;
	}
	/**
	 * @param zip the zip to set
	 */
	public void setZip(int zip) {
		this.addresszip = zip;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
