/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tykni9794
 */
public class FrmMacaroonCostForm extends javax.swing.JFrame {

    /**
     * Creates new form FrmMacaroonCostForm
     */
    public FrmMacaroonCostForm() {
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
        lblImage = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblDesc = new javax.swing.JLabel();
        lblItem1 = new javax.swing.JLabel();
        lblItem2 = new javax.swing.JLabel();
        lblItem3 = new javax.swing.JLabel();
        lblItem4 = new javax.swing.JLabel();
        lblItem5 = new javax.swing.JLabel();
        txtPurchase1 = new javax.swing.JTextField();
        txtPurchase2 = new javax.swing.JTextField();
        txtPurchase3 = new javax.swing.JTextField();
        txtPurchase4 = new javax.swing.JTextField();
        txtPurchase5 = new javax.swing.JTextField();
        btnCalcCost = new javax.swing.JButton();
        lblTaxesAns = new javax.swing.JLabel();
        lblSubtotalAns = new javax.swing.JLabel();
        lblGrandAns = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/macarons-a-l-orange-citron-et-fraises scaled down.jpg"))); // NOI18N

        lblTitle.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 51, 255));
        lblTitle.setText("Madeleine's Macaroons");

        lblDesc.setFont(new java.awt.Font("Viner Hand ITC", 1, 10)); // NOI18N
        lblDesc.setForeground(new java.awt.Color(51, 51, 255));
        lblDesc.setText("Enter the number of each macaroon that you would like to purchase");
        lblDesc.setAlignmentX(0.5F);
        lblDesc.setPreferredSize(new java.awt.Dimension(416, 14));

        lblItem1.setText("Lemon Macaroons($1.99): ");

        lblItem2.setText("Blueberry Macaroons($1.79): ");

        lblItem3.setText("Raspberry Macaroons($1.99): ");

        lblItem4.setText("Lime  Macaroons($1.79): ");

        lblItem5.setText("Banana Macaroons($2.29): ");

        btnCalcCost.setText("Calculate");
        btnCalcCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcCostActionPerformed(evt);
            }
        });

        lblTaxesAns.setText("Taxes(13%): ");

        lblSubtotalAns.setText("Subtotal:");

        lblGrandAns.setText("Grand Total:");

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText(" and click Calculate");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblItem2)
                                    .addComponent(lblItem3)
                                    .addComponent(lblItem4)
                                    .addComponent(lblItem5))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPurchase2)
                                            .addComponent(txtPurchase3)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPurchase5, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtPurchase4)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblItem1)
                                .addGap(23, 23, 23)
                                .addComponent(txtPurchase1)))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCalcCost)
                            .addComponent(lblTaxesAns, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(lblSubtotalAns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGrandAns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblImage)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 257, Short.MAX_VALUE))
                            .addComponent(lblDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImage)
                    .addComponent(lblTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItem1)
                    .addComponent(btnCalcCost)
                    .addComponent(txtPurchase1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItem2)
                    .addComponent(txtPurchase2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubtotalAns))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItem3)
                    .addComponent(txtPurchase3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTaxesAns))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItem4)
                    .addComponent(txtPurchase4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGrandAns))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItem5)
                    .addComponent(txtPurchase5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcCostActionPerformed
        final double LEMON_MAC = 1.99;
        final double BLUEBERRY_MAC = 1.79;
        final double RASPBERRY_MAC = 1.99;
        final double LIME_MAC = 1.79;
        final double BANANA_MAC = 2.29;

        int numLemMac = Integer.parseInt(txtPurchase1.getText());
        int numBlueMac = Integer.parseInt(txtPurchase1.getText());
        int numRaspMac = Integer.parseInt(txtPurchase1.getText());
        int numLimeMac = Integer.parseInt(txtPurchase1.getText());
        int numBanMac = Integer.parseInt(txtPurchase1.getText());

        double lemonCost = LEMON_MAC * numLemMac;
        double blueberryCost = BLUEBERRY_MAC * numBlueMac;
        double raspberryCost = RASPBERRY_MAC * numRaspMac;
        double limeCost = LIME_MAC * numLimeMac;
        double bananaCost = BANANA_MAC * numBanMac;

        double subtotal = (lemonCost + blueberryCost + raspberryCost + limeCost + bananaCost) * 100;
        subtotal = Math.round(subtotal);
        subtotal = subtotal / 100;
        lblSubtotalAns.setText("Subtotal: " + (String.valueOf(subtotal)));

        double tax = (subtotal * 0.13) * 100;
        tax = Math.round(tax);
        tax = tax / 100;
        lblTaxesAns.setText("Taxes(13%): " + (String.valueOf(tax)));

        double grandTotal = (subtotal + tax) * 100;
        grandTotal = Math.round(grandTotal);
        grandTotal = grandTotal / 100;
        lblGrandAns.setText("Grand Total: " + (String.valueOf(grandTotal)));

    }//GEN-LAST:event_btnCalcCostActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMacaroonCostForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMacaroonCostForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMacaroonCostForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMacaroonCostForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMacaroonCostForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcCost;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblGrandAns;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblItem1;
    private javax.swing.JLabel lblItem2;
    private javax.swing.JLabel lblItem3;
    private javax.swing.JLabel lblItem4;
    private javax.swing.JLabel lblItem5;
    private javax.swing.JLabel lblSubtotalAns;
    private javax.swing.JLabel lblTaxesAns;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtPurchase1;
    private javax.swing.JTextField txtPurchase2;
    private javax.swing.JTextField txtPurchase3;
    private javax.swing.JTextField txtPurchase4;
    private javax.swing.JTextField txtPurchase5;
    // End of variables declaration//GEN-END:variables
}
