/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectakhirpemvis;

import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO V13 HENDRIK
 */
public class CagarBudaya extends javax.swing.JFrame {

    /**
     * Creates new form CRUD
     */
    public CagarBudaya() {
        initComponents();
        loadTable();
        
    }

    private void loadTable() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Kode Pengelolaan");
        model.addColumn("Nama Objek");
        model.addColumn("Kategori");
        model.addColumn("Kota atau Kabupaten");
        model.addColumn("Provinsi");

        try {
            String sql = "SELECT * FROM cagarbudaya";
            java.sql.Connection conn = (Connection) koneksi.getKoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery();

            int no = 1;
            while (rs.next()) {
                model.addRow(new Object[]{
                    no++,
                    rs.getString("Kode_Pengelolaan"),
                    rs.getString("Nama_Objek"),
                    rs.getString("Kategori"),
                    rs.getString("Kota_Kab"),
                    rs.getString("Provinsi")
                });
            }

            jTable1.setModel(model); // Mengatur model ke tabel
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        kodepengelolaan2 = new javax.swing.JTextField();
        namaobjek2 = new javax.swing.JTextField();
        kategori2 = new javax.swing.JTextField();
        kota2 = new javax.swing.JTextField();
        provinsi2 = new javax.swing.JTextField();
        btnkirim2 = new javax.swing.JButton();
        btnreset2 = new javax.swing.JButton();
        btnedit2 = new javax.swing.JButton();
        btnhapus2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cari = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(0, 153, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setForeground(new java.awt.Color(0, 0, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Pengelolaan", "Nama Object", "Kategori", "Kota atau Kabupaten", "Provinsi"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        jLabel5.setText("KATEGORI CAGAR BUDAYA");

        jLabel6.setFont(new java.awt.Font("Rage Italic", 1, 40)); // NOI18N
        jLabel6.setText("KEBUDAYAAN");

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenov\\Downloads\\doodle.png")); // NOI18N

        jLabel8.setFont(new java.awt.Font("Rage Italic", 1, 40)); // NOI18N
        jLabel8.setText("INDONESIA");

        jButton1.setText("BERANDA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(86, 86, 86)
                                .addComponent(jLabel7)
                                .addGap(83, 83, 83)
                                .addComponent(jLabel8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(373, 373, 373)
                                .addComponent(jLabel5)
                                .addGap(325, 325, 325))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(626, 626, 626)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel6))
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Kategori Cagar Budaya", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        provinsi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provinsi2ActionPerformed(evt);
            }
        });

