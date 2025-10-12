package minggu6.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import minggu6.util.Database;

public class MahasiswaRepository {
    public void add(String nama, String nim, String KodeJurusan, String tempatLahir, String tanggalLahir, String alamat, String telepon) {
        Connection conn = Database.connect();
        String sql = "INSERT INTO mahasiswa(nama, nim, kode_jurusan, tempat_lahir, tanggal_lahir, alamat, telepon) VALUES(?,?,?,?,?,?,?)";
        try{
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nama);
            pstmt.setString(2, nim);
            pstmt.setString(3, KodeJurusan);
            pstmt.setString(4, tempatLahir);
            pstmt.setString(5, tanggalLahir);
            pstmt.setString(6, alamat);
            pstmt.setString(7, telepon);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
