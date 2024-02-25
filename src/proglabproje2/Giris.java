
package proglabproje2;

import java.awt.Color;

public class Giris extends javax.swing.JFrame {

    private static boolean adminOpen = false;
    private static boolean userOpen = false;
    private static boolean firmaOpen = false;
    
    public Giris() {
        initComponents();
        Color customColor = new Color(25, 167, 206);
        getContentPane().setBackground(customColor);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        firmaButon = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        adminButon = new javax.swing.JButton();
        userButon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Giriş Menüsü");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(505, 140));
        setName(""); // NOI18N
        setResizable(false);

        firmaButon.setBackground(new java.awt.Color(219, 226, 239));
        firmaButon.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        firmaButon.setForeground(new java.awt.Color(0, 0, 0));
        firmaButon.setText("Firma Girişi");
        firmaButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firmaButonActionPerformed(evt);
            }
        });

        adminButon.setBackground(new java.awt.Color(219, 226, 239));
        adminButon.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        adminButon.setForeground(new java.awt.Color(0, 0, 0));
        adminButon.setText("Admin Girişi");
        adminButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButonActionPerformed(evt);
            }
        });

        userButon.setBackground(new java.awt.Color(219, 226, 239));
        userButon.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        userButon.setForeground(new java.awt.Color(0, 0, 0));
        userButon.setText("Kullanıcı Girişi");
        userButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userButonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setText("Lütfen giriş yapacağınız menüyü seçiniz");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proglabproje2/air-train-bus-ticket-booking.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setPreferredSize(new java.awt.Dimension(400, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userButon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(firmaButon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminButon, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(userButon, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(firmaButon, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userButonActionPerformed
            if (!adminOpen && !firmaOpen) {
            if (!userOpen) {
                userOpen = true;
                UL_TarihSecimi userLogin = new UL_TarihSecimi();
                userLogin.setVisible(true);
                userLogin.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                        userOpen = false;
                    }
                });
            }
        }
    }//GEN-LAST:event_userButonActionPerformed

    private void adminButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButonActionPerformed
        
           if (!userOpen && !firmaOpen) {
            if (!adminOpen) {
                adminOpen = true;
                AdminLogin adminLogin = new AdminLogin();
                adminLogin.setVisible(true);
                adminLogin.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                        adminOpen = false;
                    }
                });
            }
        }
        
    }//GEN-LAST:event_adminButonActionPerformed

    private void firmaButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firmaButonActionPerformed

          if (!adminOpen && !userOpen) {
            if (!firmaOpen) {
                firmaOpen = true;
                FirmaLogin firmaLogin = new FirmaLogin();
                firmaLogin.setVisible(true);
                firmaLogin.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                        firmaOpen = false;
                    }
                });
            }
        }
        
    }//GEN-LAST:event_firmaButonActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminButon;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JButton firmaButon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton userButon;
    // End of variables declaration//GEN-END:variables
}
