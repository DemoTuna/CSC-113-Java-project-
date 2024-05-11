
package LawFirmProject;

import javax.swing.JOptionPane;
import java.io.*;

public class LawFirm {
    //Attributes
	private String nameOfFirm;
	private String location;
	private String yearFounded;
	private String ownerName;
	private double income;
	private int numberOfLawyers;
	private Lawyer [] lawyersList;
	
	//Parameterized constructor
	public LawFirm(String nameOfFirm , String location , String yearFounded ,  String ownerName , int sizeOfLawyers ) {
	
		this.nameOfFirm = nameOfFirm;
		this.location = location;
		this.yearFounded = yearFounded;
		this.ownerName = ownerName;
		this.income = 0; 
		lawyersList = new Lawyer [sizeOfLawyers];
		numberOfLawyers = 0 ;
                
	}

	// Method add a lawyer  
	public void addLawyer(Lawyer lawyer) {
		if(numberOfLawyers < lawyersList.length) {
			lawyersList[numberOfLawyers++] = lawyer;
                        JOptionPane.showMessageDialog (this, "Lawyer Is Added Successfully :)" ); 
			return;
		}
                else{ 
                    JOptionPane.showMessageDialog (this, "Failed To Add The Lawyer :(" ); 
		return ;
                }
	}   

	
	//Method search for a lawyer by bar number 
		public Lawyer searchForLawyer(String barNum){
			for(int i = 0 ; i < numberOfLawyers ; i ++)
				if (lawyersList[i].getBarNumber().equals(barNum))
					return  lawyersList[i];
		
					return null ;		
		}
		
		
		//Method search for a case by case’s number in the Firm
		public Case searchForCaseInFirm(String caseNum) {
			for (int i = 0 ; i < numberOfLawyers ; i++ ) 
				if (lawyersList[i].searchForCase(caseNum)!= null) {
					System.out.println( lawyersList[i].getName() + " Is The Lawyer How Is Handling The Case \nHis\\Her Bar Number is " + lawyersList[i].getBarNumber());
					return lawyersList[i].searchForCase(caseNum) ;
				}
				
					return null ;
			
		}
		
		//Method search for a Document by tracking Number in the Firm
		public Document searchForDocumentInFirm(String trackingNum){
			for (int i = 0 ; i < numberOfLawyers ; i++ )
				if (lawyersList[i].searchForDocumentInLawyer(trackingNum) != null) {
					System.out.println("This Document Belong To A Case That Is Handled by The Lawyer " + lawyersList[i].getName() + "\nHis\\Her Bar Number is " + lawyersList[i].getBarNumber() );
					return lawyersList[i].searchForDocumentInLawyer(trackingNum) ;
				}
			
			return null ;
		}
		
	// Method dismiss a Lawyer by bar Number
	public void dismissLawyer(String barNum){
		for(int i = 0 ; i<numberOfLawyers ; i++)
			if(lawyersList[i].getBarNumber().equals(barNum))
				{
					lawyersList[i] = lawyersList[numberOfLawyers-1];
					lawyersList[--numberOfLawyers]= null ;
                                        JOptionPane.showMessageDialog (this, "Lawyer Has been Dismissed Successfully :)");
				return ;
			}
                        else {
                         JOptionPane.showMessageDialog (this, "Failed To Dismiss The Lawyer :(");   
		return ; 
	}}
	
	// Method That Promote A Lawyer If The Lawyer Deserve promotion
	public void PromoteLawyer(Lawyer lawyer) {
		lawyer.setExperienceLevel(Character.toUpperCase(lawyer.getExperienceLevel()));
		if ((lawyer.getExperienceLevel()== 'J' || lawyer.getExperienceLevel()== 'j') && lawyer.getYearsOfExperience() >= 4) {
			lawyer.setExperienceLevel('S');
			lawyer.setBaseSalary(lawyer.getBaseSalary()+2000);
			System.out.println("The lawyer "+ lawyer.getName() +" has been promoted to Senior");

		}
		else 
			if((lawyer.getExperienceLevel()== 'S' || lawyer.getExperienceLevel()== 's') && lawyer.getNumberOfCasesWon()>=10 ) { 
				lawyer.setExperienceLevel('P');
				lawyer.setBaseSalary(lawyer.getBaseSalary()+3000);
				System.out.println("The lawyer "+ lawyer.getName() +" has been promoted to Partner");
			}
			else 
				if(lawyer.getExperienceLevel()== 'P' || lawyer.getExperienceLevel()== 'p')
					System.out.println("The lawyer "+ lawyer.getName() +" is a Partner ,the lawyer do not need Promotion"); 
					else
						System.out.println("The lawyer "+ lawyer.getName() + " should work on himself/ herself more to earn a Promotion ");	
		
	}
	
