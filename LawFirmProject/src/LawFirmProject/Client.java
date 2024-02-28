package LawFirmProject;


public class Client {
	
	//attributes
	
	private String name ;
	private String dayOfBirth ;
	private String id ;
	private String phoneNumber;
	private String emailAddress ;
	
	
	// parameterized constructor
	
	public Client(String name, String dayOfBirth, String id, String phoneNumber, String emailAddress) {
		
		this.name = name;
		this.dayOfBirth = dayOfBirth;
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}


	// toString method
	
	public String toString() {
		
		return "Client Info :- \nName: " + name +"\nDay Of Birth: " + dayOfBirth + "\nID: " + id + "\nPhone Number: " + phoneNumber + "\nEmail Address: " + emailAddress ;
	}
	
	// setters & getters
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDayOfBirth() {
		return dayOfBirth;
	}


	public void setDayOfBirth(String dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
	

}
