package minggu6.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import minggu6.util.Database;

public class StaffRepository {

    /**
     * Add Dosen Tetap
     */
    public void addDosenTetap(String nama, String nik, String departemen, double gajiPokok,
            String tempatLahir, String tanggalLahir, String alamat, String telepon) {
        Connection conn = Database.connect();
        try {
            // Insert ke user dulu
            String sqlUser = "INSERT INTO \"user\"(nama, tempat_lahir, tanggal_lahir, alamat, telepon) VALUES(?,?,?,?,?) RETURNING id";
            PreparedStatement pstmtUser = conn.prepareStatement(sqlUser);
            pstmtUser.setString(1, nama);
            pstmtUser.setString(2, tempatLahir);
            pstmtUser.setString(3, tanggalLahir);
            pstmtUser.setString(4, alamat);
            pstmtUser.setString(5, telepon);

            ResultSet rs = pstmtUser.executeQuery();
            int userId = 0;
            if (rs.next()) {
                userId = rs.getInt("id");
            }
            rs.close();
            pstmtUser.close();

            // Insert ke dosen_tetap
            String sqlDosen = "INSERT INTO dosen_tetap(user_id, nik, departemen, gaji_pokok) VALUES(?,?,?,?)";
            PreparedStatement pstmtDosen = conn.prepareStatement(sqlDosen);
            pstmtDosen.setInt(1, userId);
            pstmtDosen.setString(2, nik);
            pstmtDosen.setString(3, departemen);
            pstmtDosen.setDouble(4, gajiPokok);
            pstmtDosen.executeUpdate();
            pstmtDosen.close();

            System.out.println("Dosen Tetap berhasil ditambahkan!");

        } catch (SQLException e) {
            System.out.println("Error addDosenTetap: " + e.getMessage());
        }
    }

    /**
     * Add Dosen Honorer
     */
    public void addDosenHonorer(String nama, String nik, String departemen, double honorPerSks,
            String tempatLahir, String tanggalLahir, String alamat, String telepon) {
        Connection conn = Database.connect();
        try {
            String sqlUser = "INSERT INTO \"user\"(nama, tempat_lahir, tanggal_lahir, alamat, telepon) VALUES(?,?,?,?,?) RETURNING id";
            PreparedStatement pstmtUser = conn.prepareStatement(sqlUser);
            pstmtUser.setString(1, nama);
            pstmtUser.setString(2, tempatLahir);
            pstmtUser.setString(3, tanggalLahir);
            pstmtUser.setString(4, alamat);
            pstmtUser.setString(5, telepon);

            ResultSet rs = pstmtUser.executeQuery();
            int userId = 0;
            if (rs.next()) {
                userId = rs.getInt("id");
            }
            rs.close();
            pstmtUser.close();

            String sqlDosen = "INSERT INTO dosen_honorer(user_id, nik, departemen, honor_per_sks) VALUES(?,?,?,?)";
            PreparedStatement pstmtDosen = conn.prepareStatement(sqlDosen);
            pstmtDosen.setInt(1, userId);
            pstmtDosen.setString(2, nik);
            pstmtDosen.setString(3, departemen);
            pstmtDosen.setDouble(4, honorPerSks);
            pstmtDosen.executeUpdate();
            pstmtDosen.close();

            System.out.println("Dosen Honorer berhasil ditambahkan!");

        } catch (SQLException e) {
            System.out.println("Error addDosenHonorer: " + e.getMessage());
        }
    }

    /**
     * Add Karyawan
     */
    public void addKaryawan(String nama, String nik, double salary,
                            String tempatLahir, String tanggalLahir, String alamat, String telepon) {
        Connection conn = Database.connect();
        try {
            String sqlUser = "INSERT INTO \"user\"(nama, tempat_lahir, tanggal_lahir, alamat, telepon) VALUES(?,?,?,?,?) RETURNING id";
            PreparedStatement pstmtUser = conn.prepareStatement(sqlUser);
            pstmtUser.setString(1, nama);
            pstmtUser.setString(2, tempatLahir);
            pstmtUser.setString(3, tanggalLahir);
            pstmtUser.setString(4, alamat);
            pstmtUser.setString(5, telepon);
            
            ResultSet rs = pstmtUser.executeQuery();
            int userId = 0;
            if (rs.next()) {
                userId = rs.getInt("id");
            }
            rs.close();
            pstmtUser.close();
            
            String sqlKaryawan = "INSERT INTO karyawan(user_id, nik, salary) VALUES(?,?,?)";
            PreparedStatement pstmtKaryawan = conn.prepareStatement(sqlKaryawan);
            pstmtKaryawan.setInt(1, userId);
        }
        catch (SQLException e) {
            System.out.println("Error addKaryawan: " + e.getMessage());
        }
    }
}