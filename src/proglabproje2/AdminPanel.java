
package proglabproje2;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;


public class AdminPanel extends javax.swing.JFrame {
    
    public AdminPanel() {
        initComponents();

        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        for (Company company : Main.companies) {
            comboBoxModel.addElement(company.getCompanyName());
        }
            jComboBox1.setModel(comboBoxModel);
                       
}
    
        public class CompanyTableModel extends AbstractTableModel {
        private final List<Company> companies;
        private final String[] columnNames = new String[] {
            "Firma İsmi", "Şifre", "Otobüs", "Tren", "Uçak"
        };

        public CompanyTableModel(List<Company> companies) {
            this.companies = companies;
        }

        @Override
        public String getColumnName(int column) {
            return columnNames[column];
        }

        @Override
        public int getRowCount() {
            return companies.size();
        }

        @Override
        public int getColumnCount() {
            return columnNames.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Company company = companies.get(rowIndex);
            switch (columnIndex) {
                case 0: return company.getCompanyName();
                case 1: return company.getPassword();
                case 2: return company.hasOtobus();
                case 3: return company.hasTren();
                case 4: return company.hasUcak();
                default: return null;
            }
        }
        
        @Override
        public Class<?> getColumnClass(int columnIndex) {
            switch (columnIndex) {
                case 0: 
                case 1: return String.class;
                case 2: 
                case 3: 
                case 4: return Boolean.class;
                default: return super.getColumnClass(columnIndex);
            }
        }
        
}
        private int hizmetBedeli = 1000;
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        FirmaKayıt = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        FK_ad_label = new javax.swing.JLabel();
        FK_sifre_label = new javax.swing.JLabel();
        Otobus_cb = new javax.swing.JCheckBox();
        Tren_cb = new javax.swing.JCheckBox();
        Ucak_cb = new javax.swing.JCheckBox();
        FK_ad_tf = new javax.swing.JTextField();
        FK_sifre_pf = new javax.swing.JPasswordField();
        FK_button = new javax.swing.JButton();
        FirmaKayıtSilme = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        FS_ad_label1 = new javax.swing.JLabel();
        FS_sifre_label1 = new javax.swing.JLabel();
        FS_sifre_pf = new javax.swing.JPasswordField();
        FS_button2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        FirmaKayıtGör = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        TabloyuGüncelle = new javax.swing.JButton();
        HizmetBedeli = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        HizmetBedeliLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        HizmetBedeliLabel1 = new javax.swing.JLabel();
        SonDegerHb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admin Paneli");

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));

        FK_ad_label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        FK_ad_label.setForeground(new java.awt.Color(0, 0, 0));
        FK_ad_label.setText("Yeni Oluşturulacak Firmanın Adı");

        FK_sifre_label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        FK_sifre_label.setForeground(new java.awt.Color(0, 0, 0));
        FK_sifre_label.setText("Yeni Oluşturulacak Firmanın Şifresi");

        Otobus_cb.setBackground(new java.awt.Color(204, 255, 255));
        Otobus_cb.setForeground(new java.awt.Color(0, 0, 0));
        Otobus_cb.setText("Otobüs");
        Otobus_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Otobus_cbActionPerformed(evt);
            }
        });

        Tren_cb.setBackground(new java.awt.Color(204, 255, 255));
        Tren_cb.setForeground(new java.awt.Color(0, 0, 0));
        Tren_cb.setText("Tren");
        Tren_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tren_cbActionPerformed(evt);
            }
        });

        Ucak_cb.setBackground(new java.awt.Color(204, 255, 255));
        Ucak_cb.setForeground(new java.awt.Color(0, 0, 0));
        Ucak_cb.setText("Uçak");
        Ucak_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ucak_cbActionPerformed(evt);
            }
        });

        FK_ad_tf.setBackground(new java.awt.Color(219, 226, 239));
        FK_ad_tf.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        FK_sifre_pf.setBackground(new java.awt.Color(219, 226, 239));
        FK_sifre_pf.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        FK_button.setBackground(new java.awt.Color(219, 226, 239));
        FK_button.setForeground(new java.awt.Color(0, 0, 0));
        FK_button.setText("Firmayı Kaydet");
        FK_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FK_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FK_ad_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FK_sifre_label, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addComponent(Otobus_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FK_sifre_pf)
                    .addComponent(FK_ad_tf)
                    .addComponent(FK_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Tren_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                        .addComponent(Ucak_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(FK_ad_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(FK_ad_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FK_sifre_pf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FK_sifre_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tren_cb)
                    .addComponent(Otobus_cb)
                    .addComponent(Ucak_cb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(FK_button)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout FirmaKayıtLayout = new javax.swing.GroupLayout(FirmaKayıt);
        FirmaKayıt.setLayout(FirmaKayıtLayout);
        FirmaKayıtLayout.setHorizontalGroup(
            FirmaKayıtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FirmaKayıtLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        FirmaKayıtLayout.setVerticalGroup(
            FirmaKayıtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Firma Kaydı Oluşturma", FirmaKayıt);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel9.setBackground(new java.awt.Color(204, 255, 255));

        FS_ad_label1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        FS_ad_label1.setForeground(new java.awt.Color(0, 0, 0));
        FS_ad_label1.setText("Silinecek Firmanın Adı");

        FS_sifre_label1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        FS_sifre_label1.setForeground(new java.awt.Color(0, 0, 0));
        FS_sifre_label1.setText("Silinecek Firmanın Şifresi");

        FS_sifre_pf.setBackground(new java.awt.Color(219, 226, 239));
        FS_sifre_pf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FS_sifre_pfActionPerformed(evt);
            }
        });

        FS_button2.setBackground(new java.awt.Color(219, 226, 239));
        FS_button2.setForeground(new java.awt.Color(0, 0, 0));
        FS_button2.setText("Firmayı Sil");
        FS_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FS_buttonActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(219, 226, 239));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FS_ad_label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FS_sifre_label1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FS_sifre_pf)
                    .addComponent(FS_button2, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FS_ad_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FS_sifre_pf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FS_sifre_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(FS_button2)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(157, 157, 157))
        );

        javax.swing.GroupLayout FirmaKayıtSilmeLayout = new javax.swing.GroupLayout(FirmaKayıtSilme);
        FirmaKayıtSilme.setLayout(FirmaKayıtSilmeLayout);
        FirmaKayıtSilmeLayout.setHorizontalGroup(
            FirmaKayıtSilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FirmaKayıtSilmeLayout.setVerticalGroup(
            FirmaKayıtSilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Firma Kaydı Silme", FirmaKayıtSilme);

        CompanyTableModel model = new CompanyTableModel(proglabproje2.Main.companies);
        jTable1.setModel(model);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.getTableHeader().setResizingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        TabloyuGüncelle.setBackground(new java.awt.Color(219, 226, 239));
        TabloyuGüncelle.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        TabloyuGüncelle.setForeground(new java.awt.Color(0, 0, 0));
        TabloyuGüncelle.setText("Tabloyu Güncellemek için Tıklayın");
        TabloyuGüncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TabloyuGüncelleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FirmaKayıtGörLayout = new javax.swing.GroupLayout(FirmaKayıtGör);
        FirmaKayıtGör.setLayout(FirmaKayıtGörLayout);
        FirmaKayıtGörLayout.setHorizontalGroup(
            FirmaKayıtGörLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(FirmaKayıtGörLayout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(TabloyuGüncelle)
                .addContainerGap(297, Short.MAX_VALUE))
        );
        FirmaKayıtGörLayout.setVerticalGroup(
            FirmaKayıtGörLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FirmaKayıtGörLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TabloyuGüncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Firma Görüntüleme", FirmaKayıtGör);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        HizmetBedeliLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        HizmetBedeliLabel.setForeground(new java.awt.Color(0, 0, 0));
        HizmetBedeliLabel.setText("Hizmet Bedelini Güncellemek için Tıklayınız");

        jButton1.setBackground(new java.awt.Color(219, 226, 239));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Güncelle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        HizmetBedeliLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        HizmetBedeliLabel1.setForeground(new java.awt.Color(0, 0, 0));
        HizmetBedeliLabel1.setText("Güncel Hizmet Bedeli");

        SonDegerHb.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        SonDegerHb.setForeground(new java.awt.Color(0, 0, 0));
        SonDegerHb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SonDegerHb.setText(String.valueOf(hizmetBedeli));
        SonDegerHb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HizmetBedeliLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HizmetBedeliLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SonDegerHb, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HizmetBedeliLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HizmetBedeliLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SonDegerHb, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(182, 182, 182))
        );

        javax.swing.GroupLayout HizmetBedeliLayout = new javax.swing.GroupLayout(HizmetBedeli);
        HizmetBedeli.setLayout(HizmetBedeliLayout);
        HizmetBedeliLayout.setHorizontalGroup(
            HizmetBedeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        HizmetBedeliLayout.setVerticalGroup(
            HizmetBedeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane1.addTab("Hizmet Bedeli Belirleme", HizmetBedeli);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private Admin admin = new Admin();

    private void FK_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FK_buttonActionPerformed
    String companyName = FK_ad_tf.getText();
    String password = String.valueOf(FK_sifre_pf.getPassword());
    boolean otobusSecili = Otobus_cb.isSelected();
    boolean trenSecili = Tren_cb.isSelected();
    boolean ucakSecili = Ucak_cb.isSelected();

    if (companyName.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Firma adı ve şifre boş bırakılamaz!");
        return;
    }

    if (otobusSecili || trenSecili || ucakSecili) {
        if (admin.firmaVarMi(companyName)) {
            JOptionPane.showMessageDialog(null, "Aynı isme sahip bir firma zaten mevcut!");
            return;
        }

        admin.firmaEkle(companyName, password, otobusSecili, trenSecili, ucakSecili);

        DefaultComboBoxModel<String> comboBoxModel = (DefaultComboBoxModel<String>) jComboBox1.getModel();
        comboBoxModel.addElement(companyName);

        JOptionPane.showMessageDialog(null, "Firma başarıyla kaydedildi!");

        FK_ad_tf.setText("");
        FK_sifre_pf.setText("");
        Otobus_cb.setSelected(false);
        Tren_cb.setSelected(false);
        Ucak_cb.setSelected(false);
    } else {
        JOptionPane.showMessageDialog(null, "En az bir taşıma seçeneği seçilmelidir!");
    }
    }//GEN-LAST:event_FK_buttonActionPerformed

    private void Ucak_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ucak_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ucak_cbActionPerformed

    private void Tren_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tren_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tren_cbActionPerformed

    private void Otobus_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Otobus_cbActionPerformed

    }//GEN-LAST:event_Otobus_cbActionPerformed

    private void FS_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FS_buttonActionPerformed
    String companyName = (String) jComboBox1.getSelectedItem();
    String password = String.valueOf(FS_sifre_pf.getPassword());

    boolean firmaSilindi = admin.firmaSil(companyName, password);

    if (firmaSilindi) {
        DefaultComboBoxModel<String> comboBoxModel = (DefaultComboBoxModel<String>) jComboBox1.getModel();
        comboBoxModel.removeElement(companyName);

        JOptionPane.showMessageDialog(null, "Firma başarıyla silindi!");
    } else {
        JOptionPane.showMessageDialog(null, "Şifre yanlış! Firma silinemedi!");
    }

    FS_sifre_pf.setText("");
    }//GEN-LAST:event_FS_buttonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void FS_sifre_pfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FS_sifre_pfActionPerformed
        
    }//GEN-LAST:event_FS_sifre_pfActionPerformed

    private void TabloyuGüncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TabloyuGüncelleActionPerformed
        CompanyTableModel model = new CompanyTableModel(Main.companies);
        jTable1.setModel(model);
    }//GEN-LAST:event_TabloyuGüncelleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String yeniHizmetBedeli = JOptionPane.showInputDialog(this, "Yeni hizmet bedelini girin");
        if (yeniHizmetBedeli != null && !yeniHizmetBedeli.isEmpty()) {
            try {
                hizmetBedeli = Integer.parseInt(yeniHizmetBedeli);
                SonDegerHb.setText(String.valueOf(hizmetBedeli));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Geçerli bir sayı girin", "Hata", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FK_ad_label;
    private javax.swing.JTextField FK_ad_tf;
    private javax.swing.JButton FK_button;
    private javax.swing.JLabel FK_sifre_label;
    private javax.swing.JPasswordField FK_sifre_pf;
    private javax.swing.JLabel FS_ad_label1;
    private javax.swing.JButton FS_button2;
    private javax.swing.JLabel FS_sifre_label1;
    private javax.swing.JPasswordField FS_sifre_pf;
    private javax.swing.JPanel FirmaKayıt;
    private javax.swing.JPanel FirmaKayıtGör;
    private javax.swing.JPanel FirmaKayıtSilme;
    private javax.swing.JPanel HizmetBedeli;
    private javax.swing.JLabel HizmetBedeliLabel;
    private javax.swing.JLabel HizmetBedeliLabel1;
    private javax.swing.JCheckBox Otobus_cb;
    private javax.swing.JLabel SonDegerHb;
    private javax.swing.JButton TabloyuGüncelle;
    private javax.swing.JCheckBox Tren_cb;
    private javax.swing.JCheckBox Ucak_cb;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
