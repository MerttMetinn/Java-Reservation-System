
package proglabproje2;

import javax.swing.JOptionPane;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.SwingConstants;

public class UL_TarihSecimi extends javax.swing.JFrame {

   static boolean isOpen = false;
   private static boolean userOpen = false;
   private Person person = new Person();

   public UL_TarihSecimi() {
       initComponents();
   }
    
    public Person getPerson() {
       return person;
   }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tarih_cb = new javax.swing.JComboBox<>();
        kalkısLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kalkıs_cb = new javax.swing.JComboBox<>();
        varıs_cb = new javax.swing.JComboBox<>();
        BiletAra = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tasıt_turu_cb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kullanıcı Girişi");

        Tarih_cb.setBackground(new java.awt.Color(204, 255, 255));
        Tarih_cb.setPreferredSize(new Dimension(200, Tarih_cb.getPreferredSize().height));
        Tarih_cb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Tarih_cb.setForeground(new java.awt.Color(0, 0, 0));
        Tarih_cb.setMaximumRowCount(10);
        Tarih_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4 Aralık 2023", "5 Aralık 2023", "6 Aralık 2023", "7 Aralık 2023", "8 Aralık 2023", "9 Aralık 2023", "10 Aralık 2023" }));
        Tarih_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tarih_cbActionPerformed(evt);
            }
        });

        kalkısLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        kalkısLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kalkısLabel.setText("Kalkış Noktası");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Yolculuk Tarihi");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Taşıt Türü");

        kalkıs_cb.setBackground(new java.awt.Color(204, 255, 255));
        kalkıs_cb.setForeground(new java.awt.Color(0, 0, 0));
        kalkıs_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "İstanbul", "Kocaeli", "Ankara", "Konya", "Bilecik", "Eskişehir" }));
        kalkıs_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kalkıs_cbActionPerformed(evt);
            }
        });

        varıs_cb.setBackground(new java.awt.Color(204, 255, 255));
        varıs_cb.setForeground(new java.awt.Color(0, 0, 0));
        varıs_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "İstanbul", "Kocaeli", "Ankara", "Konya", "Bilecik", "Eskişehir" }));
        varıs_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varıs_cbActionPerformed(evt);
            }
        });

        BiletAra.setBackground(new java.awt.Color(219, 226, 239));
        BiletAra.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        BiletAra.setForeground(new java.awt.Color(0, 0, 0));
        BiletAra.setText("Bilet Ara");
        BiletAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BiletAraActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Varış Noktası");

        tasıt_turu_cb.setBackground(new java.awt.Color(204, 255, 255));
        tasıt_turu_cb.setForeground(new java.awt.Color(0, 0, 0));
        tasıt_turu_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Otobüs", "Tren", "Uçak" }));
        tasıt_turu_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tasıt_turu_cbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BiletAra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(kalkısLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(kalkıs_cb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(varıs_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tasıt_turu_cb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Tarih_cb, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tarih_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kalkısLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kalkıs_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(varıs_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tasıt_turu_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(BiletAra, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        Tarih_cb.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                Component renderer = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                ((JLabel) renderer).setHorizontalAlignment(SwingConstants.CENTER);
                return renderer;
            }
        });

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Tarih_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tarih_cbActionPerformed
        String selectedItem = (String) Tarih_cb.getSelectedItem();
        if (selectedItem != null && !selectedItem.isEmpty()) {
            person.addItem(selectedItem);
        } else if (Tarih_cb.getItemCount() > 0) {
            String firstItem = (String) Tarih_cb.getItemAt(0);
            person.addItem(firstItem);
        }
    }//GEN-LAST:event_Tarih_cbActionPerformed

    private void BiletAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BiletAraActionPerformed

        if (!userOpen) {
           String departure = kalkıs_cb.getSelectedItem().toString();
           String arrival = varıs_cb.getSelectedItem().toString();

           if(departure.equals(arrival)) {
               JOptionPane.showMessageDialog(null, "Kalkış ve varış noktası aynı olamaz!", "Hata", JOptionPane.ERROR_MESSAGE);
           } 
           else {
               JOptionPane.showMessageDialog(null, "Seçim başarılı!", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
               userOpen = true;
               UL_YolculukSecimi yolculukSecimi = new UL_YolculukSecimi(person);
               yolculukSecimi.setVisible(true);
               yolculukSecimi.addWindowListener(new java.awt.event.WindowAdapter() {
                  @Override
                  public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                      userOpen = false;
                  }
               });
           }
       }
    }//GEN-LAST:event_BiletAraActionPerformed

    private void varıs_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varıs_cbActionPerformed
        String selectedItem = (String) varıs_cb.getSelectedItem();
        if (selectedItem != null && !selectedItem.isEmpty()) {
            person.addItem(selectedItem);
        } else if (varıs_cb.getItemCount() > 0) {
            String firstItem = (String) varıs_cb.getItemAt(0);
            person.addItem(firstItem);
        }
    }//GEN-LAST:event_varıs_cbActionPerformed

    private void tasıt_turu_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tasıt_turu_cbActionPerformed
        String selectedItem = (String) tasıt_turu_cb.getSelectedItem();
        if (selectedItem != null && !selectedItem.isEmpty()) {
            person.addItem(selectedItem);
        } else if (tasıt_turu_cb.getItemCount() > 0) {
            String firstItem = (String) tasıt_turu_cb.getItemAt(0);
            person.addItem(firstItem);
        }
    }//GEN-LAST:event_tasıt_turu_cbActionPerformed

    private void kalkıs_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kalkıs_cbActionPerformed
        String selectedItem = (String) kalkıs_cb.getSelectedItem();
        if (selectedItem != null && !selectedItem.isEmpty()) {
            person.addItem(selectedItem);
        } else if (kalkıs_cb.getItemCount() > 0) {
            String firstItem = (String) kalkıs_cb.getItemAt(0);
            person.addItem(firstItem);
        }
    }//GEN-LAST:event_kalkıs_cbActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BiletAra;
    private javax.swing.JComboBox<String> Tarih_cb;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel kalkısLabel;
    private javax.swing.JComboBox<String> kalkıs_cb;
    private javax.swing.JComboBox<String> tasıt_turu_cb;
    private javax.swing.JComboBox<String> varıs_cb;
    // End of variables declaration//GEN-END:variables
}
