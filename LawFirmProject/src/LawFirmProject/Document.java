package LawFirmProject;

public class Document {

	private String trackingNumber ;
	private String title ;
	private char type ;
	private String content ;
	private char accessLevel ;
	
	
	public Document(String trackingNumber, String title, char type, String content, char accessLevel) {
		
		this.trackingNumber = trackingNumber;
		this.title = title;
		this.type = type;
		this.content = content;
		this.accessLevel = accessLevel;
	}


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
	
	 // toString method
    
	 public String toString() {
	    
	  String accessLevelString;
	  switch (accessLevel) {
	        case 'P':
	            accessLevelString = "Public";
	            break;
	        case 'C':
	            accessLevelString = "Confidential";
	            break;
	        case 'R':
	            accessLevelString = "Restricted";
	            break;
	        default:
	            accessLevelString = "Unknown";
	            break;
	    }
	        return "Tracking Number: " + trackingNumber + "\nTitle: " + title + "\nType: " + type + "\nContent: " + content + "\nAccess Level: " + accessLevelString;  
	       }
	

	
	
	

}
