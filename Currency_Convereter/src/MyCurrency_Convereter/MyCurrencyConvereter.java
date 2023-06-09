package MyCurrency_Convereter;

import javax.swing.JOptionPane;

public class MyCurrencyConvereter extends javax.swing.JFrame {

    String[] currencyUnits = {
"Units",
"Bangladesh Taka",
"Chaina Yuan",
"India Rupee",
"Japan Yen",
"Nepal Rupee",
"Pakistan Rupee",
"Russia Ruble",
"SriLanka Rupee",
"Singapore Dollar",
"America Dollar"
};
    double Bangladesh_Taka=132.35;
    double China_Yuan=8.72;
    double India_Rupee=101.93;
    double Japan_Yen=173.65;
    double Nepal_Rupee=163.16;
    double Pakistan_Rupee=351.86;
    double Russia_Ruble=97.53;
    double SriLanka_Rupee=367.25;
    double Singapore_Dollor =1.67;
    double America_Dollor=1.23;
    
    public MyCurrencyConvereter() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        secondCountry = new javax.swing.JComboBox<>();
        t2 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        firstCountry = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstCurrenyUnit = new javax.swing.JLabel();
        secondCurrenyUnit = new javax.swing.JLabel();
        Convert = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Currency Converter");

        secondCountry.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        secondCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One....", "BANGLADESH", "CHAINA", "INDIA", "JAPAN", "NEPAL", "PAKISTAN", "RUSSIA", "SRI LANKA", "SINGAPORE", "AMERICA" }));
        secondCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                secondCountryItemStateChanged(evt);
            }
        });

        t2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        t1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        firstCountry.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        firstCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One....", "BANGLADESH", "CHAINA", "INDIA", "JAPAN", "NEPAL", "PAKISTAN", "RUSSIA", "SRI LANKA", "SINGAPORE", "AMERICA" }));
        firstCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                firstCountryItemStateChanged(evt);
            }
        });
        firstCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstCountryActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("From Currency Of");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("To Currency Of");

        firstCurrenyUnit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        firstCurrenyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstCurrenyUnit.setText("units");

        secondCurrenyUnit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        secondCurrenyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        secondCurrenyUnit.setText("units");

        Convert.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Convert.setText("Convert Currency");
        Convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exit.setText("Exit");
        exit.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                exitItemStateChanged(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(262, 262, 262))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(t1)
                            .addComponent(firstCountry, 0, 244, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(firstCurrenyUnit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(secondCountry, 0, 244, Short.MAX_VALUE)
                            .addComponent(t2)
                            .addComponent(jLabel3)
                            .addComponent(secondCurrenyUnit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Convert)
                        .addGap(162, 162, 162)
                        .addComponent(Reset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                        .addComponent(exit)))
                .addGap(105, 105, 105))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(secondCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstCurrenyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(secondCurrenyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Convert)
                            .addComponent(Reset)
                            .addComponent(exit)))
                    .addComponent(jLabel2))
                .addGap(116, 116, 116))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstCountryActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void ConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertActionPerformed
        // TODO add your handling code here:
        
        if(firstCountry.getSelectedIndex()==0 || secondCountry.getSelectedIndex()==0 || t1.getText().equals("")){
            
            JOptionPane.showMessageDialog(null,"You Must Select Both Countries and Must Input the Amount.","Error Message",
            JOptionPane.INFORMATION_MESSAGE 
                    );
            return;
        }
        
        double amountToChange = Double.parseDouble(t1.getText());
        
        double amountInPounds=0.0;
        double amountChanged =0.0;
        
        switch(firstCountry.getSelectedItem().toString()){
            case "Bangladesh":
                amountInPounds =amountToChange/Bangladesh_Taka;break;
            case "China":
                amountInPounds =amountToChange/China_Yuan;break;
            case "India":
                amountInPounds =amountToChange/India_Rupee;break;
            case "Japan":
                amountInPounds =amountToChange/Japan_Yen;break;
            case "Nepal":
                amountInPounds =amountToChange/Nepal_Rupee;break;
            case "Pakistan":
                amountInPounds =amountToChange/Pakistan_Rupee;break;
            case "Russia":
                amountInPounds =amountToChange/Russia_Ruble;break;
            case "Srilanka":
                amountInPounds =amountToChange/SriLanka_Rupee;break;
            case "Singapore":
                amountInPounds =amountToChange/Singapore_Dollor;break;
            case "America":
                amountInPounds =amountToChange/America_Dollor;break;
            default: amountInPounds=0.0;
        }
        switch(secondCountry.getSelectedItem().toString()){
            case"Bangladesh":
                amountChanged=amountInPounds * Bangladesh_Taka;break;
            case"China":
                amountChanged=amountInPounds * China_Yuan;break;
            case"India":
                amountChanged=amountInPounds * India_Rupee;break;
            case"Japan":
                amountChanged=amountInPounds * Japan_Yen;break;
            case"Nepal":
                amountChanged=amountInPounds * Nepal_Rupee;break;
            case"Pakistan":
                amountChanged=amountInPounds * Pakistan_Rupee;break;
            case"Russia":
                amountChanged=amountInPounds * Russia_Ruble;break;
            case"Srilanka":
                amountChanged=amountInPounds * SriLanka_Rupee;break;
            case"Singapore":
                amountChanged=amountInPounds * Singapore_Dollor;break;
            case"America":
                amountChanged=amountInPounds * America_Dollor;break;
            default:
                amountChanged=amountInPounds * 0.0;;
        }
       
        String value =String.format("%.2f",amountChanged);
        t2.setText(value);
        
        
        
    }//GEN-LAST:event_ConvertActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        firstCountry.setSelectedIndex(0);
        secondCountry.setSelectedIndex(0);
        t1.setText(null);
        t2.setText(null);
    }//GEN-LAST:event_ResetActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void firstCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_firstCountryItemStateChanged
     
        int position = firstCountry.getSelectedIndex();
        
    firstCurrenyUnit.setText(currencyUnits[position]);        
    }//GEN-LAST:event_firstCountryItemStateChanged

    private void secondCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_secondCountryItemStateChanged

          int position = secondCountry.getSelectedIndex();
        
    secondCurrenyUnit.setText(currencyUnits[position]);
    }//GEN-LAST:event_secondCountryItemStateChanged

    private void exitItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_exitItemStateChanged

    }//GEN-LAST:event_exitItemStateChanged

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
            java.util.logging.Logger.getLogger(MyCurrencyConvereter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyCurrencyConvereter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyCurrencyConvereter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyCurrencyConvereter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyCurrencyConvereter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Convert;
    private javax.swing.JButton Reset;
    private javax.swing.JButton exit;
    private javax.swing.JComboBox<String> firstCountry;
    private javax.swing.JLabel firstCurrenyUnit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> secondCountry;
    private javax.swing.JLabel secondCurrenyUnit;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
