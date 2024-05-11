
package LawFirmProject;
import javax.swing.JOptionPane;
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
        case 'P': case 'p' :
       	 	legalExpenses = 12000 ;
          break;
        case 'C': case 'c' :
       	 	legalExpenses = 11000 ;
          break;
        default:
           JOptionPane.showMessageDialog (null,"Invaled civil Type ");
        } 	

    	if (status == 'P' || status == 'p' || status == 'A' || status == 'a' )
    		legalExpenses = legalExpenses * 0.5 ;
    	else
    		if(status == 'L' || status == 'l' )
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
         case 'P': case 'p' :
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
		System.out.println(client);
		 for (int i = 0; i < numberOfDocuments; i++) 
			 System.out.println("Document "+(i+1)+" : "+ documentsList[i] + "\n" );  // list all docs method
	}

	// toString Method
	public String toString() {
		 String civilTypeString = "";
		
		 switch (civilType) {
         case 'F': case 'f' :
        	 civilTypeString = "Family Law";
           break;
         case 'P': case 'p' :
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
		sum+="\nCase Type: Civil Case \nCivil Type: "  + civilTypeString +"\nLegal Expenses: " + calculateLegalExpenses() + client ;
		    for (int i = 0; i < numberOfDocuments; i++) 
		    	sum+= "\n\nDocument "+(i+1)+" : "+ documentsList[i] + "\n";  // list all docs method
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
   
