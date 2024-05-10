package LawFirmProject;

import javax.swing.JOptionPane;

public class MainJframe extends javax.swing.JFrame {

	 LawFirm LawFirm1 ;
	    /**
	     * Creates new form MainJframe
	     */
	    public MainJframe() {
	    
	        initComponents();
	    }

	    /**
	     * This method is called from within the constructor to initialize the form.
	     * WARNING: Do NOT modify this code. The content of this method is always
	     * regenerated by the Form Editor.
	     */
	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	    private void initComponents() {

	        jLabel1 = new javax.swing.JLabel();
	        jLabel2 = new javax.swing.JLabel();
	        jButton1 = new javax.swing.JButton();
	        jButton3 = new javax.swing.JButton();
	        jButton5 = new javax.swing.JButton();
	        jButton7 = new javax.swing.JButton();
	        jButton8 = new javax.swing.JButton();
	        jButton9 = new javax.swing.JButton();
	        jLabel4 = new javax.swing.JLabel();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setBackground(new java.awt.Color(204, 255, 255));
	        setPreferredSize(new java.awt.Dimension(800, 800));

	        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 36)); // NOI18N
	        jLabel1.setText("Welcom to Law Firm !");

	        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
	        jLabel2.setText("Choose what you want to mange: ");

	        jButton1.setBackground(new java.awt.Color(204, 204, 204));
	        jButton1.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
	        jButton1.setForeground(new java.awt.Color(0, 0, 0));
	        jButton1.setText("Hire A Lawyer");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        jButton3.setBackground(new java.awt.Color(204, 204, 204));
	        jButton3.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
	        jButton3.setForeground(new java.awt.Color(0, 0, 0));
	        jButton3.setText("Create A Case");
	        jButton3.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton3ActionPerformed(evt);
	            }
	        });

	        jButton5.setBackground(new java.awt.Color(204, 204, 204));
	        jButton5.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
	        jButton5.setForeground(new java.awt.Color(0, 0, 0));
	        jButton5.setText("Create A document");
	        jButton5.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton5ActionPerformed(evt);
	            }
	        });

	        jButton7.setBackground(new java.awt.Color(204, 204, 204));
	        jButton7.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
	        jButton7.setForeground(new java.awt.Color(0, 0, 0));
	        jButton7.setText("Calculate Firm Revenu");
	        jButton7.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton7ActionPerformed(evt);
	            }
	        });

	        jButton8.setBackground(new java.awt.Color(204, 204, 204));
	        jButton8.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
	        jButton8.setForeground(new java.awt.Color(0, 0, 0));
	        jButton8.setText("Calculate Firm Expenses");
	        jButton8.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton8ActionPerformed(evt);
	            }
	        });

	        jButton9.setBackground(new java.awt.Color(204, 204, 204));
	        jButton9.setFont(new java.awt.Font("Leelawadee UI", 1, 10)); // NOI18N
	        jButton9.setForeground(new java.awt.Color(0, 0, 0));
	        jButton9.setText("Calculate Firm Income");
	        jButton9.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton9ActionPerformed(evt);
	            }
	        });

	        jLabel4.setPreferredSize(new java.awt.Dimension(50, 50));

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(45, 45, 45)
	                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(157, 157, 157)
	                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(130, Short.MAX_VALUE))
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jLabel2)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(33, 33, 33)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(layout.createSequentialGroup()
	                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(49, 49, 49)
	                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(56, 56, 56)
	                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
	                            .addGroup(layout.createSequentialGroup()
	                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(49, 49, 49)
	                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(56, 56, 56)
	                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
	                .addGap(74, 74, 74))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(39, 39, 39)
	                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(27, 27, 27)
	                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addGap(26, 26, 26)
	                .addComponent(jLabel2)
	                .addGap(39, 39, 39)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jButton1)
	                    .addComponent(jButton3)
	                    .addComponent(jButton5))
	                .addGap(40, 40, 40)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jButton9)
	                    .addComponent(jButton8)
	                    .addComponent(jButton7))
	                .addContainerGap(138, Short.MAX_VALUE))
	        );

	        pack();
	    }// </editor-fold>//GEN-END:initComponents

	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
	 HireLawyerJframe hire = new HireLawyerJframe();
	            hire.setVisible(true);
	        this.setVisible(false);
	    }//GEN-LAST:event_jButton1ActionPerformed

	    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
	       CreatCaseJframe create = new CreatCaseJframe();
	            create.setVisible(true);
	        this.setVisible(false);
	    }//GEN-LAST:event_jButton3ActionPerformed

	    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
	JOptionPane.showMessageDialog (null,"FIRM REVENUE = " + LawFirm1.calculateFirmRevenue());
	        /*        FirmRevenueJframe Revenue = new FirmRevenueJframe();
	                Revenue.setVisible(true);
	                this.setVisible(false);*/
	        
	    }//GEN-LAST:event_jButton7ActionPerformed

	    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
	JOptionPane.showMessageDialog (null,"FIRM EXPENSES = "+ LawFirm1.calculateFirmExpenses());
	        /*        FirmExpensesJframe Expenses = new FirmExpensesJframe();
	        Expenses.setVisible(true);
	         this.setVisible(false);*/
	    }//GEN-LAST:event_jButton8ActionPerformed

	    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
	JOptionPane.showMessageDialog (null,"FIRM INCOME = " + LawFirm1.calculateFirmIncome());
	        /*         FirmIncomeJframe income  = new FirmIncomeJframe();
	         income.setVisible(true);
	         this.setVisible(false);*/
	    }//GEN-LAST:event_jButton9ActionPerformed

	    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
	        CreateDocumentJframe dcreate = new CreateDocumentJframe();
	            dcreate.setVisible(true);
	            this.setVisible(false);
	    }//GEN-LAST:event_jButton5ActionPerformed

	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String args[]) {
	        /* Set the Nimbus look and feel */
	        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
	        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
	         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
	         */
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new MainJframe().setVisible(true);
	            }
	        });
	    }

	    // Variables declaration - do not modify//GEN-BEGIN:variables
	    private javax.swing.JButton jButton1;
	    private javax.swing.JButton jButton3;
	    private javax.swing.JButton jButton5;
	    private javax.swing.JButton jButton7;
	    private javax.swing.JButton jButton8;
	    private javax.swing.JButton jButton9;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel4;
	    // End of variables declaration//GEN-END:variables
	}