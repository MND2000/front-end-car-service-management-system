/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.frontendcarservicemanagement.view;

import javax.swing.JTable;
import za.ac.cput.frontendcarservicemanagement.client.CustomerClient;
import za.ac.cput.frontendcarservicemanagement.util.Helper;

/**
 *
 * @author kurtj
 */
public class ShowAll extends javax.swing.JFrame {
    CustomerClient custClient = new CustomerClient();

    /**
     * Creates new form ShowAll
     */
    public ShowAll() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        customerTbl = new javax.swing.JTable();
        soutPnl = new javax.swing.JPanel();
        showAllBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        customerTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Last Name", "Email", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customerTbl);
        if (customerTbl.getColumnModel().getColumnCount() > 0) {
            customerTbl.getColumnModel().getColumn(0).setPreferredWidth(20);
            customerTbl.getColumnModel().getColumn(1).setPreferredWidth(20);
            customerTbl.getColumnModel().getColumn(2).setPreferredWidth(20);
            customerTbl.getColumnModel().getColumn(3).setPreferredWidth(20);
            customerTbl.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        showAllBtn.setText("Show All");
        showAllBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        showAllBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        showAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout soutPnlLayout = new javax.swing.GroupLayout(soutPnl);
        soutPnl.setLayout(soutPnlLayout);
        soutPnlLayout.setHorizontalGroup(
            soutPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(showAllBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
        );
        soutPnlLayout.setVerticalGroup(
            soutPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, soutPnlLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(showAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(soutPnl, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllBtnActionPerformed
       if(evt.getSource()==showAllBtn){
            Helper.setCustomerTableData(custClient, customerTbl);
       }
        
    }//GEN-LAST:event_showAllBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ShowAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowAll().setVisible(true);
            }
        });
    }

    public JTable getjTable1() {
        return customerTbl;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable customerTbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton showAllBtn;
    private javax.swing.JPanel soutPnl;
    // End of variables declaration//GEN-END:variables
}
