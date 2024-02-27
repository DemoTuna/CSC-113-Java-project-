package LawFirmProject;

// Abstract class representing a legal case
public abstract class Case {
// Fields to store case information
	protected String caseNumber;      
	protected char status;           // Status of the case:Active (A), Pending (P), Closed (C)
	protected double legalExpenses;
   protected Document document;


	
   // Constructor to initialize the case fields
	public Case(String caseNumber, char status, double legalExpenses , Document document) {
    this.caseNumber = caseNumber;
    this.status = status;
    this.legalExpenses = legalExpenses;
    this.document=document;    
}
	
	
	// Abstract method to calculate legal expenses (to be implemented by subclasses)
	public abstract double calculateLegalExpenses();
   
	// Method to display case information
	public void display(){
       System.out.println("Case Number: " + caseNumber);
  
        System.out.print("Status: ");
        switch (status) {
            case 'A':
                System.out.println("Active");
                break;
            case 'P':
                System.out.println("Pending");
                break;
            case 'C':
                System.out.println("Closed");
                break;
            default:
                System.out.println("Unknown"); // Print "Unknown" for any other status code
        }
        System.out.println("Legal Expenses: " + legalExpenses);     
    }
    

}
