package LawFirmProject;



public abstract class Case {

  // Attributes
   protected String caseNumber;      
   protected char status;      // Status of the case can be:  Active (A), Pending (P), Lost (L), Won (W) 
   protected double legalExpenses;
   protected Client client;
   protected Document[] documentsList; // all arrays name 
   protected int numberOfDocuments;


	
   //Parameterized constructor
    public Case(String caseNumber, char status, Client client,int documentSize) {
    this.caseNumber = caseNumber;
    this.status = status;
    this.client=client; 
    this.documentsList=new Document[documentSize];
    this.legalExpenses = 0; 
    this.numberOfDocuments=0;
   }
   
   // Method to add a document to the case
   public boolean addDocument(Document document){
     if(numberOfDocuments < documentsList.length){
    	 documentsList[numberOfDocuments++] = document;
         return true ;
     }
     return false ;
   
   }
   
   // Method to search for a document by its tracking number
   public Document searchForDocument(String trackingNum){
     for(int i=0 ; i < numberOfDocuments ; i++){
         if(documentsList[i].getTrackingNumber().equals(trackingNum))
              return documentsList[i] ;
         }
             return null ;
   }
   
   // Method to delete a document 
   public boolean deleteDocument(String trackingNum){
	   for(int i=0 ; i < numberOfDocuments ; i++)
	         if(documentsList[i].getTrackingNumber().equals(trackingNum)) {
	        	 documentsList[i] = documentsList[numberOfDocuments-1];
	        	 documentsList[--numberOfDocuments] = null ;
	        	 return true ; 
           }
	         return false ;
   }
   
   //Method That Display Case Info Only Without Doc
   public void DisplayCase() {
	   String statusString = "" ;
	    
	     switch (status) {
	        case 'A': case 'a' :
	            statusString = "Active";
	            break;
	        case 'P': case 'p' :
	            statusString = "Pending";
	            break;
	        case 'L': case 'l' :
	            statusString = "Lost";
	            break;
	        case 'W': case 'w' :
	            statusString = "Won";
	            break;
	        default:
	            System.out.println("Invalid Status");
	    }
	     
	   System.out.println("**********************************************");
	   System.out.println("Case Number : " + caseNumber);
	   System.out.println("Status : " + statusString);
	   System.out.println("Number Of Documents : " + numberOfDocuments);
	   
   }
   
   // Method That List All Documents For A Lawyer 
   public void listAllDocument() {
		for(int i = 0 ; i < numberOfDocuments; i++) {
			System.out.println("\n"+(i+1) + " :\n");
			documentsList[i].DisplayDocument(); 
		}
   }
   
   public abstract double calculateLegalExpenses();     // Abstract method to calculate legal expenses (to be implemented by subclasses).
  
   
   
   // toString Method 
   public String toString() {
	   
    String statusString = "" ;
    
     switch (status) {
        case 'A': case 'a' :
            statusString = "Active";
            break;
        case 'P': case 'p' :
            statusString = "Pending";
            break;
        case 'L': case 'l' :
            statusString = "Lost";
            break;
        case 'W': case 'w' :
            statusString = "Won";
            break;
        default:
            System.out.println("Invalid Status");
    }
     
    String documentsInfo = "";
    for (int i = 0; i < numberOfDocuments; i++) {
           documentsInfo +="Document "+(i+1)+" : "+ documentsList[i] + "\n";  // list all docs method
}    

    return "**********************************************\n"+"Case Number : " + caseNumber + "\nStatus : " + statusString  + "\n " + client +"\n" + documentsInfo;
    
}
   
   // setters & getters
   public String getCaseNumber() {
	return caseNumber;
}

   public void setCaseNumber(String caseNumber) {
	this.caseNumber = caseNumber;
}

   public char getStatus() {
	return status;
}

   public void setStatus(char status) {
	this.status = status;
}

   public double getLegalExpenses() {
	return legalExpenses;
}

   public void setLegalExpenses(double legalExpenses) {
	this.legalExpenses = legalExpenses;
}

   public Client getClient() {
	return client;
}

   public void setClient(Client client) {
	this.client = client;
}

   public int getNumberOfDocuments() {
	return numberOfDocuments;
}

   public void setNumberOfDocuments(int numberOfDocuments) {
	this.numberOfDocuments = numberOfDocuments;
}
 
       
           
        
    }
    
        
  
