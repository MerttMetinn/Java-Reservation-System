
package proglabproje2;

import javax.swing.JOptionPane;

public class UL_YolculukSecimi extends javax.swing.JFrame {
   
   private Person person;

   public UL_YolculukSecimi(Person person) {
       this.person = person;
       initComponents(); 
   }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        yolculuguSec = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kullanıcı Paneli");

        yolculuguSec.setBackground(new java.awt.Color(219, 226, 239));
        yolculuguSec.setForeground(new java.awt.Color(0, 0, 0));
        yolculuguSec.setText("Yolculuğu Seç");
        yolculuguSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yolculuguSecActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {person.getItem(0), person.getItem(1), person.getItem(2), person.getItem(3)},
                // ... add more rows as needed ...
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(428, 428, 428)
                .addComponent(yolculuguSec, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(428, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(yolculuguSec, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void yolculuguSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yolculuguSecActionPerformed
            String input = JOptionPane.showInputDialog(null, "Kaç kişilik bilet almak istersiniz?");
        try {
            int kisiSayisi = Integer.parseInt(input);
            if (kisiSayisi <= 0) {
                JOptionPane.showMessageDialog(null, "Geçersiz kişi sayısı! Lütfen pozitif bir değer girin.", "Hata", JOptionPane.ERROR_MESSAGE);
            } else {
                UL_KoltukSecimi koltukSecimiSayfasi = new UL_KoltukSecimi(kisiSayisi);
                koltukSecimiSayfasi.setVisible(true);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Geçersiz giriş! Lütfen bir sayı girin.", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_yolculuguSecActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton yolculuguSec;
    // End of variables declaration//GEN-END:variables
}
