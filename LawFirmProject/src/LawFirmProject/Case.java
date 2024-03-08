package LawFirmProject;



public abstract class Case {

  // Attributes
   
   protected String caseNumber;      
   protected char status;           // Status of the case:Active (A), Pending (P), Closed (C)
   protected double legalExpenses;
   protected Client client;
   protected Document[] documents;
   protected int numberOfDocuments;


	
   //Parameterized constructor
   
    public Case(String caseNumber, char status, Client client,int size) {
    this.caseNumber = caseNumber;
    this.status = status;
    this.client=client; 
    this.documents=new Document[size];
    this.legalExpenses = 0; 
    this.numberOfDocuments=0;
   }
   
   // Method to add a document to the case
   public void addDocument(Document d){
     if(numberOfDocuments<documents.length){
         documents[numberOfDocuments]=d;
         numberOfDocuments++;
     }
     else
       System.out.println("Cannot add more documents.");
   
   }
   
   // Method to search for a document by its tracking number
   public int searchDocument(int trackingNumber){
     for(int i=0;i<numberOfDocuments;i++){
         if(documents[i].getTrackingNumber()==trackingNumber)
              return i;
         }
              return -1;
     
   
   }
   
   
   // Method to remove a document 
   public void removeDocument(int id){
      int index=searchDocument(id);
      if(index==-1)
           System.out.println("Case is not found.");
       else{
           documents[index]=documents[numberOfDocuments-1];
           numberOfDocuments--;
           
           }
   
   
   }
	
	
	   
   public abstract double calculateLegalExpenses();     // Abstract method to calculate legal expenses (to be implemented by subclasses).
  
   
   public abstract int calculateCompletionTime();       //Abstract method to calculates the estimated completion time for the case.
   
   // toString method 
   
   public String toString() {
    String statusString;
     switch (status) {
        case 'A':
            statusString = "Active";
            break;
        case 'P':
            statusString = "Pending";
            break;
        case 'C':
            statusString = "Closed";
            break;
        default:
            statusString = "Unknown";
            break;
    }
    String documentsInfo = "";
    for (int i = 0; i < numberOfDocuments; i++) {
           documentsInfo +=(i+1)+" "+ documents[i] + "\n";
}    

    return "Case Number: " + caseNumber + ", Status: " + statusString  + "\n " + client +"\n" + documentsInfo;
    
}
 
       
           
        
    }
    
        
  
    

     
