package LawFirmProject;


public class Lawyer {
	
	//Attributes
	
	private String name ;
	private char experienceLevel ;//Lawyer Experience Levels can be:  Junior (J) , Senior (S) , Partner(P)
	private String emailAddress ;
	private String phoneNumber;
	private char licenseStatus ; // Lawyer License Status can be: Active (A) , Suspended (S) , Revoked (R) 
	private String barNumber ;
	private String universityName ;
	private int yearsOfExperience ;
	public Case[] cases ;
	private int numberOfCases;
	private int numberOfCasesWon;
	private int numberOfCasesLost;
	private double baseSalary ;
	private double salary ;
	
	
	
	
	// Parameterized Constructor
	
	public Lawyer(String name,char experienceLevel, String emailAddress, String phoneNumber,char licenseStatus, String barNumber,
			String universityName, int casesSize, int yearsOfExperience, double baseSalary) {
	
		this.name = name;
		this.experienceLevel = experienceLevel;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.licenseStatus = licenseStatus;
		this.barNumber = barNumber;
		this.universityName = universityName;
		cases = new Case[casesSize];
		numberOfCases = 0 ;
		this.yearsOfExperience = yearsOfExperience;
		this.numberOfCasesWon = 0;
		this.numberOfCasesLost = 0;
		this.baseSalary = baseSalary;
		salary = 0 ;
	}
	
	//Method add a case 
	public boolean addCase(Case c) {
		if(numberOfCases < cases.length ) {
			cases[numberOfCases++] = c;
			return true ;
		}
		else
			return false; 
		
	}
	//Method delete a case by case number  
	public boolean deleteCase(String caseNum) {
		for (int i = 0 ; i < numberOfCases ; i++ )
    		if (cases[i].getCaseNumber().equals(caseNum))  {
    			cases[i] = cases[numberOfCases - 1];
    			cases[--numberOfCases] = null ;
    			return true ;
    		}
		return false ;
	}

	//Method search for a case by case number 
    public Case searchForCase(String caseNum){
    	for (int i = 0 ; i < numberOfCases ; i++ )
    		if (cases[i].getCaseNumber().equals(caseNum))
    			return cases[i] ; 
    	
    		return null ;
		
	}
    
  //Method Update Case Status 
    public void UpdateCaseStatus(Case C, char newStatus) {
    	if(newStatus == 'W')
    		numberOfCasesWon++;
    	else 
    		if(newStatus == 'L')
    			numberOfCasesLost++ ;
    	
    	C.setStatus(newStatus);
    	
    	
    }
    
  //Method that calculate TotalLegal Expenses For a Lawyer
    public double calculateTotalLegalExpenses() {
    	double totalLegalExpenses = 0 ;
    	for (int i = 0 ; i < numberOfCases ; i++ )
    		totalLegalExpenses += cases[i].calculateLegalExpenses();
    	return totalLegalExpenses ;
    }
	
  //Method That Calculate Lawyer Salary Depending On Experience Level
	public double calculateSalary() {
		
		switch (experienceLevel) {
        case 'J':
        	salary = baseSalary + (numberOfCasesWon * 0.10 * calculateTotalLegalExpenses());
            break;
        case 'S':
        	salary = baseSalary + (numberOfCasesWon * 0.25 * calculateTotalLegalExpenses());
            break;
        case 'P':
        	salary = baseSalary + (numberOfCasesWon * 0.5 * calculateTotalLegalExpenses() );
            break;
        default:
            System.out.println("Invaled Experience Level");
		}
		return salary ;
		
	}
	
	//Method That List All Lawyer’s Cases
	public void listAllCases() {
		for(int i = 0 ; i < numberOfCases; i++) {
			System.out.println("\n"+(i+1) + " :\n");
			System.out.println("\n" + cases[i] + "\n");
		}
	}
	
	
	public boolean reassignCases(Lawyer replacementLawyer) {
		if (numberOfCases <= replacementLawyer.cases.length - replacementLawyer.getNumberOfCases() ) {
			for(int i = 0 ; i < numberOfCases ; i++) 
				replacementLawyer.addCase(cases[i]);
				
			System.out.println("All " + name +"’s cases are handled by " + replacementLawyer.getName() );
			return true ;
		}
		
		return false ;
	}
	

	public String toString() {
		
	String experienceLevelString = "" ;
	switch (experienceLevel) {
    case 'J':
    	experienceLevelString = "Junior";
        break;
    case 'S':
    	experienceLevelString = "Senior";
        break;
    case 'P':
    	experienceLevelString = "Partner";
        break;
    default:
        System.out.println("Invaled Experience Level");
	}
	
	String licenseStatusString = "" ;
	switch (experienceLevel) {
    case 'A':
    	licenseStatusString = "Active";
        break;
    case 'S':
    	licenseStatusString = "Suspended";
        break;
    case 'R':
    	licenseStatusString = "Revoked";
        break;
    default:
        System.out.println("Invaled license Status ");
	}
	
        	
		String sum = "" ;
		sum += "Lawyer : \nName : "+ name + "\nExperience Level : " + experienceLevelString + "\nEmail Address : " + emailAddress +
				"\nPhone Number : " + phoneNumber +"\nLicense Status : " + licenseStatusString + "\nBar Number : " + barNumber +
				"\nUniversity Name : " + universityName +"\n Years Of Experience : " + yearsOfExperience + "\nBase Salary :" + baseSalary +
				"\nSalary :" + calculateSalary() +"\nNumber Of Cases : " + numberOfCases + "\nNumber Of Won Cases : " + numberOfCasesWon +"\nNumber Of Lost Cases : " +
				+ numberOfCasesLost +"\n Cases :- " ;
		
		for(int i = 0 ; i < numberOfCases; i++) // list all cases methode 
			sum += "\nCase"+(i+1)+" :\n"+ cases[i] + "\n"  ;
		
		
		return sum ;
				
	}

	
	
	// setters & getters 
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public char getExperienceLevel() {
		return experienceLevel;
	}


	public void setExperienceLevel(char experienceLevel) {
		this.experienceLevel = experienceLevel;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public char getLicenseStatus() {
		return licenseStatus;
	}


	public void setLicenseStatus(char licenseStatus) {
		this.licenseStatus = licenseStatus;
	}


	public String getBarNumber() {
		return barNumber;
	}


	public void setBarNumber(String barNumber) {
		this.barNumber = barNumber;
	}


	public String getUniversityName() {
		return universityName;
	}


	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}


	public int getYearsOfExperience() {
		return yearsOfExperience;
	}


	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public int getNumberOfCases() {
		return numberOfCases;
	}

	public void setNumberOfCases(int numberOfCases) {
		this.numberOfCases = numberOfCases;
	}
	public int getNumberOfCasesWon() {
		return numberOfCasesWon;
	}


	public void setNumberOfCasesWon(int numberOfCasesWon) {
		this.numberOfCasesWon = numberOfCasesWon;
	}


	public int getNumberOfCasesLost() {
		return numberOfCasesLost;
	}


	public void setNumberOfCasesLost(int numberOfCasesLost) {
		this.numberOfCasesLost = numberOfCasesLost;
	}


	public double getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	

	
	

}
