/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provis8;

import javax.swing.JOptionPane;

/**
 *
 * @author Rivally Ilham
 */
public class jframe extends javax.swing.JFrame {

    /**
     * Creates new form jframe
     */
    public jframe() {
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

        nama = new javax.swing.JLabel();
        praktikum = new javax.swing.JLabel();
        nim = new javax.swing.JLabel();
        click = new javax.swing.JButton();
        kelas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nama.setLabelFor(nama);
        nama.setText("Nama");

        praktikum.setLabelFor(praktikum);
        praktikum.setText("Praktikum");

        nim.setLabelFor(nim);
        nim.setText("NIM");

        click.setText("Click");
        click.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickMouseClicked(evt);
            }
        });
        click.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickActionPerformed(evt);
            }
        });

        kelas.setLabelFor(kelas);
        kelas.setText("kelas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(click)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nama)
                            .addComponent(nim)
                            .addComponent(praktikum)
                            .addComponent(kelas))
                        .addGap(162, 162, 162)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(nama)
                .addGap(18, 18, 18)
                .addComponent(nim)
                .addGap(16, 16, 16)
                .addComponent(kelas)
                .addGap(18, 18, 18)
                .addComponent(praktikum)
                .addGap(18, 18, 18)
                .addComponent(click)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clickActionPerformed

    private void clickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMouseClicked
      nama.setText("Nama      : Moch Rivally Ilham Bintang");
      nim.setText ("NIM       : 10118314");
     kelas.setText("Kelas     : IF-8");
 praktikum.setText("Praktikum : 1");
 JOptionPane.showMessageDialog(null, "Label berhasil di ubah");
     
    }//GEN-LAST:event_clickMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton click;
    private javax.swing.JLabel kelas;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel nim;
    private javax.swing.JLabel praktikum;
    // End of variables declaration//GEN-END:variables
}
