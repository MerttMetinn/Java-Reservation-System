
package proglabproje2;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class FirmaLogin extends javax.swing.JFrame {
    public static int firmaIndex;
    
    static boolean isOpen = false;
    
        public FirmaLogin() {
            initComponents();
        }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        f_userName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        f_pass = new javax.swing.JPasswordField();
        f_loginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Firma Girişi");
        setLocation(new java.awt.Point(505, 140));
        setName("firma girişi"); // NOI18N
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Firma Girişi");

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Kullanıcı Adı");

        f_userName.setBackground(new java.awt.Color(219, 226, 239));
        f_userName.setForeground(new java.awt.Color(0, 0, 0));
        f_userName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        f_userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_userNameActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Şifre");

        f_pass.setBackground(new java.awt.Color(219, 226, 239));
        f_pass.setForeground(new java.awt.Color(0, 0, 0));
        f_pass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        f_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_passActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(f_userName)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
            .addComponent(f_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f_userName, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        f_loginButton.setBackground(new java.awt.Color(219, 226, 239));
        f_loginButton.setForeground(new java.awt.Color(0, 0, 0));
        f_loginButton.setText("Giriş Yap");
        f_loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(f_loginButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f_loginButton)
                .addGap(42, 42, 42))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void f_userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_userNameActionPerformed
    }//GEN-LAST:event_f_userNameActionPerformed

    private void f_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_passActionPerformed
    }//GEN-LAST:event_f_passActionPerformed

    private void f_loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_loginButtonActionPerformed
    String kullaniciAdi = f_userName.getText();
    String sifre = new String(f_pass.getPassword());

    boolean loginSuccessful = false;

    
        for (Company company : Main.companies) {
            if (company.getCompanyName().equals(kullaniciAdi) && company.checkPassword(sifre)) {
               firmaIndex = Main.companies.indexOf(company);
                loginSuccessful = true;
                break;
            }
        }
    

    if (loginSuccessful) {
        Main.currentCompany = Main.companies.get(firmaIndex);
    if (!isOpen) {
        JOptionPane.showMessageDialog(this, "Giriş başarılı", "Başarılı", JOptionPane.INFORMATION_MESSAGE);
        isOpen = true;
        FirmaPanel firmaPanel = new FirmaPanel();
        String companyName = Main.companies.get(firmaIndex).getCompanyName();
        firmaPanel.setTitle(companyName + " Firma Paneli");
        firmaPanel.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                isOpen = false;
            }
        });
        firmaPanel.setVisible(true);
        
    }
} 
    else {
    JOptionPane.showMessageDialog(this, "Hatalı giriş", "Hata", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_f_loginButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton f_loginButton;
    private javax.swing.JPasswordField f_pass;
    private javax.swing.JTextField f_userName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
