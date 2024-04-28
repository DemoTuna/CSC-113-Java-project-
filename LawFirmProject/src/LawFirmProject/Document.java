package LawFirmProject;

public class Document {

	//Attributes
	private String trackingNumber ;
	private String title ;
	private char type ;   // Document type : Legal Brief (B) , Contract (C) , Court File (T) , Evidence (E)  
	private String content ;
	private char accessLevel ; // Document Access Level :  Public (P) , Confidential (C) , Restricted (R)  
	
	
	
	
	// Parameterized Constructor 
	public Document(String trackingNumber, String title, char type, String content, char accessLevel) {
		
		this.trackingNumber = trackingNumber;
		this.title = title;
		this.type = type;
		this.content = content;
		this.accessLevel = accessLevel;
	}

	
	// Method That Display Document Attributes
	public void DisplayDocument() {
		String accessLevelString;
		  switch (accessLevel) {
		        case 'P': case 'p' :
		            accessLevelString = "Public";
		            break;
		        case 'C': case 'c' :
		            accessLevelString = "Confidential";
		            break;
		        case 'R': case 'r' :
		            accessLevelString = "Restricted";
		            break;
		        default:
		            accessLevelString = "Unknown";
		            
		    }
		  
		  String typeString ;
		  switch (type) {
		        case 'B': case 'b' :
		        	typeString = "Legal Brief";
		            break;
		        case 'C': case 'c' :
		        	typeString = "Contract";
		            break;
		        case 'T': case 't' :
		        	typeString = "Court File";
		            break;
		        case 'E': case 'e' :
		        	typeString = "Evidence";
		            break;
		        default:
		        	typeString = "Unknown";
		           
		  }
		  
		System.out.println("**********************************************");
		System.out.println("Document Info :-");
		System.out.println("Tracking Number : " + trackingNumber);
		System.out.println("Title : " + title);
		System.out.println("Type : " + typeString);
		System.out.println("Content : " + content);
		System.out.println("Access Level :" + accessLevelString);
		
	}
	
	 // toString Method
	 public String toString() {
	    
	  String accessLevelString;
	  switch (accessLevel) {
	        case 'P': case 'p' :
	            accessLevelString = "Public";
	            break;
	        case 'C': case 'c' :
	            accessLevelString = "Confidential";
	            break;
	        case 'R': case 'r' :
	            accessLevelString = "Restricted";
	            break;
	        default:
	            accessLevelString = "Unknown";
	            
	    }
	  
	  String typeString ;
	  switch (type) {
	        case 'B': case 'b' :
	        	typeString = "Legal Brief";
	            break;
	        case 'C': case 'c' :
	        	typeString = "Contract";
	            break;
	        case 'T': case 't' :
	        	typeString = "Court File";
	            break;
	        case 'E': case 'e' :
	        	typeString = "Evidence";
	            break;
	        default:
	        	typeString = "Unknown";
	           
	  }
	  
	        return "\n**********************************************\n"+"Document Info :- \nTracking Number : " + trackingNumber + "\nTitle : " + title + "\nType : " + typeString + "\nContent : " + content + "\nAccess Level : " + accessLevelString;  
	       }
	

		// Setters & Getters
		public String getTrackingNumber() {
			return trackingNumber;
		}


		public void setTrackingNumber(String trackingNumber) {
			this.trackingNumber = trackingNumber;
		}


		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		public char getType() {
			return type;
		}


		public void setType(char type) {
			this.type = type;
		}


		public String getContent() {
			return content;
		}


		public void setContent(String content) {
			this.content = content;
		}


		public char getAccessLevel() {
			return accessLevel;
		}


		public void setAccessLevel(char accessLevel) {
			this.accessLevel = accessLevel;
		}
	
	
	

}
