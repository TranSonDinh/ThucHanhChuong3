
package Bai_2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormHoaDon extends javax.swing.JFrame {

    private DefaultTableModel tableModel = new DefaultTableModel();
    Bai_2.DataConnection data = new Bai_2.DataConnection();
    Connection c;
    public FormHoaDon() throws SQLException {
        initComponents();
        getData();
    }
    public void getData() throws SQLException{
        c = data.getConnection();
        Statement stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM qlbanhang.hoa_don;");
        String []colsName = {"Mã hóa đơn", "Mã nhân viên", "Loại hóa đơn", "Ngày lập hóa đơn", "Ngày giao nhận", "Diễn giải"};
        tableModel.setColumnIdentifiers(colsName);  
        jTable1.setModel(tableModel);
        int rowCount = jTable1.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
        try {
            while(rs.next()){ 
                String rows[] = new String[6];
                rows[0] = rs.getString(1); 
                rows[1] = rs.getString(2);
                if(rs.getString(3).equals("0"))
                    rows[2] = "Nhập";
                else if(rs.getString(3).equals("1"))
                    rows[2] = "Xuất";
                else if(rs.getString(3).equals("2"))
                    rows[2] = "Chuyển";
                else if(rs.getString(3).equals("3"))
                    rows[2] = "Trả";
                rows[3] = rs.getString(4); 
                rows[4] = rs.getString(5);
                rows[5] = rs.getString(6); 
                tableModel.addRow(rows); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfMaHoaDon = new javax.swing.JTextField();
        tfMaNV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfNamLap = new javax.swing.JTextField();
        tfThangLap = new javax.swing.JTextField();
        tfNgayLap = new javax.swing.JTextField();
        tfNamNhan = new javax.swing.JTextField();
        tfThangNhan = new javax.swing.JTextField();
        tfNgayNhan = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDienGiai = new javax.swing.JTextArea();
        cbLoai = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Quản lý hóa đơn");

        jLabel3.setText("Mã nhân viên lập : ");

        jLabel2.setText("Mã hóa đơn : ");

        jLabel6.setText("Ngày lập hóa đơn : ");

        jLabel7.setText("Ngày giao nhận : ");

        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setText("Loại hóa đơn : ");

        jLabel8.setText("Diễn giải : ");

        tfNamLap.setToolTipText("Năm");

        tfThangLap.setToolTipText("Tháng");

        tfNgayLap.setToolTipText("Ngày");

        tfNamNhan.setToolTipText("Năm");

        tfThangNhan.setToolTipText("Tháng");

        tfNgayNhan.setToolTipText("Ngày");

        taDienGiai.setColumns(20);
        taDienGiai.setRows(5);
        jScrollPane2.setViewportView(taDienGiai);

        cbLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhập", "Xuất", "Chuyển", "Trả" }));

        jButton4.setText("Thoát");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(273, 273, 273))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfMaHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(tfMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(cbLoai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tfNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfThangLap, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(tfNamLap, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tfNgayNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfThangNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(tfNamNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfThangLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNamLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tfNgayNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfThangNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNamNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        c = data.getConnection();
        Statement stmt;
        String MaHoaDon = tfMaHoaDon.getText();

        try {
            stmt = c.createStatement();
            stmt.executeUpdate("Delete from qlbanhang.hoa_don where MaHoaDon = '" + MaHoaDon + "'");
            JOptionPane.showMessageDialog(rootPane, "Xóa thành công !");
            getData();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Lỗi ! Xóa thất bại.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        c = data.getConnection();
        Statement stmt;
        String MaHoaDon = tfMaHoaDon.getText();
        String MaNV = tfMaNV.getText();
        int LoaiHoaDonIndex = cbLoai.getSelectedIndex();
        String NgayLap = tfNgayLap.getText();
        String ThangLap = tfThangLap.getText();
        String NamLap = tfNamLap.getText();
        String Lap = NamLap + "-" + ThangLap + "-" + NgayLap;
        String NgayNhan = tfNgayNhan.getText();
        String ThangNhan = tfThangNhan.getText();
        String NamNhan = tfNamNhan.getText();
        String Nhan = NamNhan + "-" + ThangNhan + "-" + NgayNhan;
        String DienGiai = taDienGiai.getText();
        try {
            stmt = c.createStatement();
            stmt.executeUpdate("UPDATE qlbanhang.hoa_don"
                + " set MaNV = '" + MaNV + "',LoaiHoaDon = '" + LoaiHoaDonIndex + "', NgayLapHoaDon = '" + Lap + "', NgayGiaoNhan = '" + Nhan + "', DienGiai = '" +  DienGiai +"'"
                + " where MaHoaDon = '" + MaHoaDon + "'");
            JOptionPane.showMessageDialog(rootPane, "Sửa thành công !");
            getData();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Lỗi ! Sửa thất bại.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        c = data.getConnection();
        Statement stmt;
        String MaHoaDon = tfMaHoaDon.getText();
        String MaNV = tfMaNV.getText();
        int LoaiHoaDonIndex = cbLoai.getSelectedIndex();
        String NgayLap = tfNgayLap.getText();
        String ThangLap = tfThangLap.getText();
        String NamLap = tfNamLap.getText();
        String Lap = NamLap + "-" + ThangLap + "-" + NgayLap;
        String NgayNhan = tfNgayNhan.getText();
        String ThangNhan = tfThangNhan.getText();
        String NamNhan = tfNamNhan.getText();
        String Nhan = NamNhan + "-" + ThangNhan + "-" + NgayNhan;
        String DienGiai = taDienGiai.getText();
        try {
            stmt = c.createStatement();
            stmt.executeUpdate("INSERT INTO qlbanhang.hoa_don(MaHoaDon, MaNV, LoaiHoaDon, NgayLapHoaDon, NgayGiaoNhan, DienGiai) "
                + "VALUES('" + MaHoaDon + "','" + MaNV + "'," + LoaiHoaDonIndex + ",'" + Lap + "','" + Nhan + "','" + DienGiai + "')");
            JOptionPane.showMessageDialog(rootPane, "Thêm thành công !");
            getData();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Lỗi ! Thêm thất bại.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        clickTable();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            FormMain main = new FormMain();
            main.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(FormSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    private void clickTable() {

            int Row = jTable1.getSelectedRow();
            
            String MaHoaDon = (String) jTable1.getValueAt(Row, 0);
            tfMaHoaDon.setText(MaHoaDon);
            String MaNV = (String) jTable1.getValueAt(Row, 1);
            tfMaNV.setText(MaNV);
            String LoaiHoaDon = (String) jTable1.getValueAt(Row, 2);
            if(LoaiHoaDon.equals("Nhập"))
                cbLoai.setSelectedIndex(0);
            else if(LoaiHoaDon.equals("Xuất"))
                cbLoai.setSelectedIndex(1);
            else if(LoaiHoaDon.equals("Chuyển"))
                cbLoai.setSelectedIndex(2);
            else if(LoaiHoaDon.equals("Trả"))
                cbLoai.setSelectedIndex(3);
            String NgayLap = (String) jTable1.getValueAt(Row, 3);
            String[] NgayLaps = NgayLap.split("-");
            tfNgayLap.setText(NgayLaps[2]);
            tfThangLap.setText(NgayLaps[1]);
            tfNamLap.setText(NgayLaps[0]);
            String NgayNhan = (String) jTable1.getValueAt(Row, 4);
            String[] NgayNhans = NgayNhan.split("-");
            tfNgayNhan.setText(NgayNhans[2]);
            tfThangNhan.setText(NgayNhans[1]);
            tfNamNhan.setText(NgayNhans[0]);
            String DienGiai = (String) jTable1.getValueAt(Row, 5);
            taDienGiai.setText(DienGiai);
            
}

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormHoaDon().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FormHoaDon.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbLoai;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea taDienGiai;
    private javax.swing.JTextField tfMaHoaDon;
    private javax.swing.JTextField tfMaNV;
    private javax.swing.JTextField tfNamLap;
    private javax.swing.JTextField tfNamNhan;
    private javax.swing.JTextField tfNgayLap;
    private javax.swing.JTextField tfNgayNhan;
    private javax.swing.JTextField tfThangLap;
    private javax.swing.JTextField tfThangNhan;
    // End of variables declaration//GEN-END:variables
}
