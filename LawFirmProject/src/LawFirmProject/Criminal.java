package LawFirmProject;


public class Criminal extends Case {
// attribute
private char crimeTybe; // // Crime type: Cyber crime (C), Money laundering (M), Robbery (R), Homicide (H)


//Parameterized constructor
public Criminal(String caseNumber, char status, double legalExpenses , Document document ,  char crimeTybe) {
super(caseNumber, status, legalExpenses, document);
this.crimeTybe = crimeTybe;

}


 //method to calculate legal expenses for criminal cases
/*public  double calculateLegalExpenses() {


}*/



// Setter method 
public void setCrimeTybe(char crimeTybe) {
this.crimeTybe = crimeTybe; 
}

//Getter method
public char getCrimeTybe() {
return crimeTybe;




}
}
