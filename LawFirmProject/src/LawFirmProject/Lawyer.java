package LawFirmProject;

public class Lawyer {
	private String name ;
	private char specialization ;
	private char experienceLevel ;
	private String emailAddress ;
	private String phoneNumber;
	private char licenseStatus ;
	private String barNumber ;
	private String universityName ;
	private int yearsOfExperience ;
	private int numberOfCasesWon;
	private int numberOfCasesLost;
	private double baseSalary ;
	//public Case[] cases ;
	
	
	public Lawyer(String name, char specialization, char experienceLevel, String emailAddress, String phoneNumber,
			char licenseStatus, String barNumber, String universityName, int casesSize, int yearsOfExperience, int numberOfCasesWon,
			int numberOfCasesLost, double baseSalary) {
	
		this.name = name;
		this.specialization = specialization;
		this.experienceLevel = experienceLevel;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.licenseStatus = licenseStatus;
		this.barNumber = barNumber;
		this.universityName = universityName;
		//cases = new case[casesSize];
		this.yearsOfExperience = yearsOfExperience;
		this.numberOfCasesWon = numberOfCasesWon;
		this.numberOfCasesLost = numberOfCasesLost;
		this.baseSalary = baseSalary;
	}

	
	
	
	
	
	
	
	
	
	
	
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public char getSpecialization() {
		return specialization;
	}


	public void setSpecialization(char specialization) {
		this.specialization = specialization;
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
