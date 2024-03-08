package LawFirmProject;


public class Civil extends Case{

        //attributes
   
	private char civilType;   // Family Law (F), Property Law (O), or Contract Law (C)
   
   
	// parameterized constructor
   
	public Civil(String caseNumber, char status, Client client ,int size, char civilType ) {
        super(caseNumber, status, client,size);  // Call superclass constructor
        this.civilType = civilType;
       }

 

	// Override method to calculate legal expenses for civil cases
	@Override
	public  double calculateLegalExpenses() {
        double totalLegalExpenses = 0;
    
	       if (civilType == 'F') 
	            totalLegalExpenses += 10000;
	         else if (civilType == 'O') 
	            totalLegalExpenses += 5000;
	         else if (civilType == 'C') 
	            totalLegalExpenses += 7000;
	  
	
	       if (status == 'P') 
	            totalLegalExpenses += (totalLegalExpenses * 0.2); // Increase legal expenses by 20% for pending cases
	         else if (status == 'C') 
	            totalLegalExpenses -= (totalLegalExpenses * 0.2); // Decrease legal expenses by 20% for closed cases
	            
	         super.legalExpenses = totalLegalExpenses;     
	         return legalExpenses;
      }
          
                
      
   
	   // Override method to calculate the estimated completion time for the civil case
	   @Override
	    public int calculateCompletionTime() {
	    
	        // Default completion time (in days)
	        int completionTime = 0;
	        
	        switch (civilType) {
	            case 'F':
	                completionTime = 120; 
	                break;
	            case 'O':
	                completionTime = 90; 
	                break;
	            case 'C':
	                completionTime = 100; 
	                break;
	            default:
	                completionTime = 90; 
	                break;
	        }
	        
	        return completionTime;
	    }
   
   // Override Method to display information about the civil case
   
   
	public void display(){
   
	  System.out.println(super.toString());     // Call display method of the superclass Case
     
         System.out.print("Civil Type: ");
         switch (civilType) {
            case 'F':
              System.out.println("Family Law");
              break;
            case 'O':
              System.out.println("Property Law");
              break;
            case 'C':
              System.out.println("Contract Law");
              break;
            default:
              System.out.println("Unknown");
              break;
     }
          
        System.out.println("Calculated Legal Expenses: " + calculateLegalExpenses());
        System.out.println("Calculated Completion Time: " + calculateCompletionTime() + " days");
}

       // setters & getters
      	public char getCivilType() {
      	   return civilType;
      	}
      	
      	public void setCivilType(char civilType) {
      	   this.civilType = civilType;
      	}
       
    
	}
   
 
   
	
	
	
