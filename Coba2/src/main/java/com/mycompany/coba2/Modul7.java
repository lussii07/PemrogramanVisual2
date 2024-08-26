/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.coba2;

import javax.swing.DefaultListModel;

/**
 *
 * @author luxxzy
 */
public class Modul7 extends javax.swing.JFrame {

    /**
     * Creates new form Modul7
     */
    public Modul7() {
        initComponents();
        ListModel = new DefaultListModel();
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
        AreaKota = new javax.swing.JTextArea();
        CbMakanan = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListMinuman = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        btTambah = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        btUbah = new javax.swing.JButton();
        btSisip = new javax.swing.JButton();
        eUbah = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AreaKota.setColumns(20);
        AreaKota.setRows(5);
        jScrollPane1.setViewportView(AreaKota);

        jLabel1.setText("Kota");

        jLabel2.setText("Makanan");

        jScrollPane2.setViewportView(ListMinuman);

        jLabel3.setText("Minuman");

        btTambah.setText("Tambah");
        btTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTambahActionPerformed(evt);
            }
        });

        btHapus.setText("Hapus");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });

        btUbah.setText("Ubah");
        btUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUbahActionPerformed(evt);
            }
        });

        btSisip.setText("Sisip");
        btSisip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSisipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSisip)
                    .addComponent(btUbah)
                    .addComponent(btHapus)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btTambah)
                        .addGap(38, 38, 38)
                        .addComponent(eUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(CbMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CbMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTambah)
                    .addComponent(eUbah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btHapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btUbah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSisip)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTambahActionPerformed
        // TODO add your handling code here:
        AreaKota.append("Gersik" + "\n");
        AreaKota.append("Malang " + "\n");
        AreaKota.append("Surabaya" + "\n");
        CbMakanan.insertItemAt("Rujak", 0);
        CbMakanan.insertItemAt("Rawon", 1);
        CbMakanan.insertItemAt("Sate", 2);
        ListModel.add(0, "Sprite");
        ListModel.add(1, "Fanta");
        ListModel.add(2, "Es Batu");
        ListModel.add(3, "Kopi");
        ListMinuman.setModel(ListModel);
    }//GEN-LAST:event_btTambahActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        // TODO add your handling code here:
        if (AreaKota.getLineCount() > 0) {
            AreaKota.setSelectionStart(0);
            AreaKota.setSelectionEnd(12);
            int posisi = AreaKota.getSelectedText().indexOf("\n");
            AreaKota.replaceRange("", 0, posisi + 1);
            if (posisi == -1) {
                AreaKota.replaceRange("", 0, 8);
            }
        }
        if (CbMakanan.getItemCount() > 0) {
            CbMakanan.removeItemAt(0);
        }
        if (ListModel.getSize() > 0) {
            ListModel.remove(0);
        }

    }//GEN-LAST:event_btHapusActionPerformed

    private void btUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUbahActionPerformed
        // TODO add your handling code here:
        if (AreaKota.getLineCount() > 0) {
            AreaKota.setSelectionStart(0);
            AreaKota.setSelectionEnd(12);

            int posisi = AreaKota.getSelectedText().indexOf("\n");

            if (posisi != -1) {
                AreaKota.replaceRange(eUbah.getText() + "\n", 0, posisi + 1);
            } else {
                AreaKota.replaceRange(eUbah.getText() + "\n", 0, 8);
            }
        }

        if (CbMakanan.getItemCount() > 0) {
            CbMakanan.removeItemAt(1);
            CbMakanan.insertItemAt(eUbah.getText(), 1);
        }

        if (ListModel.getSize() > 0) {
            ListModel.remove(1);
            ListModel.insertElementAt(eUbah.getText(), 1);
        }

    }//GEN-LAST:event_btUbahActionPerformed

    private void btSisipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSisipActionPerformed
        // TODO add your handling code here:
        AreaKota.append("Lamongan"); //tambah paling bawah
        AreaKota.insert("Kab.", 0); // tambah text area
        CbMakanan.insertItemAt("Soto", 3);
        CbMakanan.insertItemAt("Pecel", 0);
        ListModel.insertElementAt("Jus Apokat", 4);
        ListModel.insertElementAt("Jus Tomat", 5);

    }//GEN-LAST:event_btSisipActionPerformed

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
            java.util.logging.Logger.getLogger(Modul7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modul7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modul7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modul7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modul7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaKota;
    private javax.swing.JComboBox<String> CbMakanan;
    private javax.swing.JList<String> ListMinuman;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btSisip;
    private javax.swing.JButton btTambah;
    private javax.swing.JButton btUbah;
    private javax.swing.JTextField eUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    // mendelarasikan model List Box
    DefaultListModel ListModel;
}
