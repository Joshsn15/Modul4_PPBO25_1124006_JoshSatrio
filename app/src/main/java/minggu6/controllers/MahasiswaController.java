package minggu6.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import minggu6.models.Mahasiswa;
import minggu6.util.Database;

public class MahasiswaController {
    
    public void addNew(String nim, String nama, String tempatLahir, String tanggalLahir, String alamat, String telepon) {
        Connection conn = Database.connect();
        String sql = "INSERT INTO mahasiswa(nim, nama, tempat_lahir, tanggal_lahir, alamat, telepon) VALUES(?,?,?,?,?,?)";
        try{
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nim);
            pstmt.setString(2, nama);
            pstmt.setString(3, tempatLahir);
            pstmt.setString(4, tanggalLahir);
            pstmt.setString(5, alamat);
            pstmt.setString(6, telepon);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    };

    public void delete() {
    };

    public void update() {
    };

    public void print() {
    };

    public Mahasiswa[] findAll() {
        return new Mahasiswa[] {};
    };

    public Mahasiswa get(String nim) {
        return null;
    };
    
}
