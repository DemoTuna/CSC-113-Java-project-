package LawFirmProject;

// Concrete subclass representing a civil cases
public class Civil extends Case{
private char civilType;   //'F' for Family Law, 'O' for Property Law, 'C' for Contract Law
   
	// Constructor to initialize the civil case fields
	public Civil(String caseNumber, char status, double legalExpenses , Document document , char civilType ) {
        super(caseNumber, status, legalExpenses, document);  // Call superclass constructor
        this.civilType = civilType;
    }

   // Getter and setter mathods for civil type
	public char getCivilType() {
	   return civilType;
	}
	
	public void setCivilType(char civilType) {
	   this.civilType = civilType;
	}

	// Override method to calculate legal expenses for civil cases
	@Override
	public  double calculateLegalExpenses() {
	  return legalExpenses+(legalExpenses*0.50);
	}
   
   // Override method to display civil case information
	public void display(){
	  super.display();     // Call display method of the superclass Case
     System.out.println(document);
      System.out.print("Civil Type: ");
          if (civilType == 'F') {
              System.out.println("Family Law");
          } else if (civilType == 'O') {
              System.out.println("Property Law");
          } else if (civilType == 'C') {
              System.out.println("Contract Law");
          } else {
              System.out.println("Unknown"); // Print "Unknown" for any other char
          }
          
           System.out.println("Calculated Legal Expenses: " + calculateLegalExpenses());
    
	}
   
	

}
