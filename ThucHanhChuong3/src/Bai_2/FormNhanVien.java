
package Bai_2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class FormNhanVien extends javax.swing.JFrame {

    private DefaultTableModel tableModel = new DefaultTableModel();
    Bai_2.DataConnection data = new Bai_2.DataConnection();
    Connection c;
    public FormNhanVien() throws SQLException {
        initComponents();
        getData();
    }
    public void getData() throws SQLException{
        c = data.getConnection();
        Statement stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM qlbanhang.nhan_vien;");
        String []colsName = {"Mã nhân viên", "Tên nhân viên", "Giới tính", "Ngày sinh", "Địa chỉ", "Số điện thoại"};
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
                    rows[2] = "Nam";
                else rows[2] = "Nữ";
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfMaNV = new javax.swing.JTextField();
        tfTenNV = new javax.swing.JTextField();
        tfDiaChi = new javax.swing.JTextField();
        tfSDT = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        rbNam = new javax.swing.JRadioButton();
        rbNu = new javax.swing.JRadioButton();
        tfNgay = new javax.swing.JTextField();
        tfThang = new javax.swing.JTextField();
        tfNam = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Quản lý nhân viên");

        jLabel2.setText("Mã nhân viên : ");

        jLabel3.setText("Tên nhân viên :");

        jLabel4.setText("Giới tính :");

        jLabel5.setText("Ngày sinh : ");

        jLabel6.setText("Địa chỉ :");

        jLabel7.setText("Số điện thoại :");

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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

        buttonGroup1.add(rbNam);
        rbNam.setSelected(true);
        rbNam.setText("Nam");
        rbNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNamActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbNu);
        rbNu.setText("Nữ");

        tfNgay.setToolTipText("Ngày");

        tfThang.setToolTipText("Tháng");

        tfNam.setToolTipText("Năm");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbNam, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rbNu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(tfNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfThang, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(tfNam, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(266, 266, 266))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(tfMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(tfTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(tfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbNam)
                    .addComponent(rbNu))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        c = data.getConnection();
        Statement stmt;
        String MaNV = tfMaNV.getText();
        String TenNV = tfTenNV.getText();
        String GioiTinh ;
        if(rbNam.isSelected())
            GioiTinh = "0";
        else GioiTinh = "1";
        String Ngay = tfNgay.getText().toString();
        String Thang = tfThang.getText().toString();
        String Nam = tfNam.getText().toString();
        String NgaySinh = Nam + "-" + Thang + "-" + Ngay;
        String DiaChi = tfDiaChi.getText();
        String SoDienThoai = tfSDT.getText();
        try {
            stmt = c.createStatement();
            stmt.executeUpdate("INSERT INTO qlbanhang.nhan_vien(MaNV, HoTen, GioiTinh, NgaySinh, DiaChi, SoDienThoai ) "
                    + "VALUES('" + MaNV + "','" + TenNV + "',b'" + GioiTinh + "','" + NgaySinh + "','"+ DiaChi + "','"+ SoDienThoai + "')");
            JOptionPane.showMessageDialog(rootPane, "Thêm thành công !");
            getData();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Lỗi ! Thêm thất bại.");
            Logger.getLogger(FormNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void rbNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNamActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        c = data.getConnection();
        Statement stmt;
        String MaNV = tfMaNV.getText();
        String TenNV = tfTenNV.getText();
        String GioiTinh ;
        if(rbNam.isSelected())
            GioiTinh = "0";
        else GioiTinh = "1";
        String Ngay = tfNgay.getText().toString();
        String Thang = tfThang.getText().toString();
        String Nam = tfNam.getText().toString();
        String NgaySinh = Nam + "-" + Thang + "-" + Ngay;
        String DiaChi = tfDiaChi.getText();
        String SoDienThoai = tfSDT.getText();
        try {
            stmt = c.createStatement();
            stmt.executeUpdate("UPDATE qlbanhang.nhan_vien"
                    + " set HoTen ='" + TenNV + "',GioiTinh = b'" + GioiTinh + "',NgaySinh ='" + NgaySinh + "',DiaChi ='"+ DiaChi + "',SoDienThoai ="+ SoDienThoai + ""
                            + " where MaNV = '" + MaNV + "'");
            JOptionPane.showMessageDialog(rootPane, "Sửa thành công !");
            getData();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Lỗi ! Sửa thất bại.");
            Logger.getLogger(FormNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        c = data.getConnection();
        Statement stmt;
        String MaNV = tfMaNV.getText();
       
        try {
            stmt = c.createStatement();
            stmt.executeUpdate("Delete from qlbanhang.nhan_vien where MaNV = '" + MaNV + "'");
            JOptionPane.showMessageDialog(rootPane, "Xóa thành công !");
            getData();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Lỗi ! Xóa thất bại.");
            Logger.getLogger(FormNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        clickTable();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            FormMain main = new FormMain();
            main.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(FormNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    private void clickTable() {

            int Row = jTable1.getSelectedRow();
            String MaNV = (String) jTable1.getValueAt(Row, 0);
            String HoTen = (String) jTable1.getValueAt(Row, 1);
            String GioiTinh = (String) jTable1.getValueAt(Row, 2);
            String NgaySinh = (String) jTable1.getValueAt(Row, 3);
            String DiaChi = (String) jTable1.getValueAt(Row, 4);
            String SoDienThoai = (String) jTable1.getValueAt(Row, 5);
            String[] date = NgaySinh.split("-");
            if(GioiTinh.equals("Nam"))
            {
                rbNam.setSelected(true);
                rbNu.setSelected(false);
            }else
            {
                rbNam.setSelected(false);
                rbNu.setSelected(true);
            }
            tfNgay.setText(date[2]);
            tfThang.setText(date[1]);
            tfNam.setText(date[0]);
            tfMaNV.setText(MaNV);
            tfTenNV.setText(HoTen);
            tfDiaChi.setText(DiaChi);
            tfSDT.setText(SoDienThoai);
            
}
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
            java.util.logging.Logger.getLogger(FormNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormNhanVien().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FormNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbNam;
    private javax.swing.JRadioButton rbNu;
    private javax.swing.JTextField tfDiaChi;
    private javax.swing.JTextField tfMaNV;
    private javax.swing.JTextField tfNam;
    private javax.swing.JTextField tfNgay;
    private javax.swing.JTextField tfSDT;
    private javax.swing.JTextField tfTenNV;
    private javax.swing.JTextField tfThang;
    // End of variables declaration//GEN-END:variables
}
