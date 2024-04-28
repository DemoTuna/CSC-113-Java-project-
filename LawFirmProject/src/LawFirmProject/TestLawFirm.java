package LawFirmProject;
import java.util.*;
public class TestLawFirm {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Law Firm Name : ");
		String LawFirmName = input.next();
		


		System.out.println("Enter Law Firm Location : ");		
		String LawFirmLocation = input.next();
		
		
		System.out.println("Enter The Year The Law Firm Was Founded : ");
		String LawFirmYearFounded = input.next();
		

		System.out.println("Enter Law Firm Owner Name : ");
		String LawFirmOwnerName = input.next();
		
		
		System.out.println("Enter The Maximm Number Of Lawyers  The Law Firm Can Have : ");
		
		int LawFirmSize = input.nextInt();
		
		
		LawFirm LawFirm1 = new LawFirm( LawFirmName, LawFirmLocation , LawFirmYearFounded ,  LawFirmOwnerName , LawFirmSize );
		
		System.out.println("\nWelcom to  LawFirm ! \n");
		int choice = 100;
		
		do {
			
			System.out.println("Choose your move from the options below: \n");
			
			System.out.println("***************************************");
			System.out.println("# Manage Lawyers :-");
			System.out.println("1- Hire A Lawyer");
			System.out.println("2- Dismiss A Lawyer");
			System.out.println("3- Promote A Lawyer");
			System.out.println("4- Search For A Lawyer");
			System.out.println("5- Update Lawyer Info");
			System.out.println("***************************************");
						

			System.out.println("# Manage Cases :-");
			System.out.println("6- Create A Case");
			System.out.println("7- Delete A Case");
			System.out.println("8- Search For A Case");
			System.out.println("9- Update Case Info");
			System.out.println("***************************************");
			
			System.out.println("# Manage Documents :-");
			System.out.println("10- Create A Document");	
			System.out.println("11- Delete A Document");
			System.out.println("12- Search For A Document");
			System.out.println("13- Update Document Info");
			System.out.println("***************************************");
			
			System.out.println("# Manage Earnings :-");
			System.out.println("14- calculate Firm Revenue");
			System.out.println("15- calculate Firm Expenses");
			System.out.println("16- calculate Firm Incom");
			System.out.println("***************************************");
			
			System.out.println("# Listing For The Firm:-");
			System.out.println("17- List All Lawyers");
			System.out.println("18- List All Cases");
			System.out.println("19- List All Documents");
			System.out.println("20- List All Clients");
			System.out.println("***************************************");
			
			System.out.println("0- Exit Program");
			
			choice = input.nextInt();
			
				
			switch(choice) {
			
			case 1: 
				System.out.println("Enter Lawyer’s Name : ");
				String LawyerName = input.next();
				
				
				System.out.println("Enter Lawyer’s Experience Level ( Junior (J) , Senior (S) , Partner(P) ): ");
				char LawyerExperienceLevel = input.next().charAt(0);
				
				System.out.println("Enter Lawyer’s Email Address : ");
				String LawyerEmailAddress = input.next();
				
				System.out.println("Enter Lawyer’s Phone Number : ");
				String LawyerPhoneNumber = input.next();
				
				System.out.println("Enter Lawyer’s License Status ( Active (A) , Suspended (S) , Revoked (R) ): ");
				char LawyerLicenseStatus = input.next().charAt(0);
				
				System.out.println("Enter Lawyer’s Bar Number : ");
				String LawyerBarNumber = input.next();
				
				System.out.println("Enter Lawyer’s University Name : ");
				String LawyerUniversityName = input.next();
				
				
				System.out.println("Enter The Maximum Number Of Cases That The Lawyer Can Handle : ");
				int LawyerCasesSize = input.nextInt();
				
				System.out.println("Enter Lawyer’s Years Of Experience : ");
				int LawyerYearsOfExperience = input.nextInt();
				
				System.out.println("Enter Lawyer’s Base Salary : ");
				double LawyerBaseSalary = input.nextDouble();
				
				Lawyer NewLawyer = new Lawyer (LawyerName , LawyerExperienceLevel , LawyerEmailAddress , LawyerPhoneNumber , LawyerLicenseStatus , LawyerBarNumber , LawyerUniversityName , LawyerCasesSize , LawyerYearsOfExperience , LawyerBaseSalary );
				
				
				if (LawFirm1.addLawyer(NewLawyer))
					System.out.println("Lawyer Is Added Successfully :)\n");
				else
					System.out.println("Failed To Add The Lawyer :(\n");
				
				break;
				
			case 2: 
				
						System.out.println("Enter Lawyer’s Bar Number To Dismiss : ");
						String LawyerBarNumberForDismiss = input.next();
						
						
						System.out.println("Enter The Bar Number Of Replacement Lawyer : ");
						String LawyerBarNumberForReplacement = input.next();
						
						
						Lawyer LawyerForReplacement = LawFirm1.searchForLawyer(LawyerBarNumberForReplacement);
						if(LawFirm1.dismissLawyer(LawyerBarNumberForDismiss, LawyerForReplacement))
							System.out.println("Lawyer Has been Dismissed Successfully :)\n");
						else
							System.out.println("Failed To Dismiss The Lawyer :(\n");
				
				break;
				
			case 3:
						System.out.println("Enter Lawyer’s Bar Number To Promote Him\\Her : ");
						String LawyerBarNumberToPromote = input.next();
						
						Lawyer LawyerToPromote = LawFirm1.searchForLawyer(LawyerBarNumberToPromote);
						if (LawyerToPromote == null)
							System.out.println("Can Not Find The Lawyer\n");
						else 
							LawFirm1.PromoteLawyer(LawyerToPromote);
				
				break;
				
			case 4:
						System.out.println("Enter Lawyer’s Bar Number To Search For Him\\Her : ");
						String LawyerNameToSearch = input.next();
						
						Lawyer LawyerToSearch = LawFirm1.searchForLawyer(LawyerNameToSearch);
						if (LawyerToSearch == null)
							System.out.println("Can Not Find The Lawyer\n");
						else 
							System.out.println(LawyerToSearch);
				
				
				break;
			case 5: 
				int choice2 ;

							System.out.println("Enter Lawyer’s Bar Number To Update His\\Her Info : ");
							String LawyerBarNumberToFind = input.next();
							
							Lawyer LawyerToUpdate = LawFirm1.searchForLawyer(LawyerBarNumberToFind);
							if (LawyerToUpdate == null)
								System.out.println("Can Not Find The Lawyer");
							else {
								do {
									System.out.println("# What Do You Want To Update On The Lawyer:-\n");
									System.out.println("1- Update Name");
									System.out.println("2- Update Experience Level");
									System.out.println("3- Update Email Address");
									System.out.println("4- Update Phone Number");
									System.out.println("5- Update License Status");
									System.out.println("6- Update Bar Number");
									System.out.println("7- Update University Name");
									System.out.println("8- Update years Of Experience");
									System.out.println("9- Update Base Salary");
									System.out.println("0- Finished Updating ");
									
									
									choice2 = input.nextInt();
									
									switch(choice2) {
									
									case 1: 
										System.out.println("Enter Lawyer’s New Name : ");
										String LawyerNewName = input.next();
										LawyerToUpdate.setName(LawyerNewName);
										System.out.println("Lawyer’s Name Has Been Updated\n");
										break;
										
									case 2: 
										System.out.println("Enter Lawyer’s New Experience Level ( Junior (J) , Senior (S) , Partner(P) ): ");
										char LawyerNewExperienceLevel = input.next().charAt(0);
										LawyerToUpdate.setExperienceLevel(LawyerNewExperienceLevel);
										System.out.println("Lawyer’s Experience Level Has Been Updated\n");
										break;
										
									case 3: 
										System.out.println("Enter Lawyer’s New Email Address : ");
										String LawyerNewEmailAddress = input.next();
										LawyerToUpdate.setEmailAddress(LawyerNewEmailAddress);
										System.out.println("Lawyer’s Email Address Has Been Updated\n");
										break;
										
									case 4: 
										System.out.println("Enter Lawyer’s New Phone Number : ");
										String LawyerNewPhoneNumber = input.next();
										LawyerToUpdate.setPhoneNumber(LawyerNewPhoneNumber);
										System.out.println("Lawyer’s Phone Number Has Been Updated\n");
										break;
										
									case 5: 
										System.out.println("Enter Lawyer’s New License Status ( Active (A) , Suspended (S) , Revoked (R) ): ");
										char LawyerNewLicenseStatus = input.next().charAt(0);
										LawyerToUpdate.setLicenseStatus(LawyerNewLicenseStatus);
										System.out.println("Lawyer’s License Status Has Been Updated\n");
										break;
										
									case 6:
										System.out.println("Enter Lawyer’s New Bar Number : ");
										String LawyerNewBarNumber = input.next();
										LawyerToUpdate.setBarNumber(LawyerNewBarNumber);
										System.out.println("Lawyer’s Bar Number Has Been Updated\n");
										break;
										
									case 7: 
										System.out.println("Enter Lawyer’s New University Name : ");
										String LawyerNewUniversityName = input.next();
										LawyerToUpdate.setUniversityName(LawyerNewUniversityName);
										System.out.println("Lawyer’s University Name Has Been Updated\n");
										break;
										
									case 8: 
										System.out.println("Enter Lawyer’s New Years Of Experience : ");
										int LawyerNewYearsOfExperience = input.nextInt();
										LawyerToUpdate.setYearsOfExperience(LawyerNewYearsOfExperience);
										System.out.println("Lawyer’s Years Of Experience Has Been Updated\n");
										break;
										
									case 9: 
										System.out.println("Enter Lawyer’s New Base Salary : ");
										double LawyerNewBaseSalary = input.nextDouble();
										LawyerToUpdate.setBaseSalary(LawyerNewBaseSalary);
										System.out.println("Lawyer’s Base Salary Has Been Updated\n");
										break;
								
									
									}
								}while(choice2 != 0);//End Of The Do While Loop
							
							}//End Of Else Statement
					break;
					
			case 6: 
				
				System.out.println("Enter Lawyer’s Bar Number To Assign The Case To Them : ");
				String LawyerBarNumberToAssignCase = input.next();
				
				Lawyer LawyerToAssignCase = LawFirm1.searchForLawyer(LawyerBarNumberToAssignCase);
				if (LawyerToAssignCase == null)
					System.out.println("Can Not Find The Lawyer\n");
				else {
					
					System.out.println("Enter Client’s Name : ");
					String ClientName = input.next();
					
					System.out.println("Enter Client’s Day Of Birth In The Format (DD/MM/YYYY) : ");
					String ClientDayOfBirth = input.next();
					
					System.out.println("Enter Client’s ID : ");
					String ClientId = input.next();
					
					System.out.println("Enter Client’s Phone Number : ");
					String ClientPhoneNumber = input.next();
					
					System.out.println("Enter Client’s Email Address : ");
					String ClientEmailAddress = input.next();
					
					System.out.println("Enter Case Number : ");
					String CaseNumber = input.next();
					
					System.out.println("Enter Case Status ( Active (A), Pending (P), Lost (L), Won (W) ) : ");
					char CaseStatus = input.next().charAt(0);
					
					System.out.println("Enter The Maximm Number Of Documents That The Case Can Have : ");
					int CaseDocumentSize = input.nextInt();
					
					System.out.println("What Type of Case Is It ?");
					System.out.println("1- Criminal Case");
					System.out.println("2- Civil Case");
					int CaseType = input.nextInt();

					
					Client NewClient = new Client(ClientName, ClientDayOfBirth , ClientId , ClientPhoneNumber , ClientEmailAddress);
					if (CaseType == 1) {
						System.out.println("Enter Crime Type ( Cyber Crime (C), Money Laundering (M), Robbery (R), Homicide (H) ) : ");
						char CrimeType = input.next().charAt(0);
					
						Case NewCase = new Criminal(CaseNumber , CaseStatus , NewClient , CaseDocumentSize ,CrimeType) ;
						if (LawyerToAssignCase.addCase(NewCase))
							System.out.println("Case Is Added Successfully :)\n");
						else
							System.out.println("Failed To Add The Case :(\n");
					}//End Of If Statement
					else 
						if(CaseType == 2) {
							System.out.println("Enter Civil Type ( Family Law (F), Property Law (P), Contract Law (C) ) : ");
							char CivilType = input.next().charAt(0);
						
							Case NewCase = new Civil(CaseNumber , CaseStatus , NewClient , CaseDocumentSize ,CivilType) ;
							
							if (LawyerToAssignCase.addCase(NewCase))
									System.out.println("Case Is Added Successfully :)\n");
								else
									System.out.println("Failed To Add The Case :(\n");
							
						}//End Of If Statement
					
					
				}//End Of Else Statement

				break;
				
			case 7:
				System.out.println("Enter Lawyer’s Bar Number To Delete A Case : ");
				String LawyerBarNumberToDeleteCase = input.next();
				
				Lawyer LawyerToDeleteCase = LawFirm1.searchForLawyer(LawyerBarNumberToDeleteCase);
				if (LawyerToDeleteCase == null)
					System.out.println("Can Not Find The Lawyer\n");
				else {
					
					System.out.println("Enter Case Number : ");
					String CaseNumberToDeleteCase = input.next();
					
					if( LawyerToDeleteCase.deleteCase(CaseNumberToDeleteCase) )
						System.out.println("Case Is Deleted Successfully :)\n");
					else
						System.out.println("Failed To Delete The Case :(\n");
				}//End Of Else Statement
				
				break;
			case 8:
					System.out.println("Enter Case Number : ");
					String CaseNumberTosearchForCase = input.next();
					
					Case caseToFind = LawFirm1.searchForCaseInFirm(CaseNumberTosearchForCase);
					if(  caseToFind == null)
						System.out.println("Can Not Find The Case\n");
					else 
						System.out.println(caseToFind);

				break;
				
			case 9: 
				int choice3 ;
				
				System.out.println("Enter Case Number : ");
				String CaseNumberToUpdateCase = input.next();
				
				Case caseToUpdate = LawFirm1.searchForCaseInFirm(CaseNumberToUpdateCase);
				if(caseToUpdate == null)
					System.out.println("Can Not Find The Case\n");
				
				else {
					Client clientToUpdate = caseToUpdate.getClient();
					do {
						System.out.println("# What Do You Want To Update On The Case:-\n");
						System.out.println("1- Update Case Number");
						System.out.println("2- Update Case Status");
						if (caseToUpdate instanceof Criminal)
							System.out.println("3- Update Crime Tybe ");
						if(caseToUpdate instanceof Civil)
							System.out.println("3- Update Civil Type");
						System.out.println("4- Update Client Name ");
						System.out.println("5- Update Client Day Of Birth");
						System.out.println("6- Update Client ID ");
						System.out.println("7- Update Client Phone Number");
						System.out.println("8- Update Client Email Address");
						System.out.println("0- Finished Updating ");
						
						choice3 = input.nextInt();
						
						switch(choice3) {
						case 1 :  
							System.out.println("Enter New Case Number : ");
							String NewCaseNumber = input.next();
							caseToUpdate.setCaseNumber(NewCaseNumber);
							System.out.println("Case Number Has Been Updated\n");
							break;
							
						case 2 :
							System.out.println("Enter New Case Status ( Active (A), Pending (P), Lost (L), Won (W) ) : ");
							char NewCaseStatus = input.next().charAt(0);
							caseToUpdate.setStatus(NewCaseStatus);
							System.out.println("Case Status Has Been Updated\n");
							break;
							
						case 3 :
							if (caseToUpdate instanceof Criminal) {
								System.out.println("Enter New Crime Type ( Cyber Crime (C), Money Laundering (M), Robbery (R), Homicide (H) ) : ");
								char NewCrimeType = input.next().charAt(0);
								((Criminal)caseToUpdate).setCrimeTybe(NewCrimeType);
								System.out.println("Crime Tybe Has Been Updated\n");
							}
							else
								if (caseToUpdate instanceof Civil) {
									System.out.println("Enter New Civil Type ( Family Law (F), Property Law (P), Contract Law (C) ) : ");
									char NewCivilType = input.next().charAt(0);
									((Civil)caseToUpdate).setCivilType(NewCivilType);
									System.out.println("Civil Tybe Has Been Updated\n");
								}
							break;
							
						case 4 :
							System.out.println("Enter Client’s New Name : ");
							String NewClientName = input.next();
						
							clientToUpdate.setName(NewClientName);
							System.out.println("Client’s Name Has Been Updated\n");
							break;
							
						case 5 :
							System.out.println("Enter Client’s New Day Of Birth In The Format (DD/MM/YYYY) : ");
							String NewClientDayOfBirth = input.next();
							clientToUpdate.setDayOfBirth(NewClientDayOfBirth);
							System.out.println("Client’s Day Of Birth Has Been Updated\n");
							break;
							
						case 6 :
							System.out.println("Enter Client’s  New ID : ");
							String NewClientId = input.next();
							clientToUpdate.setId(NewClientId);
							System.out.println("Client’s ID Has Been Updated\n");
							break;
							
						case 7 :
							System.out.println("Enter Client’s New Phone Number : ");
							String NewClientPhoneNumber = input.next();
							clientToUpdate.setPhoneNumber(NewClientPhoneNumber);
							System.out.println("Client’s Phone Number Has Been Updated\n");
							break;
							
						case 8 :
							System.out.println("Enter Client’s New Email Address : ");
							String NewClientEmailAddress = input.next();
							clientToUpdate.setEmailAddress(NewClientEmailAddress);
							System.out.println("Client’s Email Address Has Been Updated\n");
							break;	

							

						}//End Of Switch
						
					}while(choice3!=0);//End Of The Do While Loop
					
				}//End Of Else Statement
				
						
				break;
				
			case 10: 
				
				System.out.println("Enter Case Number : ");
				String CaseNumberToAddDoc = input.next();
				
				Case caseToAddDoc = LawFirm1.searchForCaseInFirm(CaseNumberToAddDoc);
				if(caseToAddDoc == null)
					System.out.println("Can Not Find The Case\n");
				
				else {
					System.out.println("Enter Document’s Tracking Number : ");
					String DocumentTrackingNumber = input.next();
					
					System.out.println("Enter Document’s Title : ");
					String DocumentTitle = input.next();
					
					System.out.println("Enter Document’s Type ( Legal Brief (B) , Contract (C) , Court File (T) , Evidence (E) ) :");
					char DocumentType = input.next().charAt(0);
					
					System.out.println("Enter Document’s Content : ");
					String DocumentContent = input.next();
					
					System.out.println("Enter Document’s Access Level ( Public (P) , Confidential (C) , Restricted (R) ) :");
					char DocumentAccessLevel = input.next().charAt(0);
					
					
					
					Document NewDocument = new Document(DocumentTrackingNumber, DocumentTitle, DocumentType , DocumentContent , DocumentAccessLevel );
					if(caseToAddDoc.addDocument(NewDocument))
						System.out.println("Document Is Added Successfully :)\n");
					else
						System.out.println("Failed To Add The Document :(\n");
						
					
				}
		
						
				break;
				
			case 11: 
				
				System.out.println("Enter Case Number : ");
				String CaseNumberToDeleteDoc = input.next();
				
				Case caseToDeleteDoc = LawFirm1.searchForCaseInFirm(CaseNumberToDeleteDoc);
				if(caseToDeleteDoc == null)
					System.out.println("Can Not Find The Case\n");
				
				else {
					System.out.println("Enter Document’s Tracking Number That You Want To Delete: ");
					String DocumentTrackingNumber = input.next();
					
					if(caseToDeleteDoc.deleteDocument(DocumentTrackingNumber))
						System.out.println("Document Is Deleted Successfully :)\n");
					else
						System.out.println("Failed To Delete The Document :(\n");
				}
				
				break;
				
			case 12: 
				
				System.out.println("Enter Document Tracking Number : ");
				String DocTrackingNumber = input.next();
				
					Document documentToFind = LawFirm1.searchForDocumentInFirm(DocTrackingNumber);
					if(documentToFind == null)
						System.out.println("Can Not Find The Document\n");
					else
						System.out.println(documentToFind);
					
				
				break;
				
			case 13: 
				int choice4 ;

				System.out.println("Enter Document’s Tracking Number: ");
				String DocumentTrackingNumber = input.next();

					Document documentToUpdate= LawFirm1.searchForDocumentInFirm(DocumentTrackingNumber);
					if(documentToUpdate == null )
						System.out.println("Can Not Find The Document\n");
					else {
					do {
						System.out.println("# What Do You Want To Update On The Document:-\n");
						System.out.println("1- Update Document’s Tracking Number");
						System.out.println("2- Update Document’s Title");
						System.out.println("3- Update Document’s Type ");
						System.out.println("4- Update Document’s Content ");
						System.out.println("5- Update Document’s Access Level");
						System.out.println("0- Finished Updating ");
						
						choice4 = input.nextInt();
						
						switch(choice4) {
						case 1 :  
							System.out.println("Enter New Tracking Number : ");
							String NewTrackingNumber = input.next();
							documentToUpdate.setTrackingNumber(NewTrackingNumber);
							System.out.println("Document’s Tracking Number Has Been Updated ");
							break;
							
						case 2 :
							System.out.println("Enter New Title : ");
							String NewTitle= input.next();
							documentToUpdate.setTitle(NewTitle);
							System.out.println("Document’s Title Has Been Updated\n");
							break;
						
						case 3 :
							System.out.println("Enter New Type ( Legal Brief (B) , Contract (C) , Court File (T) , Evidence (E) ) : ");
						    char NewType= input.next().charAt(0);
							documentToUpdate.setType(NewType);
							System.out.println("Document’s Type Has Been Updated\n");
							break;
						
						case 4 :
							System.out.println("Enter New Content : ");
							String NewContent= input.next();

							documentToUpdate.setContent(NewContent);
							System.out.println("Document’s Content Has Been Updated\n");
							break;
							
						case 5 :
							System.out.println("Enter New Access Level ( Public (P) , Confidential (C) , Restricted (R) ) : ");
						    char NewAccessLevel= input.next().charAt(0);
							documentToUpdate.setAccessLevel(NewAccessLevel);
							System.out.println("Document’s Access Level Has Been Updated\n");
							break;
							
							
						}//End Of Switch
							}while(choice4 != 0); ////End Of The Do While Loop
					
						}//End Of Else Statement
				
				
				break;
				
			case 14: 
					System.out.println("FIRM REVENUE = " + LawFirm1.calculateFirmRevenue() );
				break;
				
			case 15: 
				System.out.println("FIRM EXPENSES = " + LawFirm1.calculateFirmExpenses() );
				break;
				
			case 16: 
				System.out.println("FIRM INCOME = " + LawFirm1.calculateFirmIncome() );
				break;
				
			case 17: 
				LawFirm1.ListAllLawyers();
				break;
				
			case 18: 
				LawFirm1.ListAllCases();
				break;
				
			case 19: 
				LawFirm1.ListAllDocuments();
				break;
				
			case 20: 
				LawFirm1.ListAllClients();
				break;
				
			case 0:
				System.out.println("Thank You For Using Our System , Goodbye :) ");
				break;	
				
			
				default :
					System.out.println("Invalid Input, try Again :(");
				
			} //End Of Switch 
					
			
		}while(choice!=0); //End Of Do While Loop
		

		
	}

}
