
package Bai_1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HT1 {
    public static String HienThi() throws SQLException {
        DataConnection data = new DataConnection();
        Connection c = data.getConnection();
        String s = "";
        Statement stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM qlsanpham.sanpham;");
        while(rs.next()){
            s += "Mã sản phẩm : " + rs.getString("MaSP") + "\n";
            s += "Tên sản phẩm : " + rs.getString("TenSP") + "\n";
            s += "Nhà sản xuất : " + rs.getString("NhaSanXuat") + "\n";
            s += "Mã loại : " + rs.getString("MaLoaiSP") + "\n";
            s += "-----------------\n";
        }
        
        return s;
    }
    public static void ThemLoaiSP(String MaLoai, String TenLoai) throws SQLException {
        DataConnection data = new DataConnection();
        Connection c = data.getConnection();
        String s = "";
        Statement stmt = c.createStatement();
        
        try {
            stmt.executeUpdate("INSERT INTO qlsanpham.loaisanpham(MaLoaiSP,TenLoaiSP) VALUES('" + MaLoai + "','"+ TenLoai + "')");
        } catch (Exception e) {
        }

    }
    public static void main(String[] args) throws SQLException {
        System.out.println(HienThi());
    }
}
