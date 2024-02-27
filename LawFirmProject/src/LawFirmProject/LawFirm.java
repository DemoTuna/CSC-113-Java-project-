package LawFirmProject;

public class LawFirm {
	private String nameOfFrime;
	private String location;
	private int yearFounded;
	private String ownerName;
	private int numberOfLawyers;
	//private String tybeOfCases;
	private int numberOfCases;
	private double earningsFromLawyers;
	private Lawyer [] lawyers;
	
	
	public LawFirm(String nameOfFrime , String location , int yearFounded , private String ownerName , int numberOfLawyers , int numberOfCases , double earningsFromLawyers) {
	
this.nameOfFrime = nameOfFrime;
this.location = location;
this.yearFounded = yearFounded;
this.ownerName = ownerName;
this.numberOfCases = numberOfCases;
//this.tybeOfCases = tybeOfCases;
this.earningsFromLawyers = earningsFromLawyers;
lawyers = new Lawyer [numberOfLawyers];
}

	
	public String getNameOfFrime() {
		return nameOfFrime;
	}
	
	public String getLocation() {
		return location;
	}
	
	
	public String getOwnerName() {
		return ownerName;
	}
	
	
	/*public String getTybeOfCases() {
		return tybeOfCases; 
	} */
	
	
	public int getYearFounded() { 
		return yearFounded;
	}
	
	public int getNumberOfCases() {
		return numberOfCases;
	}
	
	public double getEarningsFromLawyers() {
		return earningsFromLawyers;
	}
	
	public void setNameOfFrime(String nameOfFrime) {
		this.nameOfFrime = nameOfFrime;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setOwnerName(String ownerName) { 
		this.ownerName = ownerName;
	}
	/*public void setTybeOfCases(String tybeOfCases) {
		this.tybeOfCases = tybeOfCases;
	}*/
	public void setYearFounded(int yearFounded) { 
		this.yearFounded = yearFounded;
	}
	public void setNumberOfCases(numberOfCases) { 
		this.numberOfCases = numberOfCases;
	}
	public void setEarningsFromLawyers(double earningsFromLawyers) { 
		this.earningsFromLawyers = earningsFromLawyers;
	}
	
	
	public String toString() {
		return "Name of firm is: " + nameOfFrime + "\nLocation: " + location + " Year founding: " + yearFounded + "\nOwner name:" + ownerName + "\nNumber of Cases: " + numberOfCases + "Earnings From lawyers = " + earningsFromLawyers;
	}
}
