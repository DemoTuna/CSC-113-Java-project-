package LawFirmProject;


public class Civil extends Case{

        //attributes
   
	private char civilType;   // Type of civil case can be : Family Law (F), Property Law (P), Contract Law (C)
   
   
	// parameterized constructor
   
	public Civil(String caseNumber, char status, Client client ,int documentSize, char civilType ) {
        super(caseNumber, status, client,documentSize);  // Call superclass constructor
        this.civilType = civilType;
       }

 

	// Method to calculate legal expenses for civil cases
	public  double calculateLegalExpenses() {
        
        switch (civilType) {
        case 'F':
        	legalExpenses = 10000  ;
          break;
        case 'O':
       	 	legalExpenses = 12000 ;
          break;
        case 'C':
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


	public String toString() {
		 String civilTypeString = "";
		 
		 switch (civilType) {
         case 'F':
        	 civilTypeString = "Family Law";
           break;
         case 'O':
        	 civilTypeString = "Property Law";
           break;
         case 'C':
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
   
 
   
	
	
	
