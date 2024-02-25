
package proglabproje2;

import proglabproje2.Airplane;
import proglabproje2.Bus;
import proglabproje2.Company;
import proglabproje2.FirmaLogin;
import proglabproje2.Train;
import proglabproje2.Trip;
import proglabproje2.Main;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class FirmaPanel extends javax.swing.JFrame {
        private String firmaAdi;
        private DefaultTableModel model;
        String secilenAracTuru = null;
        public int i = 0;
        ArrayList<String> yakitTurleri = new ArrayList<String>();   
        Integer index = Integer.valueOf(FirmaLogin.firmaIndex);
        
        public FirmaPanel() {
        yakitTurleri.add("Benzin");
        yakitTurleri.add("Motorin");
        yakitTurleri.add("Elektrik");
        yakitTurleri.add("Gaz");
        initComponents();
        fillComboBoxWithVehicleTypes();
        fillTableWithVehicles();
        }
        
        ListSelectionListener selectionListener = new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
                if (jTable1.getSelectedRowCount() > 1) {
                    jTable1.clearSelection();
                }
            }
        };
        
        Company c = Main.companies.get(index);
        
        private void fillComboBoxWithVehicleTypes() {
        aracTuruCBox.removeAllItems();

        if (Main.currentCompany.hasOtobus()) {
            aracTuruCBox.addItem("Otobüs");  
        }
        if (Main.currentCompany.hasTren()) {
            aracTuruCBox.addItem("Tren");
        }
        if (Main.currentCompany.hasUcak()) {
            aracTuruCBox.addItem("Uçak");
        }
        }
        
        private void fillTableWithVehicles() {
        model = new DefaultTableModel(new Object[]{"Araç Adı", "Koltuk Kapasitesi", "Yakıt Türü", "Firma","Sefer Bilgisi"}, 0);
        jTable1.setModel(model);
        model.setRowCount(0);

        for (Bus bus : Bus.otobusListesi) {
            if (bus.getAracinFirmasi().equals(Main.currentCompany.getCompanyName())) {
                model.addRow(new Object[]{bus.getBusName(), bus.getKoltukSayisi(), bus.getFuelType(), bus.getAracinFirmasi(),bus.getAtananSeferStringi()});
            }
        }

        for (Train train : Train.trenListesi) {
            if (train.getAracinFirmasi().equals(Main.currentCompany.getCompanyName())) {
                model.addRow(new Object[]{train.getTrainName(), train.getKoltukSayisi(), train.getFuelType(), train.getAracinFirmasi(),train.getAtananSeferStringi()});
            }
        }

        for (Airplane ap : Airplane.ucakListesi) {
            if (ap.getAracinFirmasi().equals(Main.currentCompany.getCompanyName())) {
                model.addRow(new Object[]{ap.getAirplaneName(), ap.getKoltukSayisi(), ap.getFuelType(), ap.getAracinFirmasi(),ap.getAtananSeferStringi()});
            }
        }
    }
        public FirmaPanel(String firmaAdi) {
        this.firmaAdi = firmaAdi;
        }
                
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        AraçEkleme = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        koltukKapLabel = new javax.swing.JLabel();
        koltukKapField = new javax.swing.JTextField();
        aracAdiniGirinLabel = new javax.swing.JLabel();
        girilenAracAdiField = new javax.swing.JTextField();
        aracTipiniOnaylaButton = new javax.swing.JButton();
        yakitTuruLabel = new javax.swing.JLabel();
        aracTuruCBox = new javax.swing.JComboBox<>();
        yakitTuruCBox = new javax.swing.JComboBox<>();
        araciEkleButonu = new javax.swing.JButton();
        AraçSilme = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        SeçiliSatırdakiAracıSilButton = new javax.swing.JButton();
        TabloGüncelle = new javax.swing.JButton();
        SeferEkleme = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        seferEklenecekAracTuruCBox = new javax.swing.JComboBox<>();
        aracTurunuOnaylaButonu = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        seferEklenecekAracField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        eklenecekSeferTuruCBox = new javax.swing.JComboBox<>();
        girilenSeferiAtaButonu = new javax.swing.JButton();
        SeferSilme = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        silinecekSeferAracTuruCBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        seferSilinecekAracAdiField = new javax.swing.JTextField();
        seferSilinecekAracButonu = new javax.swing.JButton();
        aracSeferSilButonu = new javax.swing.JButton();
        KarZararHesaplama = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Firma Giris");

        AraçEkleme.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("EKLEMEK İSTEDİĞİNİZ ARAÇ TÜRÜ");

        koltukKapLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        koltukKapLabel.setForeground(new java.awt.Color(0, 0, 0));
        koltukKapLabel.setText("KOLTUK KAPASİTESİ");
        koltukKapLabel.setEnabled(false);

        koltukKapField.setBackground(new java.awt.Color(219, 226, 239));
        koltukKapField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        koltukKapField.setForeground(new java.awt.Color(0, 0, 0));
        koltukKapField.setEnabled(false);
        koltukKapField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                koltukKapFieldActionPerformed(evt);
            }
        });

        aracAdiniGirinLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        aracAdiniGirinLabel.setForeground(new java.awt.Color(0, 0, 0));
        aracAdiniGirinLabel.setText("ARAÇ ADINI GİRİN");
        aracAdiniGirinLabel.setEnabled(false);

        girilenAracAdiField.setBackground(new java.awt.Color(219, 226, 239));
        girilenAracAdiField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        girilenAracAdiField.setForeground(new java.awt.Color(0, 0, 0));
        girilenAracAdiField.setEnabled(false);
        girilenAracAdiField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girilenAracAdiFieldActionPerformed(evt);
            }
        });

        aracTipiniOnaylaButton.setBackground(new java.awt.Color(219, 226, 239));
        aracTipiniOnaylaButton.setForeground(new java.awt.Color(0, 0, 0));
        aracTipiniOnaylaButton.setText("ONAYLA");
        aracTipiniOnaylaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aracTipiniOnaylaButtonActionPerformed(evt);
            }
        });

        yakitTuruLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        yakitTuruLabel.setForeground(new java.awt.Color(0, 0, 0));
        yakitTuruLabel.setText("ARACIN KULLANACAĞI YAKIT TÜRÜ");
        yakitTuruLabel.setEnabled(false);

        aracTuruCBox.setBackground(new java.awt.Color(219, 226, 239));
        aracTuruCBox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        aracTuruCBox.setForeground(new java.awt.Color(0, 0, 0));
        aracTuruCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Otobüs", "Tren", "Uçak" }));

        yakitTuruCBox.setBackground(new java.awt.Color(219, 226, 239));
        yakitTuruCBox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        yakitTuruCBox.setForeground(new java.awt.Color(0, 0, 0));
        yakitTuruCBox.setModel(
            new DefaultComboBoxModel(yakitTurleri.toArray())
        );
        yakitTuruCBox.setEnabled(false);
        yakitTuruCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yakitTuruCBoxActionPerformed(evt);
            }
        });

        araciEkleButonu.setBackground(new java.awt.Color(219, 226, 239));
        araciEkleButonu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        araciEkleButonu.setForeground(new java.awt.Color(0, 0, 0));
        araciEkleButonu.setText("ARACI EKLE");
        araciEkleButonu.setEnabled(false);
        araciEkleButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                araciEkleButonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AraçEklemeLayout = new javax.swing.GroupLayout(AraçEkleme);
        AraçEkleme.setLayout(AraçEklemeLayout);
        AraçEklemeLayout.setHorizontalGroup(
            AraçEklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AraçEklemeLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(AraçEklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AraçEklemeLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(aracTuruCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(aracTipiniOnaylaButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(AraçEklemeLayout.createSequentialGroup()
                        .addGroup(AraçEklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(koltukKapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aracAdiniGirinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yakitTuruLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(AraçEklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(koltukKapField, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(girilenAracAdiField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(yakitTuruCBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(araciEkleButonu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(187, 187, 187))
        );
        AraçEklemeLayout.setVerticalGroup(
            AraçEklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AraçEklemeLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(AraçEklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aracTuruCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aracTipiniOnaylaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(AraçEklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aracAdiniGirinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(girilenAracAdiField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(AraçEklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AraçEklemeLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(koltukKapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(koltukKapField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(AraçEklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AraçEklemeLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(yakitTuruLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(yakitTuruCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(araciEkleButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Araç Ekleme", AraçEkleme);

        jTable1 = new javax.swing.JTable() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getSelectionModel().addListSelectionListener(selectionListener);
        jScrollPane1.setViewportView(jTable1);

        SeçiliSatırdakiAracıSilButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        SeçiliSatırdakiAracıSilButton.setText("Seçili Aracı Silmek için Tıklayın");
        SeçiliSatırdakiAracıSilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeçiliSatırdakiAracıSilButtonActionPerformed(evt);
            }
        });

        TabloGüncelle.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        TabloGüncelle.setText("Tabloyu Güncelle");
        TabloGüncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TabloGüncelleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AraçSilmeLayout = new javax.swing.GroupLayout(AraçSilme);
        AraçSilme.setLayout(AraçSilmeLayout);
        AraçSilmeLayout.setHorizontalGroup(
            AraçSilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AraçSilmeLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(TabloGüncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(SeçiliSatırdakiAracıSilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );
        AraçSilmeLayout.setVerticalGroup(
            AraçSilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AraçSilmeLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(AraçSilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SeçiliSatırdakiAracıSilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TabloGüncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Araç Silme ve Görüntüleme", AraçSilme);

        jLabel4.setText("SEFER EKLEMEK İSTEDİĞİNİZ ARACIN TÜRÜ");

        seferEklenecekAracTuruCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Otobüs", "Tren", "Uçak" }));

        aracTurunuOnaylaButonu.setText("ARAÇ TÜRÜNÜ ONAYLA");
        aracTurunuOnaylaButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aracTurunuOnaylaButonuActionPerformed(evt);
            }
        });

        jLabel5.setText("SEFER EKLEMEK İSTEDİĞİNİZ ARACIN ADI");
        jLabel5.setEnabled(false);

        seferEklenecekAracField.setEnabled(false);

        jLabel7.setText("ARACA EKLEMEK İSTEDİĞİNİZ SEFERİ SEÇİN");
        jLabel7.setEnabled(false);

        eklenecekSeferTuruCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 - (IST - KOC - BIL - ESK - ANK)","2 - (IST - KOC - BIL - ESK - KON)", "3 - (IST - KOC - ANK)", "4 - (IST - KOC - ESK - KON)", "5 - (IST - KON)", "6 - (IST - ANK)" }));
        eklenecekSeferTuruCBox.setEnabled(false);

        girilenSeferiAtaButonu.setText("ARACA GİRİLEN SEFERİ ATA");
        girilenSeferiAtaButonu.setEnabled(false);
        girilenSeferiAtaButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girilenSeferiAtaButonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SeferEklemeLayout = new javax.swing.GroupLayout(SeferEkleme);
        SeferEkleme.setLayout(SeferEklemeLayout);
        SeferEklemeLayout.setHorizontalGroup(
            SeferEklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeferEklemeLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(SeferEklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SeferEklemeLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seferEklenecekAracTuruCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SeferEklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(girilenSeferiAtaButonu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, SeferEklemeLayout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(eklenecekSeferTuruCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(SeferEklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(aracTurunuOnaylaButonu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, SeferEklemeLayout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(seferEklenecekAracField, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        SeferEklemeLayout.setVerticalGroup(
            SeferEklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeferEklemeLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(SeferEklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(seferEklenecekAracTuruCBox, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aracTurunuOnaylaButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SeferEklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seferEklenecekAracField, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SeferEklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eklenecekSeferTuruCBox, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(girilenSeferiAtaButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sefer Ekleme", SeferEkleme);

        jLabel3.setText("SEFER SİLMEK İSTEDİĞİNİZ ARACIN TÜRÜ");

        silinecekSeferAracTuruCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Otobüs", "Tren", "Uçak"}));

        jLabel8.setText("SEFER SİLMEK İSTEDİĞİNİZ ARACIN ADI");
        jLabel8.setEnabled(false);

        seferSilinecekAracAdiField.setEnabled(false);
        seferSilinecekAracAdiField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seferSilinecekAracAdiFieldActionPerformed(evt);
            }
        });

        seferSilinecekAracButonu.setText("ARAÇ TÜRÜNÜ ONAYLA");
        seferSilinecekAracButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seferSilinecekAracButonuActionPerformed(evt);
            }
        });

        aracSeferSilButonu.setText("SEÇİLEN ARAÇTAKİ SEFERİ SİL");
        aracSeferSilButonu.setEnabled(false);
        aracSeferSilButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aracSeferSilButonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SeferSilmeLayout = new javax.swing.GroupLayout(SeferSilme);
        SeferSilme.setLayout(SeferSilmeLayout);
        SeferSilmeLayout.setHorizontalGroup(
            SeferSilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeferSilmeLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addGroup(SeferSilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(seferSilinecekAracButonu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(SeferSilmeLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(silinecekSeferAracTuruCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SeferSilmeLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seferSilinecekAracAdiField, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(aracSeferSilButonu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        SeferSilmeLayout.setVerticalGroup(
            SeferSilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeferSilmeLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(SeferSilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(silinecekSeferAracTuruCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seferSilinecekAracButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SeferSilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seferSilinecekAracAdiField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aracSeferSilButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sefer Silme", SeferSilme);

        javax.swing.GroupLayout KarZararHesaplamaLayout = new javax.swing.GroupLayout(KarZararHesaplama);
        KarZararHesaplama.setLayout(KarZararHesaplamaLayout);
        KarZararHesaplamaLayout.setHorizontalGroup(
            KarZararHesaplamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 979, Short.MAX_VALUE)
        );
        KarZararHesaplamaLayout.setVerticalGroup(
            KarZararHesaplamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Kar - Zarar Hesaplama", KarZararHesaplama);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        getAccessibleContext().setAccessibleName("firmaGirisJFrame");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SeçiliSatırdakiAracıSilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeçiliSatırdakiAracıSilButtonActionPerformed
    int selectedRow = jTable1.getSelectedRow();
    if (selectedRow != -1) {
        String selectedVehicleName = (String) jTable1.getValueAt(selectedRow, 0);
        Object selectedVehicleType = jTable1.getValueAt(selectedRow, 1);

        if (selectedVehicleType instanceof String && ((String) selectedVehicleType).equals("Otobüs")) {
            for (Bus bus : Bus.otobusListesi) {
                if (bus.getBusName().equals(selectedVehicleName)) {
                    Bus.otobusListesi.remove(bus);
                    break;
                }
            }
        } else if (selectedVehicleType instanceof String && ((String) selectedVehicleType).equals("Tren")) {
            for (Train train : Train.trenListesi) {
                if (train.getTrainName().equals(selectedVehicleName)) {
                    Train.trenListesi.remove(train);
                    break;
                }
            }
        } else if (selectedVehicleType instanceof String && ((String) selectedVehicleType).equals("Uçak")) {
            for (Airplane ap : Airplane.ucakListesi) {
                if (ap.getAirplaneName().equals(selectedVehicleName)) {
                    Airplane.ucakListesi.remove(ap);
                    break;
                }
            }
        }
        model.removeRow(selectedRow);
        JOptionPane.showMessageDialog(this, "Araç başarıyla silindi.");
    }
    }//GEN-LAST:event_SeçiliSatırdakiAracıSilButtonActionPerformed

    private void TabloGüncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TabloGüncelleActionPerformed
    int selectedRow = jTable1.getSelectedRow();
    String selectedVehicleName = null;
    if (selectedRow != -1) {
        selectedVehicleName = (String) jTable1.getValueAt(selectedRow, 0);
    }

    model.setRowCount(0); // Tabloyu temizle

    for (Bus bus : Bus.otobusListesi) {
        if (bus.getAracinFirmasi().equals(Main.currentCompany.getCompanyName())) {
            model.addRow(new Object[]{bus.getBusName(), bus.getKoltukSayisi(), bus.getFuelType(), bus.getAracinFirmasi()});
        }
    }

    for (Train train : Train.trenListesi) {
        if (train.getAracinFirmasi().equals(Main.currentCompany.getCompanyName())) {
            model.addRow(new Object[]{train.getTrainName(), train.getKoltukSayisi(), train.getFuelType(), train.getAracinFirmasi()});
        }
    }

    for (Airplane ap : Airplane.ucakListesi) {
        if (ap.getAracinFirmasi().equals(Main.currentCompany.getCompanyName())) {
            model.addRow(new Object[]{ap.getAirplaneName(), ap.getKoltukSayisi(), ap.getFuelType(), ap.getAracinFirmasi()});
        }
    }

    if (selectedVehicleName != null) {
        for (int row = 0; row < jTable1.getRowCount(); row++) {
            String vehicleName = (String) jTable1.getValueAt(row, 0);
            if (vehicleName.equals(selectedVehicleName)) {
                jTable1.setRowSelectionInterval(row, row);
                break;
            }
        }
    }
    }//GEN-LAST:event_TabloGüncelleActionPerformed

    private void aracTurunuOnaylaButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aracTurunuOnaylaButonuActionPerformed
        secilenAracTuru = (String) seferEklenecekAracTuruCBox.getSelectedItem();
        if(secilenAracTuru.equals("Otobüs") && c.hasOtobus())
        {
            jLabel5.setEnabled(true);
            seferEklenecekAracField.setEnabled(true);
            jLabel7.setEnabled(true);
            eklenecekSeferTuruCBox.setEnabled(true);
            girilenSeferiAtaButonu.setEnabled(true);
            eklenecekSeferTuruCBox.removeItem("1 - (IST - KOC - BIL - ESK - ANK)");
            eklenecekSeferTuruCBox.removeItem("2 - (IST - KOC - BIL - ESK - KON)");
            eklenecekSeferTuruCBox.removeItem("5 - (IST - KON)");
            eklenecekSeferTuruCBox.removeItem("6 - (IST - ANK)");
        }
        else if(secilenAracTuru.equals("Tren") && c.hasTren())
        {
            jLabel5.setEnabled(true);
            seferEklenecekAracField.setEnabled(true);
            jLabel7.setEnabled(true);
            eklenecekSeferTuruCBox.setEnabled(true);
            girilenSeferiAtaButonu.setEnabled(true);
            eklenecekSeferTuruCBox.removeItem("3 - (IST - KOC - ANK)");
            eklenecekSeferTuruCBox.removeItem("4 - (IST - KOC - ESK - KON)");
            eklenecekSeferTuruCBox.removeItem("5 - (IST - KON)");
            eklenecekSeferTuruCBox.removeItem("6 - (IST - ANK)");
        }
        else if(secilenAracTuru.equals("Uçak") && c.hasUcak())
        {
            jLabel5.setEnabled(true);
            seferEklenecekAracField.setEnabled(true);
            jLabel7.setEnabled(true);
            eklenecekSeferTuruCBox.setEnabled(true);
            girilenSeferiAtaButonu.setEnabled(true);
            eklenecekSeferTuruCBox.removeItem("1 - (IST - KOC - BIL - ESK - ANK)");
            eklenecekSeferTuruCBox.removeItem("2 - (IST - KOC - BIL - ESK - KON)");
            eklenecekSeferTuruCBox.removeItem("3 - (IST - KOC - ANK)");
            eklenecekSeferTuruCBox.removeItem("4 - (IST - KOC - ESK - KON)");
        }
    }//GEN-LAST:event_aracTurunuOnaylaButonuActionPerformed

    private void girilenSeferiAtaButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girilenSeferiAtaButonuActionPerformed
        boolean seferAtandiMi = false;
        switch(secilenAracTuru)
        {

            case "Otobüs":
            {
                secilenAracTuru = (String) seferEklenecekAracTuruCBox.getSelectedItem();
                String seferEklenecekAracAdi = seferEklenecekAracField.getText();
                String aracaEklenecekSefer = (String) eklenecekSeferTuruCBox.getSelectedItem();
                for(Bus b : Bus.otobusListesi)
                {
                    if(c.getCompanyName().equals(b.getAracinFirmasi()) && b.getBusName().equals(seferEklenecekAracAdi))
                    {
                        if(aracaEklenecekSefer.equals("3 - (IST - KOC - ANK)"))
                        {
                            b.atananSefer = new int[3][3];
                            b.setAtananSeferStringi("3 - (IST - KOC - ANK)");
                            for(int i = 0;i < 3 ; i++)
                            {
                                for(int j = 0;j < 3;j++)
                                {
                                    b.atananSefer[i][j] = Trip.sefer3[i][j];
                                }
                            }
                            seferAtandiMi = true;
                            JOptionPane.showMessageDialog(null, "Sefer Araca Eklendi!", "Bilgi", JOptionPane.INFORMATION_MESSAGE);                            
                            b.setSeferVarMi(true);
                            break;
                        }
                        else
                        {

                            b.atananSefer = new int[4][4];
                            b.setAtananSeferStringi("4 - (IST - KOC - ESK - KON)");
                            for(int i = 0;i < 4 ; i++)
                            {
                                for(int j = 0;j < 4;j++)
                                {
                                    b.atananSefer[i][j] = Trip.sefer4[i][j];
                                }
                            }
                            seferAtandiMi = true;
                            b.setSeferVarMi(true);
                            JOptionPane.showMessageDialog(null, "Sefer Araca Eklendi!", "Bilgi", JOptionPane.INFORMATION_MESSAGE);              
                            break;
                        }
                    }
                }
                if(!seferAtandiMi)
                {
                    JOptionPane.showMessageDialog(null, "Sefer Ekleme Başarısız!", "Hata", JOptionPane.ERROR_MESSAGE);
                }
            }
            break;

            case "Tren":
            {
                secilenAracTuru = (String) seferEklenecekAracTuruCBox.getSelectedItem();
                String seferEklenecekAracAdi = seferEklenecekAracField.getText();
                String aracaEklenecekSefer = (String) eklenecekSeferTuruCBox.getSelectedItem();
                for(Train t : Train.trenListesi)
                {
                    if(c.getCompanyName().equals(t.getAracinFirmasi()) && t.getTrainName().equals(seferEklenecekAracAdi))
                    {
                        if(aracaEklenecekSefer.equals("1 - (IST - KOC - BIL - ESK - ANK)"))
                        {
                            t.atananSefer = new int[5][5];
                            t.setAtananSeferStringi("1 - (IST - KOC - BIL - ESK - ANK)");
                            for(int i = 0;i < 5 ; i++)
                            {
                                for(int j = 0;j < 5;j++)
                                {
                                    t.atananSefer[i][j] = Trip.sefer1[i][j];
                                }
                            }
                            seferAtandiMi = true;
                            t.setSeferVarMi(true);
                            JOptionPane.showMessageDialog(null, "Sefer Araca Eklendi!", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                        else
                        {
                            t.atananSefer = new int[5][5];
                            t.setAtananSeferStringi("2 - (IST - KOC - BIL - ESK - KON)");
                            for(int i = 0;i < 5 ; i++)
                            {
                                for(int j = 0;j < 5;j++)
                                {
                                    t.atananSefer[i][j] = Trip.sefer2[i][j];
                                }
                            }
                            seferAtandiMi = true;
                            t.setSeferVarMi(true);
                            JOptionPane.showMessageDialog(null, "Sefer Araca Eklendi!", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                    }
                }
                if(!seferAtandiMi)
                {
                    JOptionPane.showMessageDialog(null, "Sefer Ekleme Başarısız!", "Hata", JOptionPane.ERROR_MESSAGE);
                }
            }
            break;

            case "Uçak":
            {
                secilenAracTuru = (String) seferEklenecekAracTuruCBox.getSelectedItem();
                String seferEklenecekAracAdi = seferEklenecekAracField.getText();
                String aracaEklenecekSefer = (String) eklenecekSeferTuruCBox.getSelectedItem();
                for(Airplane ap : Airplane.ucakListesi)
                {
                    if(c.getCompanyName().equals(ap.getAracinFirmasi()) && ap.getAirplaneName().equals(seferEklenecekAracAdi))
                    {
                        if(aracaEklenecekSefer.equals("5 - (IST - KON)"))
                        {
                            ap.atananSefer = new int[2][2];
                            ap.setAtananSeferStringi("5 - (IST - KON)");
                            for(int i = 0;i < 2 ; i++)
                            {
                                for(int j = 0;j < 2;j++)
                                {
                                    ap.atananSefer[i][j] = Trip.sefer5[i][j];
                                }
                            }
                            seferAtandiMi = true;
                            ap.setSeferVarMi(true);
                            JOptionPane.showMessageDialog(null, "Sefer Araca Eklendi!", "Bilgi", JOptionPane.INFORMATION_MESSAGE);                            
                            break;
                        }
                        else
                        {
                            ap.atananSefer = new int[2][2];
                            ap.setAtananSeferStringi("6 - (IST - ANK)");
                            for(int i = 0;i < 2 ; i++)
                            {
                                for(int j = 0;j < 2;j++)
                                {
                                    ap.atananSefer[i][j] = Trip.sefer6[i][j];
                                }
                            }
                            seferAtandiMi = true;
                            ap.setSeferVarMi(true);
                            JOptionPane.showMessageDialog(null, "Sefer Araca Eklendi!", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                    }

                }
                if(!seferAtandiMi)
                {
                    JOptionPane.showMessageDialog(null, "Sefer Ekleme Başarısız!", "Hata", JOptionPane.ERROR_MESSAGE);
                }
            }
            break;
        }

    }//GEN-LAST:event_girilenSeferiAtaButonuActionPerformed

    private void seferSilinecekAracAdiFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seferSilinecekAracAdiFieldActionPerformed

    }//GEN-LAST:event_seferSilinecekAracAdiFieldActionPerformed

    private void seferSilinecekAracButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seferSilinecekAracButonuActionPerformed
        secilenAracTuru = (String) silinecekSeferAracTuruCBox.getSelectedItem();
        if(secilenAracTuru.equals("Otobüs") && c.hasOtobus())
        {
            jLabel8.setEnabled(true);
            seferSilinecekAracAdiField.setEnabled(true);
            aracSeferSilButonu.setEnabled(true);
        }
        else if(secilenAracTuru.equals("Tren") && c.hasTren())
        {
            jLabel8.setEnabled(true);
            seferSilinecekAracAdiField.setEnabled(true);
            aracSeferSilButonu.setEnabled(true);
        }
        else if(secilenAracTuru.equals("Uçak") && c.hasUcak())
        {
            jLabel8.setEnabled(true);
            seferSilinecekAracAdiField.setEnabled(true);
            aracSeferSilButonu.setEnabled(true);
        }
    }//GEN-LAST:event_seferSilinecekAracButonuActionPerformed

    private void aracSeferSilButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aracSeferSilButonuActionPerformed
        secilenAracTuru = (String) silinecekSeferAracTuruCBox.getSelectedItem();
        String seferSilinecekArac = seferSilinecekAracAdiField.getText();

        switch(secilenAracTuru)
        {
            case "Otobüs":
            {
                for(Bus b : Bus.otobusListesi)
                {
                    if(c.getCompanyName().equals(b.getAracinFirmasi()) && b.getBusName().equals(seferSilinecekArac))
                    {
                        if(b.getAtananSeferStringi().equals("3 - (IST - KOC - ANK)"))
                        {
                            for(int i = 0;i<3;i++)
                            {
                                for(int j = 0;j<3;j++)
                                {
                                    b.atananSefer[i][j] = 0;
                                }
                            }
                            b.setAtananSeferStringi("SEFER TANIMLI DEĞİL");
                            b.setSeferVarMi(false);
                            break;
                        }
                        else
                        {
                            for(int i = 0;i < 4;i++)
                            {
                                for(int j = 0;j < 4 ; j++)
                                {
                                    b.atananSefer[i][j] = 0;
                                }
                            }
                            b.setAtananSeferStringi("SEFER TANIMLI DEĞİL");
                            b.setSeferVarMi(false);
                            break;
                        }
                    }
                }
            }
            break;
            case "Tren":
            {
                for(Train t : Train.trenListesi)
                {
                    if(c.getCompanyName().equals(t.getAracinFirmasi()) && t.getTrainName().equals(seferSilinecekArac))
                    {
                        if(t.getAtananSeferStringi().equals("1 - (IST - KOC - BIL - ESK - ANK)"))
                        {
                            for(int i = 0;i<5;i++)
                            {
                                for(int j = 0;j<5;j++)
                                {
                                    t.atananSefer[i][j] = 0;
                                }
                            }
                            t.setAtananSeferStringi("SEFER TANIMLI DEĞİL");
                            t.setSeferVarMi(false);
                            break;
                        }
                        else
                        {
                            for(int i = 0;i < 5;i++)
                            {
                                for(int j = 0;j < 5 ; j++)
                                {
                                     t.atananSefer[i][j] = 0;                                
                                }
                            }
                            t.setAtananSeferStringi("SEFER TANIMLI DEĞİL");
                            t.setSeferVarMi(false);
                            break;
                        }
                    }
                }
            }
            break;
            case "Uçak":
            {
                for(Airplane ap : Airplane.ucakListesi)
                {
                    if(c.getCompanyName().equals(ap.getAracinFirmasi()) && ap.getAirplaneName().equals(seferSilinecekArac))
                    {
                        if(ap.getAtananSeferStringi().equals("5 - (IST - KON)"))
                        {
                            for(int i = 0;i<2;i++)
                            {
                                for(int j = 0;j<2;j++)
                                {
                                    ap.atananSefer[i][j] = 0;
                                }
                            }
                            ap.setAtananSeferStringi("SEFER TANIMLI DEĞİL");
                            ap.setSeferVarMi(false);
                            break;
                        }
                        else
                        {
                            for(int i = 0;i < 2;i++)
                            {
                                for(int j = 0;j < 2 ; j++)
                                {
                                    ap.atananSefer[i][j] = 0;
                                }
                            }
                            ap.setAtananSeferStringi("SEFER TANIMLI DEĞİL");
                            ap.setSeferVarMi(false);
                            break;
                        }
                    }
                }
            }
            break;
        }
    }//GEN-LAST:event_aracSeferSilButonuActionPerformed

    private void araciEkleButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_araciEkleButonuActionPerformed

        String girilenAracAdi = girilenAracAdiField.getText();
        if (girilenAracAdi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Araç ismi boş geçilemez.", "Hata", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int koltukKapasitesi;
        try {
            koltukKapasitesi = Integer.parseInt(koltukKapField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Geçersiz Koltuk Kapasitesi", "Hata", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String yakitTuru = (String) yakitTuruCBox.getSelectedItem();
        String aracinFirmasi = c.getCompanyName();

        switch(secilenAracTuru) {
            case "Otobüs" -> {
                for (Bus bus : Bus.otobusListesi) {
                    if (bus.getBusName().equals(girilenAracAdi)) {
                        JOptionPane.showMessageDialog(this, "Bu araç ismi zaten kullanılıyor.", "Hata", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }

                Bus b = new Bus(girilenAracAdi, koltukKapasitesi, yakitTuru, aracinFirmasi);
                Bus.otobusListesi.add(b);
            }

            case "Tren" -> {
                for (Train train : Train.trenListesi) {
                    if (train.getTrainName().equals(girilenAracAdi)) {
                        JOptionPane.showMessageDialog(this, "Bu araç ismi zaten kullanılıyor.", "Hata", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }

                Train t = new Train(girilenAracAdi, koltukKapasitesi, yakitTuru, aracinFirmasi);
                Train.trenListesi.add(t);
            }

            case "Uçak" -> {
                for (Airplane ap : Airplane.ucakListesi) {
                    if (ap.getAirplaneName().equals(girilenAracAdi)) {
                        JOptionPane.showMessageDialog(this, "Bu araç ismi zaten kullanılıyor.", "Hata", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }

                Airplane a = new Airplane(girilenAracAdi, koltukKapasitesi, yakitTuru, aracinFirmasi);
                Airplane.ucakListesi.add(a);
            }
        }

        JOptionPane.showMessageDialog(this, "Araç başarıyla eklendi.", "Başarılı", JOptionPane.INFORMATION_MESSAGE);
        girilenAracAdiField.setText("");
        koltukKapField.setText("");
        aracTuruCBox.setSelectedIndex(0);
        yakitTuruCBox.setSelectedIndex(0);
    }//GEN-LAST:event_araciEkleButonuActionPerformed

    private void yakitTuruCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yakitTuruCBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yakitTuruCBoxActionPerformed

    private void aracTipiniOnaylaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aracTipiniOnaylaButtonActionPerformed
        secilenAracTuru = (String) aracTuruCBox.getSelectedItem();
        if(secilenAracTuru.equals("Otobüs") && c.hasOtobus())
        {
            yakitTuruCBox.removeItem("Elektrik");
            yakitTuruCBox.removeItem("Gaz");
            yakitTurleri.remove("Elektrik");
            yakitTurleri.remove("Gaz");
            aracAdiniGirinLabel.setEnabled(true);
            girilenAracAdiField.setEnabled(true);
            koltukKapLabel.setEnabled(true);
            koltukKapField.setEnabled(true);
            araciEkleButonu.setEnabled(true);
            yakitTuruLabel.setEnabled(true);
            yakitTuruCBox.setEnabled(true);
        }

        else if(secilenAracTuru.equals("Tren") && c.hasTren())
        {
            yakitTuruCBox.removeItem("Motorin");
            yakitTuruCBox.removeItem("Benzin");
            yakitTuruCBox.removeItem("Gaz");
            yakitTurleri.remove("Motorin");
            yakitTurleri.remove("Benzin");
            yakitTurleri.remove("Gaz");
            aracAdiniGirinLabel.setEnabled(true);
            girilenAracAdiField.setEnabled(true);
            koltukKapLabel.setEnabled(true);
            koltukKapField.setEnabled(true);
            araciEkleButonu.setEnabled(true);
            yakitTuruLabel.setEnabled(true);
            yakitTuruCBox.setEnabled(true);
        }
        else if(secilenAracTuru.equals("Uçak") && c.hasUcak())
        {
            yakitTuruCBox.removeItem("Motorin");
            yakitTuruCBox.removeItem("Benzin");
            yakitTuruCBox.removeItem("Elektrik");
            yakitTurleri.remove("Motorin");
            yakitTurleri.remove("Benzin");
            yakitTurleri.remove("Elektrik");
            aracAdiniGirinLabel.setEnabled(true);
            girilenAracAdiField.setEnabled(true);
            koltukKapLabel.setEnabled(true);
            koltukKapField.setEnabled(true);
            araciEkleButonu.setEnabled(true);
            yakitTuruLabel.setEnabled(true);
            yakitTuruCBox.setEnabled(true);
        }
    }//GEN-LAST:event_aracTipiniOnaylaButtonActionPerformed

    private void girilenAracAdiFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girilenAracAdiFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_girilenAracAdiFieldActionPerformed

    private void koltukKapFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_koltukKapFieldActionPerformed

    }//GEN-LAST:event_koltukKapFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AraçEkleme;
    private javax.swing.JPanel AraçSilme;
    private javax.swing.JPanel KarZararHesaplama;
    private javax.swing.JPanel SeferEkleme;
    private javax.swing.JPanel SeferSilme;
    private javax.swing.JButton SeçiliSatırdakiAracıSilButton;
    private javax.swing.JButton TabloGüncelle;
    private javax.swing.JLabel aracAdiniGirinLabel;
    private javax.swing.JButton aracSeferSilButonu;
    private javax.swing.JButton aracTipiniOnaylaButton;
    private javax.swing.JComboBox<String> aracTuruCBox;
    private javax.swing.JButton aracTurunuOnaylaButonu;
    private javax.swing.JButton araciEkleButonu;
    private javax.swing.JComboBox<String> eklenecekSeferTuruCBox;
    private javax.swing.JTextField girilenAracAdiField;
    private javax.swing.JButton girilenSeferiAtaButonu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField koltukKapField;
    private javax.swing.JLabel koltukKapLabel;
    private javax.swing.JTextField seferEklenecekAracField;
    private javax.swing.JComboBox<String> seferEklenecekAracTuruCBox;
    private javax.swing.JTextField seferSilinecekAracAdiField;
    private javax.swing.JButton seferSilinecekAracButonu;
    private javax.swing.JComboBox<String> silinecekSeferAracTuruCBox;
    private javax.swing.JComboBox<String> yakitTuruCBox;
    private javax.swing.JLabel yakitTuruLabel;
    // End of variables declaration//GEN-END:variables
}