	//Method That List All Lawyers Info Without Cases Details
	public void ListAllLawyers() {
		for(int i = 0 ; i < numberOfLawyers; i++) 
			lawyersList[i].DisplayLawyer(); 
		
	}
	
	//Method That List All Cases Info Without Document Details	
	public void ListAllCases() {
		for(int i = 0 ; i < numberOfLawyers; i++) 
			lawyersList[i].listAllCase();
		
	}
	
	//Method That List All Documents 
	public void ListAllDocuments() {
		for(int i = 0 ; i < numberOfLawyers; i++) 
			lawyersList[i].listAllDocuments();
			
	}
	
	//Method That List All Clients
	public void ListAllClients() {
		for(int i = 0 ; i < numberOfLawyers; i++) 
			lawyersList[i].listAllClient();
				
	}
	
	
	
	
	//Method That Calculate Firm Expenses
	public double calculateFirmExpenses() {
		double FirmExpenses = 0 ;
		for(int i = 0 ; i<numberOfLawyers ; i++)
			FirmExpenses += lawyersList[i].calculateSalary();
		
		return FirmExpenses ;
	}
	

	//Method That Calculate Firm Revenue
	public double calculateFirmRevenue() {
		double FirmRevenue = 0 ;
		for(int i = 0 ; i<numberOfLawyers ; i++)
			FirmRevenue += lawyersList[i].calculateTotalLegalExpenses();
		
		return FirmRevenue ;
	}
	
	//Method That Calculate Firm Income
	public double calculateFirmIncome() {
		income = calculateFirmRevenue() - calculateFirmExpenses();
		
		return income ;
	}
	
   
   
	// toString method 
	public String toString() {
		return "Name of firm is: " + nameOfFirm + "\nLocation: " + location + " Year founding: " + yearFounded + "\nOwner name:" + ownerName + "\nFirm Income:  " + calculateFirmIncome();
		} 
   
	public void save (String fileName){
        try {
            File out = new File(fileName);
            FileOutputStream fos = new FileOutputStream(out);
            ObjectOutputStream file = new ObjectOutputStream(fos);
            
            file.writeObject(nameOfFirm); 
            file.writeObject(location); 
            file.writeObject(ownerName); 
            file.writeObject(nameOfFirm); 
            file.writeDouble(income);
            file.writeInt(numberOfLawyers);
            
            for(int i = 0 ; i < numberOfLawyers ; i++)
            file.writeObject(lawyersList[i]);
            
            file.close();
            
        }
        catch(IOException ex){
           JOptionPane.showMessageDialog(this,"Error while saveing file");
        }
    }
    
    public void load (String fileName){
         try {
            File file = new File(fileName);
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fis);
            
            nameOfFirm = (String) in.readObject() ;
            location = (String) in.readObject() ;
            ownerName = (String) in.readObject() ;
            nameOfFirm = (String) in.readObject() ;
            income = in.readDouble() ;
            int size = in.readInt() ;
            
            for(int i = 0 ; i < size ; i++){
            Lawyer obj = (Lawyer)in.readObject() ;
            this.addLawyer(obj);
            }
            
            in.close();
            
        }
        
         catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog (this, "Error while reading object ");
         }
        catch(IOException ex){
           JOptionPane.showMessageDialog(this,"Error while loading file ");
        }
    }

   
	/// setters & getters 
	public String getNameOfFirm() {
			return nameOfFirm;
		}
	
	public String getLocation() {
		return location;
	}
	
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public String getYearFounded() { 
		return yearFounded;
	}
	
	public double getIncome() {
		return income;
	}

	public void setNameOfFirm(String nameOfFirm) {
		this.nameOfFirm = nameOfFirm;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setOwnerName(String ownerName) { 
		this.ownerName = ownerName;
	}

	public void setYearFounded(String yearFounded) { 
		this.yearFounded = yearFounded;
	}

	public void setIncome(double income) { 
		this.income = income;
	}
	
	
	

}
