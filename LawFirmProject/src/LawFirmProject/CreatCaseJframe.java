package LawFirmProject;

import java.awt.Color;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import lawfirmproject.Case;
import lawfirmproject.Client;
import lawfirmproject.Criminal;




public class CreatCaseJframe extends javax.swing.JFrame  {

    
    Client NewClient;
    Case NewCase;
    LawFirm LawFirm1;
    Lawyer LawyerToAssignCase;
    
    public CreatCaseJframe() {
        getContentPane().setBackground(new Color(255, 255, 240));
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Enter Lawyer’s Bar Number To Assign The Case To Them :");

        jLabel7.setText("Enter Case Number :");

        jLabel8.setText("Choose Case Status:");

        jLabel9.setText("Enter The Maximm Number Of Documents That The Case Can Have :");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground((new Color(255, 255, 240)));
        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setText("Active (A)");

        jRadioButton2.setBackground((new Color(255, 255, 240)));
        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("Pending (P)");

        jRadioButton3.setBackground((new Color(255, 255, 240)));
        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Lost (L)");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setBackground((new Color(255, 255, 240)));
        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("Won (W)");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 12)); 
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Creat Case ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setText("What Type of Case Is It ? ( Criminal OR Civil )");

        jLabel11.setText("Enter Crime Type ( Cyber Crime (C), Money Laundering (M), Robbery (R), Homicide (H) ) :");

        jLabel12.setText("Enter Civil Type ( Family Law (F), Property Law (P), Contract Law (C) ) :");

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jRadioButton5.setBackground((new Color(255, 255, 240)));
        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("Criminal");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton6.setBackground((new Color(255, 255, 240)));
        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("Civil");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(34, 34, 34)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(37, 37, 37)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(35, 35, 35)
                                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42)
                                    .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(236, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jButton1)
                .addContainerGap(391, Short.MAX_VALUE))
        );

        pack();
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {
     
    }

    // add the case for the lawyer and calculate legal expenses 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
        MainJframe.LawFirm1.load("LawFirm1.dat" );
        
   
 while(true){
 try {
     LawyerToAssignCase = MainJframe.LawFirm1.searchForLawyer(jTextField1.getText());
     String LawyerBarNum = jTextField1.getText();
     String CaseNumber = jTextField2.getText();
char CaseStatus = 0;
if(jRadioButton1.isSelected())
    CaseStatus = jRadioButton1.getText().charAt(0);
else if(jRadioButton2.isSelected())
    CaseStatus = jRadioButton2.getText().charAt(0);
else if(jRadioButton3.isSelected())
    CaseStatus = jRadioButton3.getText().charAt(0);
else if(jRadioButton4.isSelected())
    CaseStatus = jRadioButton4.getText().charAt(0);
      String DocumentSize = jTextField8.getText();
 int CaseDocumentSize =Integer.parseInt(DocumentSize) ;
 char CrimeType = 0;
 
 
if (jRadioButton5.isSelected()){
 CrimeType = jTextField9.getText().charAt(0);
 if(CrimeType!= 'c' && CrimeType!= 'C' && CrimeType !='m'&& CrimeType !='M' && CrimeType !='r'&& CrimeType !='R' && CrimeType !='h'&& CrimeType !='H'){
     JOptionPane.showMessageDialog (null,"Invaled Crime Type ");
     return;}
 Case NewCase = new Criminal(CaseNumber , CaseStatus , NewClient , CaseDocumentSize ,CrimeType);
 double LegalExpenses = NewCase.calculateLegalExpenses() ;
 LawyerToAssignCase.addCase(NewCase);
}
else if (jRadioButton6.isSelected()){
CrimeType = jTextField10.getText().charAt(0);
 if(CrimeType!= 'c' && CrimeType!= 'C' && CrimeType !='f'&& CrimeType !='F' && CrimeType !='P'&& CrimeType !='p' ){
     JOptionPane.showMessageDialog (null,"Invaled civil Type ");
     return;
 }
Case NewCase = new Civil(CaseNumber , CaseStatus , NewClient , CaseDocumentSize ,CrimeType);
 double LegalExpenses = NewCase.calculateLegalExpenses() ;
 
LawyerToAssignCase.addCase(NewCase);

  int num = JOptionPane.showConfirmDialog(this, "DO YOU WANT TO CREATE ANOTHER CASE? "," ", JOptionPane.YES_NO_OPTION);
    if(num ==JOptionPane.YES_OPTION){
       jTextField1.setText("");
        jTextField2.setText("");
        jTextField10.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
    }
    else
    {
       MainJframe main = new MainJframe();
        main.setVisible(true);
        this.setVisible(false); 
    }
}
				   
               break;
               }catch(NumberFormatException e){ 
                   JOptionPane.showMessageDialog (null, "Please enter a valid number for the  Documents That The Case Can Have" );
                   break;
}
      catch(NullPointerException e) {
    JOptionPane.showMessageDialog (null, "can't Find The Lawyer")  ;
    break;
    
               }}
 
    }

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    // to let the user Enter only crime type
    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jRadioButton5.isSelected()){
            jTextField9.setEnabled(true);
            jTextField10.setEnabled(false);
        }
        
            
    }

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {
     
    }
// to let the user Enter only civil type
    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {
          if(jRadioButton6.isSelected()) {
            jTextField10.setEnabled(true);
            jTextField9.setEnabled(false);
          }
    }

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {
        int num = JOptionPane.showConfirmDialog(this, "ARE YOU SURE? ","Canceling Creat Case", JOptionPane.YES_NO_OPTION);
    if(num ==JOptionPane.YES_OPTION){
        MainJframe cancel = new MainJframe();
            cancel.setVisible(true);
        this.setVisible(false);
    }
    }

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreatCaseJframe().setVisible(true);
            }
        });
    }

    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    
}
