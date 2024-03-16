package LawFirmProject;


public class Civil extends Case{

    //Attributes
	private char civilType;   // Type of civil case can be : Family Law (F), Property Law (P), Contract Law (C)
   
   
	// Parameterized Constructor
	public Civil(String caseNumber, char status, Client client ,int documentSize, char civilType ) {
        super(caseNumber, status, client,documentSize);  // Call superclass constructor
        this.civilType = civilType;
       }

 

	// Method to calculate legal expenses for civil cases
	public  double calculateLegalExpenses() {
        
        switch (civilType) {
        case 'F': case 'f' :
        	legalExpenses = 10000  ;
          break;
        case 'O': case 'o' :
       	 	legalExpenses = 12000 ;
          break;
        case 'C': case 'c' :
       	 	legalExpenses = 11000 ;
          break;
        default:
          System.out.println("Invaled civil Type ");
        } 	

    	if (status == 'P' || status == 'A' )
    		legalExpenses = legalExpenses * 0.5 ;
    	else
    		if(status == 'L')
    		   legalExpenses = legalExpenses * 0.25 ;
    	
    	
	         return legalExpenses;
      }
	
	// Method That Display Civil Attributes
	public void DisplayCase() {
		super.DisplayCase();
		
		 String civilTypeString = "";
		 switch (civilType) {
         case 'F': case 'f' :
        	 civilTypeString = "Family Law";
           break; 
         case 'O': case 'o' :
        	 civilTypeString = "Property Law";
           break;
         case 'C': case 'c' :
        	 civilTypeString ="Contract Law";
           break;
         default:
           System.out.println("Invaled civil Type ");
		 }
		 
		System.out.println("Case Type: Civil Case  ");
		System.out.println("Civil Type: "  + civilTypeString);
		System.out.println("Legal Expenses: " + calculateLegalExpenses());
	}

	// toString Method
	public String toString() {
		 String civilTypeString = "";
		 
		 switch (civilType) {
         case 'F': case 'f' :
        	 civilTypeString = "Family Law";
           break;
         case 'O': case 'o' :
        	 civilTypeString = "Property Law";
           break;
         case 'C': case 'c' :
        	 civilTypeString ="Contract Law";
           break;
         default:
           System.out.println("Invaled civil Type ");
		 }

           String sum = "";
		sum += super.toString();
		sum+="\nCase Type: Civil Case \nCivil Type: "  + civilTypeString +"\nLegal Expenses: " + calculateLegalExpenses();
		return sum ;
		
	}

       // setters & getters
      	public char getCivilType() {
      	   return civilType;
      	}
      	
      	public void setCivilType(char civilType) {
      	   this.civilType = civilType;
      	}
       
    
	}
   
 
   
	
	
	
