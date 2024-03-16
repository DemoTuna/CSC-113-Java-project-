package LawFirmProject;


public class Criminal extends Case {
	
	// Attribute
	private char crimeTybe; // // Crime type can be : Cyber crime (C), Money laundering (M), Robbery (R), Homicide (H)

    
    //Parameterized constructor
    public Criminal(String caseNumber, char status,  Client client ,int documentSize ,  char crimeTybe) {
    super(caseNumber, status, client,documentSize);  // Call superclass constructor
    this.crimeTybe = crimeTybe;

}

    //Method to calculate legal expenses for criminal cases  
    public  double calculateLegalExpenses() {
        
    	switch (crimeTybe) {
        case 'C':
        	legalExpenses = 40000 ;
          break;
        case 'M':
       	 	legalExpenses = 35000 ;
          break;
        case 'R':
       	 	legalExpenses = 30000 ;
          break;
        case 'H':
       	 	legalExpenses = 50000 ;
          break;
        default:
          System.out.println("Invaled Crime Type ");
        } 	
    	
    	if (status == 'P' || status == 'A' )
    		legalExpenses = legalExpenses * 0.5 ;
    	else
    		if(status == 'L')
    		   legalExpenses = legalExpenses * 0.25 ;
    	
    	
	         return legalExpenses;
    }
 // Method That Display Criminal Attributes
    public void DisplayCase() {
    	super.DisplayCase();
    	String crimeTybeString = "";
		 
		 switch (crimeTybe) {
       case 'C': case 'c' :
       	crimeTybeString = "Cyber crime";
         break;
       case 'M': case 'm' :
       	crimeTybeString = "Money laundering";
         break;
       case 'R': case 'r' :
       	crimeTybeString ="Robbery";
         break;
       case 'H': case 'h' :
       	crimeTybeString ="Homicide";
         break;
       default:
         System.out.println("Invaled Crime Type ");
		 }
		 
		 System.out.println("Case Type: Criminal Case");
		 System.out.println("Crime Tybe: " + crimeTybeString);
		 System.out.println("Legal Expenses: " + calculateLegalExpenses());
    	 
    }


   

    // toString Method
	public String toString() {
		String crimeTybeString = "";
		 
		 switch (crimeTybe) {
        case 'C': case 'c' :
        	crimeTybeString = "Cyber crime";
          break;
        case 'M': case 'm' :
        	crimeTybeString = "Money laundering";
          break;
        case 'R': case 'r' :
        	crimeTybeString ="Robbery";
          break;
        case 'H': case 'h' :
        	crimeTybeString ="Homicide";
          break;
        default:
          System.out.println("Invaled Crime Type ");
		 }
	String sum = "";
	sum += super.toString();
	sum+= "\nCase Type: Criminal Case \nCrime Tybe: " + crimeTybeString + "\nLegal Expenses: " + calculateLegalExpenses();
	return sum ;
}
	
	 // setters & getters
		public void setCrimeTybe(char crimeTybe) {
			this.crimeTybe = crimeTybe; 
	}

		public char getCrimeTybe() {
			return crimeTybe;
		}


}
