package LawFirmProject;

public class LawFirm {
//Attributes
	private String nameOfFirm;
	private String location;
	private String yearFounded;
	private String ownerName;
	private int numberOfLawyers;
	private double income;
	private Lawyer [] lawyers;
	
	//Parameterized constructor
	public LawFirm(String nameOfFirm , String location , String yearFounded ,  String ownerName , int numberOfLawyers ) {
	
		this.nameOfFirm = nameOfFirm;
		this.location = location;
		this.yearFounded = yearFounded;
		this.ownerName = ownerName;
		this.income = 0; 
		lawyers = new Lawyer [numberOfLawyers];
		numberOfLawyers = 0 ;
	}

	// Method add a lawyer  
	public boolean addLawyer(Lawyer lawyer) {
		if(numberOfLawyers < lawyers.length) {
			lawyers[numberOfLawyers++] = lawyer;
			return true;
		}
		return false;

	}   

   
	//Method search for a lawyer by name 
	public Lawyer searchForLawyerByName(String name){
		for(int i = 0 ; i < numberOfLawyers ; i++)
			if (lawyers[i].getName().equals(name))
				return  lawyers[i];
	
				return null ;		
	}
	
	//Method search for a lawyer by bar number 
		public Lawyer searchLawyerByBarNumber(String barNum){
			for(int i = 0 ; i < numberOfLawyers ; i ++)
				if (lawyers[i].getBarNumber().equals(barNum))
					return  lawyers[i];
		
					return null ;		
		}
		
		

	 // Method dismiss a Lawyer by name
	     public boolean dismissLawyerByName(String name , Lawyer replacementLawyer) {
	    	
			for(int i = 0 ; i<numberOfLawyers ; i++)
				if(lawyers[i].getName().equals(name))
					if(lawyers[i].reassignCases(replacementLawyer)){
					lawyers[i] = lawyers[numberOfLawyers-1];
					lawyers[--numberOfLawyers]= null ;
					return true;
					}
	 
	    		 return false; // there is some flaws
		}
   
		
		
	// Method dismiss a Lawyer by bar Number
	public boolean dismissLawyerByBarNumber(String barNum , Lawyer replacementLawyer){
		for(int i = 0 ; i<numberOfLawyers ; i++)
			if(lawyers[i].getBarNumber().equals(barNum))
				if(lawyers[i].reassignCases(replacementLawyer)){
				lawyers[i] = lawyers[numberOfLawyers-1];
				lawyers[--numberOfLawyers]= null ;
				return true;
			}
		return false; // there is some flaws
	}
	
	
	public void PromoteLawyer(Lawyer lawyer) {
		if (lawyer.getExperienceLevel()== 'J' && lawyer.getYearsOfExperience() >= 4) {
			lawyer.setExperienceLevel('S');
			lawyer.setBaseSalary(lawyer.getBaseSalary()+2000);
			System.out.println("The lawyer "+ lawyer.getName() +" has been promoted to Senior");

		}
		else 
			if(lawyer.getExperienceLevel()== 'S' && lawyer.getNumberOfCasesWon()>=10 ) { 
				lawyer.setExperienceLevel('P');
				lawyer.setBaseSalary(lawyer.getBaseSalary()+3000);
				System.out.println("The lawyer "+ lawyer.getName() +" has been promoted to Partner");
			}
			else 
				if(lawyer.getExperienceLevel()== 'P')
					System.out.println("The lawyer "+ lawyer.getName() +" is a Partner ,the lawyer do not need Promotion"); 
					else
						System.out.println("The lawyer "+ lawyer.getName() + "should work on himself/ herself more to earn a Promotion ");	
		
	}
	
	
	public void listAllLawyers() {
		for(int i = 0 ; i < numberOfLawyers; i++) {
			System.out.println("\n"+(i+1) + " :\n");
			System.out.println("\n" + lawyers[i] + "\n");
		}
	}
	
	public double calculateFirmExpenses() {
		double FirmExpenses = 0 ;
		for(int i = 0 ; i<numberOfLawyers ; i++)
			FirmExpenses += lawyers[i].calculateSalary();
		
		return FirmExpenses ;
	}
	
	public double calculateFirmRevenue() {
		double FirmRevenue = 0 ;
		for(int i = 0 ; i<numberOfLawyers ; i++)
			FirmRevenue += lawyers[i].calculateTotalLegalExpenses();
		
		return FirmRevenue ;
	}
	
	public double calculateFirmIncom() {
		income = calculateFirmRevenue() - calculateFirmExpenses();
		
		return income ;
	}
	
   
   
	// toString method 
	public String toString() {
		return "Name of firm is: " + nameOfFirm + "\nLocation: " + location + " Year founding: " + yearFounded + "\nOwner name:" + ownerName + "\nFirm Income:  " + calculateFirmIncom();
		} 
   
   
	/// setters & getters 
	public String getNameOfFirm() {
			return nameOfFirm;
		}
	
	public String getLocation() {
		return location;
	}
	
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public String getYearFounded() { 
		return yearFounded;
	}
	
	public double getIncome() {
		return income;
	}

	public void setNameOfFirm(String nameOfFirm) {
		this.nameOfFirm = nameOfFirm;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setOwnerName(String ownerName) { 
		this.ownerName = ownerName;
	}

	public void setYearFounded(String yearFounded) { 
		this.yearFounded = yearFounded;
	}

	public void setIncome(double income) { 
		this.income = income;
	}
	
	
	
}
