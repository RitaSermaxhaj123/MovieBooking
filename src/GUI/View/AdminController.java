/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class AdminController extends javax.swing.JFrame {

    /**
     * Creates new form AdminController
     */
    public AdminController() {
        initComponents();
        setLocationRelativeTo(null);
    }
//    public AdminController(int UserRole){
//        setLocationRelativeTo(null);
//    }    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnMovies = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        btnCashier = new javax.swing.JButton();
        btnBooking = new javax.swing.JButton();
        btnTicket = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/desktopimg.jpg"));
        Image image=icon.getImage();
        desktopPane = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(23, 21, 21));

        jPanel2.setBackground(new java.awt.Color(23, 21, 21));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/set.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        btnMovies.setForeground(new java.awt.Color(255, 255, 255));
        btnMovies.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/default.png"))); // NOI18N
        btnMovies.setText("Movies");
        btnMovies.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMovies.setPreferredSize(new java.awt.Dimension(170, 40));
        btnMovies.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hover.png"))); // NOI18N
        btnMovies.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/selected.png"))); // NOI18N
        btnMovies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoviesActionPerformed(evt);
            }
        });
        jPanel1.add(btnMovies);

        btnShow.setForeground(new java.awt.Color(255, 255, 255));
        btnShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/default.png"))); // NOI18N
        btnShow.setText("Show Controllers");
        btnShow.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnShow.setPreferredSize(new java.awt.Dimension(170, 40));
        btnShow.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hover.png"))); // NOI18N
        btnShow.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/selected.png"))); // NOI18N
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });
        jPanel1.add(btnShow);

        btnCashier.setForeground(new java.awt.Color(255, 255, 255));
        btnCashier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/default.png"))); // NOI18N
        btnCashier.setText("Cashiers");
        btnCashier.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCashier.setPreferredSize(new java.awt.Dimension(170, 40));
        btnCashier.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hover.png"))); // NOI18N
        btnCashier.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/selected.png"))); // NOI18N
        btnCashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCashierActionPerformed(evt);
            }
        });
        jPanel1.add(btnCashier);

        btnBooking.setForeground(new java.awt.Color(255, 255, 255));
        btnBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/default.png"))); // NOI18N
        btnBooking.setText("Booking");
        btnBooking.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBooking.setPreferredSize(new java.awt.Dimension(170, 40));
        btnBooking.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hover.png"))); // NOI18N
        btnBooking.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/selected.png"))); // NOI18N
        btnBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingActionPerformed(evt);
            }
        });
        jPanel1.add(btnBooking);

        btnTicket.setForeground(new java.awt.Color(255, 255, 255));
        btnTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/default.png"))); // NOI18N
        btnTicket.setText("Ticket booking");
        btnTicket.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTicket.setPreferredSize(new java.awt.Dimension(170, 40));
        btnTicket.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hover.png"))); // NOI18N
        btnTicket.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/selected.png"))); // NOI18N
        btnTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketActionPerformed(evt);
            }
        });
        jPanel1.add(btnTicket);

        jPanel3.setBackground(new java.awt.Color(23, 21, 21));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administration");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(820, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desktopPane)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMoviesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoviesActionPerformed
        // TODO add your handling code here:
        MovieeForm mf=new MovieeForm();
        desktopPane.add(mf);
        mf.show();
    }//GEN-LAST:event_btnMoviesActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // TODO add your handling code here:
        ShowTimeForm sht=new ShowTimeForm();
        desktopPane.add(sht);
        sht.show();
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnCashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCashierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCashierActionPerformed

    private void btnBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingActionPerformed
        // TODO add your handling code here:
        BookingAForm baf=new BookingAForm();
        desktopPane.add(baf);
        baf.show();
    }//GEN-LAST:event_btnBookingActionPerformed

    private void btnTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketActionPerformed
        // TODO add your handling code here:
        TicketAForm taf=new TicketAForm();
        desktopPane.add(taf);
        taf.show();
    }//GEN-LAST:event_btnTicketActionPerformed

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
            java.util.logging.Logger.getLogger(AdminController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBooking;
    private javax.swing.JButton btnCashier;
    private javax.swing.JButton btnMovies;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnTicket;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
