
package Bai_2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NhanVien {
    public static String HienThi() throws SQLException {
        Bai_2.DataConnection data = new Bai_2.DataConnection();
        Connection c = data.getConnection();
        String s = "";
        Statement stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM qlbanhang.nhan_vien;");
//        while(rs.next()){
//            s += "Mã sản phẩm : " + rs.getString("MaSP") + "\n";
//            s += "Tên sản phẩm : " + rs.getString("TenSP") + "\n";
//            s += "Nhà sản xuất : " + rs.getString("NhaSanXuat") + "\n";
//            s += "Mã loại : " + rs.getString("MaLoaiSP") + "\n";
//            s += "-----------------\n";
//        }
//        
        return s;
    }
}
