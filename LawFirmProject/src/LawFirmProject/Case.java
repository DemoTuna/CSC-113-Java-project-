package LawFirmProject;



public abstract class Case {

  // Attributes
   
   protected String caseNumber;      
   protected char status;      // Status of the case can be:  Active (A), Pending (P), Lost (L), Won (W) 
   protected double legalExpenses;
   protected Client client;
   protected Document[] documents; // all arrays name 
   protected int numberOfDocuments;


	
   //Parameterized constructor
   
    public Case(String caseNumber, char status, Client client,int documentSize) {
    this.caseNumber = caseNumber;
    this.status = status;
    this.client=client; 
    this.documents=new Document[documentSize];
    this.legalExpenses = 0; 
    this.numberOfDocuments=0;
   }
   
   // Method to add a document to the case
   public boolean addDocument(Document document){
     if(numberOfDocuments < documents.length){
         documents[numberOfDocuments++] = document;
         return true ;
     }
     return false ;
   
   }
   
   // Method to search for a document by its tracking number
   public Document searchForDocument(String trackingNum){
     for(int i=0 ; i < numberOfDocuments ; i++){
         if(documents[i].getTrackingNumber().equals(trackingNum))
              return documents[i] ;
         }
             return null ;
   }
   
   // Method to delete a document 
   public boolean deleteDocument(String trackingNum){
	   for(int i=0 ; i < numberOfDocuments ; i++)
	         if(documents[i].getTrackingNumber().equals(trackingNum)) {
	        	 documents[i] = documents[numberOfDocuments-1];
	        	 documents[--numberOfDocuments] = null ;
	        	 return true ; 
           }
	         return false ;
   }
	 
   public void listAllDocuments() {
		for(int i = 0 ; i < numberOfDocuments; i++) {
			System.out.println("\n"+(i+1) + " :\n");
			System.out.println("\n" + documents[i] + "\n");
		}
   }
   
   public abstract double calculateLegalExpenses();     // Abstract method to calculate legal expenses (to be implemented by subclasses).
  
   
   
   // toString method 
   
   public String toString() {
	   
    String statusString = "" ;
    
     switch (status) {
        case 'A':
            statusString = "Active";
            break;
        case 'P':
            statusString = "Pending";
            break;
        case 'L':
            statusString = "Lost";
            break;
        case 'W':
            statusString = "Won";
            break;
        default:
            System.out.println("Invalid Status");
    }
     
    String documentsInfo = "";
    for (int i = 0; i < numberOfDocuments; i++) {
           documentsInfo +="Document "+(i+1)+" : "+ documents[i] + "\n";  // list all docs method
}    

    return "Case Number: " + caseNumber + "\nStatus: " + statusString  + "\n " + client +"\n" + documentsInfo;
    
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
    
        
  
