package LawFirmProject;

public class LawFirm {
//attributes
	private String nameOfFirm;
	private String location;
	private int yearFounded;
	private String ownerName;
	private int numberOfLawyers;
	//private String tybeOfCases;
	private int numberOfCases;
	private double earningsFromLawyers;
	private Lawyer [] lawyers;
	
	//Parameterized constructor
	public LawFirm(String nameOfFirm , String location , int yearFounded ,  String ownerName , int numberOfLawyers , int numberOfCases , double earningsFromLawyers) {
	
this.nameOfFirm = nameOfFirm;
this.location = location;
this.yearFounded = yearFounded;
this.ownerName = ownerName;
this.numberOfCases = numberOfCases;
//this.tybeOfCases = tybeOfCases;
this.earningsFromLawyers = earningsFromLawyers;
lawyers = new Lawyer [numberOfLawyers];
}

// add new lawyer to the lawyers array 
public boolean addLawyer(Lawyer newLawyer) {
if(numberOfLawyers < lawyers.length) {
lawyers[numberOfLawyers] = newLawyer;
numberOfLawyers++;
return true;
}
return false;

}   
   
  
   
// search for the lawyer name and return the number of cases won
public int searchLawyer(String name){
for(int i = 0 ; i < numberOfLawyers ; i ++)
if (lawyers[i].getName().equals(name))
return  lawyers[i].getNumberOfCasesWon();

return -1;

}
   
// Method dispensed with the lawyer who loses cases more than wins 
   public boolean removeLawyer(){
   for(int i = 0 ; i<numberOfLawyers ; i++)
   if(lawyers[i].getNumberOfCasesWon() < lawyers[i].getNumberOfCasesLost()){
   for (int j = i ; j<numberOfLawyers-1 ; j++)
   lawyers[j] = lawyers[j+1];
   numberOfLawyers--;
   lawyers[numberOfLawyers] = null;
   return true;
   }
   return false; // there is some flaws
   }
   
   
   // toString method 
  public String toString() {
		return "Name of firm is: " + nameOfFirm + "\nLocation: " + location + " Year founding: " + yearFounded + "\nOwner name:" + ownerName + "\nNumber of Cases: " + numberOfCases + "Earnings From lawyers = " + earningsFromLawyers;
	} 
   
   
   // Getter methods
	public String getNameOfFirm() {
		return nameOfFirm;
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


	// Setter methods
	public void setNameOfFirm(String nameOfFirm) {
		this.nameOfFirm = nameOfFirm;
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
	public void setNumberOfCases(int numberOfCases) { 
		this.numberOfCases = numberOfCases;
	}
	public void setEarningsFromLawyers(double earningsFromLawyers) { 
		this.earningsFromLawyers = earningsFromLawyers;
	}
	
	
	
}
