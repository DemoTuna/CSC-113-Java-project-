package LawFirmProject;

public class LawFirm {
	
	//Attributes
	private String nameOfFirm;
	private String location;
	private String yearFounded;
	private String ownerName;
	private double income;
	private int numberOfLawyers;
	private Lawyer [] lawyersList;
	
	//Parameterized constructor
	public LawFirm(String nameOfFirm , String location , String yearFounded ,  String ownerName , int sizeOfLawyers ) {
	
		this.nameOfFirm = nameOfFirm;
		this.location = location;
		this.yearFounded = yearFounded;
		this.ownerName = ownerName;
		this.income = 0; 
		lawyersList = new Lawyer [sizeOfLawyers];
		numberOfLawyers = 0 ;
	}

	// Method add a lawyer  
	public boolean addLawyer(Lawyer lawyer) {
		if(numberOfLawyers < lawyersList.length) {
			lawyersList[numberOfLawyers++] = lawyer;
			return true;
		}
		return false;

	}   

	
	//Method search for a lawyer by bar number 
		public Lawyer searchForLawyer(String barNum){
			for(int i = 0 ; i < numberOfLawyers ; i ++)
				if (lawyersList[i].getBarNumber().equals(barNum))
					return  lawyersList[i];
		
					return null ;		
		}
		
		
		
	// Method dismiss a Lawyer by bar Number
	public boolean dismissLawyer(String barNum , Lawyer replacementLawyer){
		for(int i = 0 ; i<numberOfLawyers ; i++)
			if(lawyersList[i].getBarNumber().equals(barNum))
				if(lawyersList[i].reassignCases(replacementLawyer)){
					lawyersList[i] = lawyersList[numberOfLawyers-1];
					lawyersList[--numberOfLawyers]= null ;
				return true;
			}
		return false; // there is some flaws
	}
	
	// Method That Promote A Lawyer If The Lawyer Deserve promotion
	public void PromoteLawyer(Lawyer lawyer) {
		lawyer.setExperienceLevel(Character.toUpperCase(lawyer.getExperienceLevel()));
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
	
	//Method That List All Lawyers Info Without Cases Details
	public void ListAllLawyers() {
		for(int i = 0 ; i < numberOfLawyers; i++) {
			System.out.println("\n"+(i+1) + " :\n");
			lawyersList[i].DisplayLawyer(); 
		}
	}
	
	//Method That List All Cases Info Without Document Details	
	public void ListAllCases() {
		for(int i = 0 ; i < numberOfLawyers; i++) {
			System.out.println("\n"+(i+1) + " :\n");
			lawyersList[i].listAllCase();
			}	
	}
	
	//Method That List All Documents 
	public void ListAllDocuments() {
		for(int i = 0 ; i < numberOfLawyers; i++) {
			System.out.println("\n"+(i+1) + " :\n");
			lawyersList[i].listAllDocuments();
			}	
	}
	
	//Method That List All Clients
	public void ListAllClients() {
		for(int i = 0 ; i < numberOfLawyers; i++) {
			System.out.println("\n"+(i+1) + " :\n");
			lawyersList[i].listAllClient();
			}	
	}
	
	
	
	
	//Method That Calculate Firm Expenses
	public double calculateFirmExpenses() {
		double FirmExpenses = 0 ;
		for(int i = 0 ; i<numberOfLawyers ; i++)
			FirmExpenses += lawyersList[i].calculateSalary();
		
		return FirmExpenses ;
	}
	

	//Method That Calculate Firm Revenue
	public double calculateFirmRevenue() {
		double FirmRevenue = 0 ;
		for(int i = 0 ; i<numberOfLawyers ; i++)
			FirmRevenue += lawyersList[i].calculateTotalLegalExpenses();
		
		return FirmRevenue ;
	}
	
	//Method That Calculate Firm Income
	public double calculateFirmIncome() {
		income = calculateFirmRevenue() - calculateFirmExpenses();
		
		return income ;
	}
	
   
   
	// toString method 
	public String toString() {
		return "Name of firm is: " + nameOfFirm + "\nLocation: " + location + " Year founding: " + yearFounded + "\nOwner name:" + ownerName + "\nFirm Income:  " + calculateFirmIncome();
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
