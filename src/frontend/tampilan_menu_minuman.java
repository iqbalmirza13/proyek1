/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

/**
 *
 * @author IQBAL
 */
public class tampilan_menu_minuman extends javax.swing.JFrame {

    /**
     * Creates new form tampilan_menu_minuman
     */
    public tampilan_menu_minuman() {
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

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        xMakanan = new javax.swing.JButton();
        xMinuman = new javax.swing.JButton();
        xTambahan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        xPesanan = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_menu/air mineral.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 73, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_menu/es susu.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 73, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_menu/esjeruk.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 73, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_menu/estea.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 73, -1, -1));

        jLabel12.setText("     Air Mineral");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 265, 80, -1));

        jLabel23.setText("      Es Jeruk");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 265, 80, -1));

        jLabel24.setText("       Es Teh");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 265, 80, -1));

        jLabel13.setText("      Susu Putih");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 265, 80, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_menu/lemontea.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 358, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_menu/soda gembira.jpg"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 358, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_menu/es milo.jpg"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 358, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_menu/es soda nelongso.jpg"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 358, -1, -1));

        jLabel17.setText("Lemon Tea");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 551, 71, -1));

        jLabel25.setText("       Es Milo");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 551, 80, -1));

        jLabel26.setText("Soda Nelongso");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 551, -1, -1));

        jLabel18.setText("Soda Gembira");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 551, 71, -1));

        xMakanan.setText("Makanan");
        xMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xMakananActionPerformed(evt);
            }
        });
        getContentPane().add(xMakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 11, 105, 44));

        xMinuman.setText("Minuman");
        xMinuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xMinumanActionPerformed(evt);
            }
        });
        getContentPane().add(xMinuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 11, 105, 44));

        xTambahan.setText("Tambahan");
        xTambahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xTambahanActionPerformed(evt);
            }
        });
        getContentPane().add(xTambahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 11, 105, 44));

        jLabel1.setText("     Rp. 3000");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 285, 80, -1));

        jLabel2.setText("      Rp. 4000");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 285, 80, -1));

        jLabel3.setText("     Rp. 4000");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 285, 80, -1));

        jLabel4.setText("     Rp. 3000");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 285, 80, -1));

        jButton14.setText("Tambah");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 305, 80, -1));

        jButton15.setText("Tambah");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 305, 80, -1));

        jButton16.setText("Tambah");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 305, 80, -1));

        jButton17.setText("Tambah");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 305, 80, -1));

        jLabel5.setText("  Rp. 5000");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 576, 71, -1));

        jLabel6.setText("   Rp. 9000");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 576, 71, -1));

        jLabel19.setText("    Rp. 6000");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 576, 80, -1));

        jLabel20.setText("   Rp. 10.000");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 576, 80, -1));

        jButton18.setText("Tambah");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 596, 80, -1));

        jButton19.setText("Tambah");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 596, 80, -1));

        jButton20.setText("Tambah");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 596, 80, -1));

        jButton21.setText("Tambah");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 596, 80, -1));

        xPesanan.setText("Pesanan");
        xPesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xPesananActionPerformed(evt);
            }
        });
        getContentPane().add(xPesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 11, 105, 44));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_menu/bckgrd.jpg"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xMakananActionPerformed
        // TODO add your handling code here:
        tampilan_menu_makanan makanan = new tampilan_menu_makanan();
        makanan.setVisible(true);
        dispose();
    }//GEN-LAST:event_xMakananActionPerformed

    private void xMinumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xMinumanActionPerformed
        // TODO add your handling code here:
        tampilan_menu_minuman minuman = new tampilan_menu_minuman();
        minuman.setVisible(true);
        dispose();
    }//GEN-LAST:event_xMinumanActionPerformed

    private void xTambahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xTambahanActionPerformed
        // TODO add your handling code here:
        tampilan_menu_tambahan tambahan = new tampilan_menu_tambahan();
        tambahan.setVisible(true);
        dispose();
    }//GEN-LAST:event_xTambahanActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void xPesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xPesananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xPesananActionPerformed

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
            java.util.logging.Logger.getLogger(tampilan_menu_minuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tampilan_menu_minuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tampilan_menu_minuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tampilan_menu_minuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tampilan_menu_minuman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton xMakanan;
    private javax.swing.JButton xMinuman;
    private javax.swing.JButton xPesanan;
    private javax.swing.JButton xTambahan;
    // End of variables declaration//GEN-END:variables
}