        btnkirim2.setText("Kirim");
        btnkirim2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkirim2ActionPerformed(evt);
            }
        });

        btnreset2.setText("Reset");
        btnreset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset2ActionPerformed(evt);
            }
        });

        btnedit2.setText("Edit");
        btnedit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnedit2ActionPerformed(evt);
            }
        });

        btnhapus2.setText("Hapus");
        btnhapus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapus2ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Kode Pengelolaan");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Nama Object");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Kategori");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Kota/Kab");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Provinsi");

        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel18.setText("Beritahu Yang Lain Cagar Budaya Yang Ada Di Indonesia");

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenov\\Downloads\\cagar-removebg-preview.png")); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenov\\Downloads\\cagar-removebg-preview.png")); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenov\\Downloads\\wonderful-removebg-preview (1).png")); // NOI18N

        cari.setText("CARI");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Nb: Jika Anda Ingin Melakukan Perubahan Atau Ingin Mencari Mohon Untuk Mengisi Kode Terlebih Dahulu!!! ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel17)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(btnkirim2)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(kodepengelolaan2)
                                                .addComponent(namaobjek2)
                                                .addComponent(kategori2)
                                                .addComponent(kota2)
                                                .addComponent(provinsi2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(btnhapus2)
                                                .addGap(65, 65, 65)
                                                .addComponent(btnreset2)
                                                .addGap(63, 63, 63)
                                                .addComponent(btnedit2)
                                                .addGap(46, 46, 46)
                                                .addComponent(cari)))))
                                .addGap(95, 95, 95))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(281, 281, 281)))
                        .addComponent(jLabel10)
                        .addGap(97, 97, 97))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(kodepengelolaan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(namaobjek2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(kategori2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(kota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(provinsi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnhapus2)
                            .addComponent(btnreset2)
                            .addComponent(btnedit2)
                            .addComponent(btnkirim2)
                            .addComponent(cari))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(245, 245, 245))))
        );

        jTabbedPane1.addTab("Tambahkan Data Cagar Budaya", jPanel3);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void provinsi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provinsi2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provinsi2ActionPerformed

    private void btnreset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnreset2ActionPerformed

    private void btnedit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnedit2ActionPerformed
        // TODO add your handling code here:
        try {
            int confirm = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menyimpan perubahan data ini?", "Konfirmasi Perubahan", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                String sql = "UPDATE cagarbudaya SET kode_pengelolaan = ?, nama_objek = ?, kategori = ?, kota_kab = ?, provinsi = ? WHERE id = ?";
                java.sql.Connection conn = (Connection) koneksi.getKoneksi();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);

                
                pst.setString(1, namaobjek2.getText());
                pst.setString(2, kategori2.getText());
                pst.setString(3, kota2.getText());
                pst.setString(4, provinsi2.getText());
                pst.setString(5, kodepengelolaan2.getText());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate");
                
                load_data(); 
                kosong();   
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnedit2ActionPerformed

    private void btnkirim2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkirim2ActionPerformed
        // TODO add your handling code here:
        try {
            String sql;
            sql = "insert into cagarbudaya values ('" + kodepengelolaan2.getText() + "','" + namaobjek2.getText() + "','"+kategori2.getText() +"','"+kota2.getText() +"','"+provinsi2.getText() + "')";
            java.sql.Connection conn = (Connection) koneksi.getKoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            
            
            load_data();
            kosong();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnkirim2ActionPerformed

    private void btnhapus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapus2ActionPerformed
        // TODO add your handling code here:
        try {
            String kode = kodepengelolaan2.getText();

            if (kode.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ID belum dipilih. Silakan pilih data terlebih dahulu.");
            } else {
                int confirm = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Penghapusan", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    String sql = "DELETE FROM cagarbudaya WHERE kode_pengelolaan = ?";
                    java.sql.Connection conn = (Connection) koneksi.getKoneksi();
                    java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                    pst.setString(1, kode);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                    
                    load_data();
                    kosong();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }                                         
    private void kosong(){
        
        kodepengelolaan2.setText("");
        namaobjek2.setText("");
        kategori2.setText("");
        kota2.setText("");
        provinsi2.setText("");
    }
    private void load_data(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Kode Pengelolaan");
        model.addColumn("Nama Objek");
        model.addColumn("Kategori");
        model.addColumn("Kota");
        model.addColumn("Provinsi");
        
      try {
            int no =1;
            String sql ="SELECT * FROM cagarbudaya";
            java.sql.Connection conn = (Connection) koneksi.getKoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while (res.next()){
                model.addRow(
                        new Object[]{
                            no++,
                            res.getString("kode_pengelolaan"),
                            res.getString("nama_objek"),
                            res.getString("kategori"),
                            res.getString("kota_kab"),
                            res.getString("provinsi"),
                        }
                );
                jTable1.setModel(model);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnhapus2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Beranda beranda = new Beranda();
        beranda.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
        try {
            load_data(); 
            String sql = "SELECT * FROM cagarbudaya WHERE kode_pengelolaan = ?";
            java.sql.Connection conn = (Connection) koneksi.getKoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, kodepengelolaan2.getText());
            java.sql.ResultSet res = pst.executeQuery();

            if (res.next()) {
//                kodepengelolaan2.setText(res.getString("Kode Pengelolaan"));
                namaobjek2.setText(res.getString("nama_objek"));
                kategori2.setText(res.getString("kategori"));
                kota2.setText(res.getString("kota_kab"));
                provinsi2.setText(res.getString("provinsi"));
            } else {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_cariActionPerformed

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
            java.util.logging.Logger.getLogger(CagarBudaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CagarBudaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CagarBudaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CagarBudaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CagarBudaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnedit2;
    private javax.swing.JButton btnhapus2;
    private javax.swing.JButton btnkirim2;
    private javax.swing.JButton btnreset2;
    private javax.swing.JButton cari;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField kategori2;
    private javax.swing.JTextField kodepengelolaan2;
    private javax.swing.JTextField kota2;
    private javax.swing.JTextField namaobjek2;
    private javax.swing.JTextField provinsi2;
    // End of variables declaration//GEN-END:variables
}
