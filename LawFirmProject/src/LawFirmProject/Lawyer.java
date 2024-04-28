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
	public Case[] casesList ;
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
		casesList = new Case[casesSize];
		numberOfCases = 0 ;
		this.yearsOfExperience = yearsOfExperience;
		this.numberOfCasesWon = 0;
		this.numberOfCasesLost = 0;
		this.baseSalary = baseSalary;
		salary = 0 ;
	}
	
	//Method add a case 
	public boolean addCase(Case c) {
		if(numberOfCases < casesList.length ) {
			casesList[numberOfCases++] = c;
			UpdateCaseStatus(c,c.getStatus());
			return true ;
		}
		else
			return false; 
		
	}
	//Method delete a case by case number  
	public boolean deleteCase(String caseNum) {
		for (int i = 0 ; i < numberOfCases ; i++ )
    		if (casesList[i].getCaseNumber().equals(caseNum))  {
    			casesList[i] = casesList[numberOfCases - 1];
    			casesList[--numberOfCases] = null ;
    			return true ;
    		}
		return false ;
	}

	//Method search for a case by case number 
    public Case searchForCase(String caseNum){
    	for (int i = 0 ; i < numberOfCases ; i++ )
    		if (casesList[i].getCaseNumber().equals(caseNum))
    			return casesList[i] ; 
    	
    		return null ;
		
	}
    
  //Method Update Case Status 
    public void UpdateCaseStatus(Case C, char newStatus) {
    	if(newStatus == 'W'|| newStatus == 'w' )
    		numberOfCasesWon++;
    	else 
    		if(newStatus == 'L' || newStatus == 'l')
    			numberOfCasesLost++ ;
    	
    	C.setStatus(newStatus);
    	
    	
    }
    
  //Method that search For Document In Lawyer
    public Document searchForDocumentInLawyer(String trackingNum){
		for (int i = 0 ; i < numberOfCases ; i++ )
			if(casesList[i].searchForDocument(trackingNum) != null) {
				return casesList[i].searchForDocument(trackingNum) ;
			}
		
		return null ;
    }
    
    
  //Method that calculate Total Legal Expenses For a Lawyer
    public double calculateTotalLegalExpenses() {
    	double totalLegalExpenses = 0 ;
    	for (int i = 0 ; i < numberOfCases ; i++ )
    		totalLegalExpenses += casesList[i].calculateLegalExpenses();
    	return totalLegalExpenses ;
    }
	
  //Method That Calculate Lawyer Salary Depending On Experience Level
	public double calculateSalary() {
		
		switch (experienceLevel) {
        case 'J': case 'j' :
        	salary = baseSalary + ( 0.10 * calculateTotalLegalExpenses());
            break;
        case 'S': case 's' :
        	salary = baseSalary + ( 0.25 * calculateTotalLegalExpenses());
            break;
        case 'P': case 'p' :
        	salary = baseSalary + ( 0.5 * calculateTotalLegalExpenses() );
            break;
        default:
            System.out.println("Invaled Experience Level");
		}
		return salary ;
		
	}
	
	//Method That List All Lawyer’s Client
	public void listAllClient() {
		for(int i = 0 ; i < numberOfCases; i++) {
			System.out.println("");
			casesList[i].getClient().DisplayClient();
			
		}
	}
	
	   //Method That List All Lawyer’s Documents
		public void listAllDocuments() {
			for(int i = 0 ; i < numberOfCases; i++) {
				System.out.println("");
				casesList[i].listAllDocument();
				
			}	
	}
	
	//Method That List All Lawyer’s Cases
	public void listAllCase() {
		for(int i = 0 ; i < numberOfCases; i++) {
			System.out.println("");
			casesList[i].DisplayCase();
		}
	}
	
	//Method That Reassign All Cases To Another Lawyer
	public boolean reassignCases(Lawyer replacementLawyer) {
		if (numberOfCases <= replacementLawyer.casesList.length - replacementLawyer.getNumberOfCases() ) {
			for(int i = 0 ; i < numberOfCases ; i++) 
				replacementLawyer.addCase(casesList[i]);
				
			System.out.println("All " + name +"’s cases are handled by " + replacementLawyer.getName() );
			return true ;
		}
		
		return false ;
	}
	
	//Method That Display Lawyer Info Only 
	public void DisplayLawyer() {
		String experienceLevelString = "" ;
		switch (experienceLevel) {
	    case 'J': case'j':
	    	experienceLevelString = "Junior";
	        break;
	    case 'S': case's':
	    	experienceLevelString = "Senior";
	        break;
	    case 'P': case'p':
	    	experienceLevelString = "Partner";
	        break;
	    default: 
	        System.out.println("Invaled Experience Level");
		}
		
		String licenseStatusString = "" ;
		switch (licenseStatus) {
	    case 'A': case'a':
	    	licenseStatusString = "Active";
	        break;
	    case 'S': case's':
	    	licenseStatusString = "Suspended";
	        break;
	    case 'R': case'r':
	    	licenseStatusString = "Revoked";
	        break;
	    default:
	        System.out.println("Invaled license Status ");
		}
		System.out.println("**********************************************");
		System.out.println("Lawyer : \nName : " + name);
		System.out.println("Experience Level : " + experienceLevelString);
		System.out.println("Email Address : " + emailAddress);
		System.out.println("Phone Number : " + phoneNumber);
		System.out.println("License Status : " + licenseStatusString);
		System.out.println("Bar Number : " + barNumber);
		System.out.println("University Name : " + universityName);
		System.out.println("Years Of Experience : " + yearsOfExperience);
		System.out.println("Base Salary :" + baseSalary);
		System.out.println("Salary :" + calculateSalary());
		System.out.println("Number Of Cases : " + numberOfCases);
		System.out.println("Number Of Won Cases : " + numberOfCasesWon);
		System.out.println("Number Of Lost Cases : " + numberOfCasesLost );
	}
	
	// toString method 
	public String toString() {
		
	String experienceLevelString = "" ;
	switch (experienceLevel) {
    case 'J': case 'j' :
    	experienceLevelString = "Junior";
        break;
    case 'S': case 's' :
    	experienceLevelString = "Senior";
        break;
    case 'P': case 'p' :
    	experienceLevelString = "Partner";
        break;
    default:
        System.out.println("Invaled Experience Level");
	}
	
	String licenseStatusString = "" ;
	switch (licenseStatus) {
    case 'A': case 'a' :
    	licenseStatusString = "Active";
        break;
    case 'S': case 's' :
    	licenseStatusString = "Suspended";
        break;
    case 'R': case 'r' :
    	licenseStatusString = "Revoked";
        break;
    default:
        System.out.println("Invaled license Status ");
	}
	
		String sum = "" ;
		sum += "**********************************************\n" + "Lawyer : \nName : "+ name + "\nExperience Level : " + experienceLevelString + "\nEmail Address : " + emailAddress +
				"\nPhone Number : " + phoneNumber +"\nLicense Status : " + licenseStatusString + "\nBar Number : " + barNumber +
				"\nUniversity Name : " + universityName +"\nYears Of Experience : " + yearsOfExperience + "\nBase Salary :" + baseSalary +
				"\nSalary :" + calculateSalary() +"\nNumber Of Cases : " + numberOfCases + "\nNumber Of Won Cases : " + numberOfCasesWon +"\nNumber Of Lost Cases : " +
				+ numberOfCasesLost +"\n\nCases :- " ;
		
		for(int i = 0 ; i < numberOfCases; i++) // list all cases methode 
			sum += "\nCase"+(i+1)+" :\n"+ casesList[i] + "\n"  ;
		
		
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
