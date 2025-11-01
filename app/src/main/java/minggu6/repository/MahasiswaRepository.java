package minggu6.repository;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import minggu6.models.UserType;
import minggu6.util.Database;

public class MahasiswaRepository {
    UserType userType;
    // ArrayList<NilaiBase> listNilai = new ArrayList<>();

    public void add(String nama, String nim, String KodeJurusan, String tempatLahir, String tanggalLahir, String alamat,
            String telepon) {
        Connection conn = Database.connect();
        String sql = "INSERT INTO \"user\"(nama, tempat_lahir, tanggal_lahir, alamat, telepon) VALUES(?,?,?,?,?) Returning id";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nama);
            pstmt.setString(2, tempatLahir);
            pstmt.setString(3, tanggalLahir);
            pstmt.setString(4, alamat);
            pstmt.setString(5, telepon);
            pstmt.executeUpdate();

            ResultSet rs = pstmt.executeQuery();
            int userId = 0;
            if (rs.next()) {
                userId = rs.getInt("id");
            }

            String sqlMahasiswa = "INSERT INTO mahasiswa(user_id, nim, kode_jurusan) VALUES(?,?,?)";
            PreparedStatement pstmtMhs = conn.prepareStatement(sqlMahasiswa);
            pstmtMhs.setInt(1, userId); 
            pstmtMhs.setString(2, nim);
            pstmtMhs.setString(3, KodeJurusan);
            pstmtMhs.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(String nama, String nim) {
        Connection conn = Database.connect();
        String sql = "DELETE FROM mahasiswa WHERE nama = ? AND nim = ?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nama);
            pstmt.setString(2, nim);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(String nama, String nim, String KodeJurusan, String tempatLahir, String tanggalLahir,
            String alamat, String telepon) {
        Connection conn = Database.connect();
        String sql = "UPDATE mahasiswa SET kode_jurusan = ?, tempat_lahir = ?, tanggal_lahir = ?, alamat = ?, telepon = ? WHERE nama = ? AND nim = ?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, KodeJurusan);
            pstmt.setString(2, tempatLahir);
            pstmt.setString(3, tanggalLahir);
            pstmt.setString(4, alamat);
            pstmt.setString(5, telepon);
            pstmt.setString(6, nama);
            pstmt.setString(7, nim);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void printAllMhs() {
        Connection conn = Database.connect();
        String sql = "SELECT mahasiswa.nim , \"user\".nama , mahasiswa.kode_jurusan FROM mahasiswa INNER JOIN \"user\" ON mahasiswa.user_id = \"user\".id";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("Nama: " + rs.getString("nama") +
                        ", NIM: " + rs.getString("nim"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // public void addNA(String nim, String kodeMK, UserType user, double n1, double
    // n2, double n3) {
    // Connection conn = Database.connect();
    // String sql = "INSERT INTO nilai (kodeMK, NIM, n1, n2, n3) VALUES
    // (?,?,?,?,?)";
    // try {
    // PreparedStatement pstmt = conn.prepareStatement(sql);
    // pstmt.setString(1, kodeMK);
    // pstmt.setString(2, nim);
    // pstmt.setDouble(3, n1);
    // pstmt.setDouble(4, n2);
    // pstmt.setDouble(5, n3);
    // pstmt.executeUpdate();
    // } catch (SQLException e) {
    // System.out.println(e.getMessage());
    // }
    // }

    public void printNilaiAkhir(String nim, String kodeMK) {
        Connection conn = Database.connect();
        String sql = "SELECT n1, n2, n3 FROM nilai WHERE mahasiswa_id = (SELECT id FROM mahasiswa WHERE nim = ?) AND matakuliah_id = (SELECT id FROM matakuliah WHERE kode_mk = ?)";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nim);
            pstmt.setString(2, kodeMK);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                double n1 = rs.getDouble("n1");
                double n2 = rs.getDouble("n2");
                double n3 = rs.getDouble("n3");
                double nilaiAkhir = (n1 + n2 + n3) / 3;

                System.out.println("=== Nilai Akhir ===");
                System.out.println("NIM: " + nim);
                System.out.println("Kode MK: " + kodeMK);
                System.out.println("N1: " + n1);
                System.out.println("N2: " + n2);
                System.out.println("N3: " + n3);
                System.out.println("Nilai Akhir: " + String.format("%.2f", nilaiAkhir));
            } else {
                System.out.println("Nilai tidak ditemukan untuk NIM: " + nim + " dan Kode MK: " + kodeMK);
            }

            rs.close();
            pstmt.close();

        } catch (SQLException e) {
            System.out.println("Error printNilaiAkhir: " + e.getMessage());
        }
    }

    public void printNilaiAkhirDoctor(String nim) {
        Connection conn = Database.connect();
        String sql = "SELECT nilai_sidang1, nilai_sidang2, nilai_sidang3 FROM doctor WHERE mahasiswa_id = (SELECT id FROM mahasiswa WHERE nim = ?)";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nim);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                double n1 = rs.getDouble("nilai_sidang1");
                double n2 = rs.getDouble("nilai_sidang2");
                double n3 = rs.getDouble("nilai_sidang3");
                double nilaiAkhir = (n1 + n2 + n3) / 3;

                System.out.println("=== Nilai Akhir Sidang Doctor ===");
                System.out.println("NIM: " + nim);
                System.out.println("Nilai Sidang 1: " + n1);
                System.out.println("Nilai Sidang 2: " + n2);
                System.out.println("Nilai Sidang 3: " + n3);
                System.out.println("Nilai Akhir: " + String.format("%.2f", nilaiAkhir));
            } else {
                System.out.println("Data doctor dengan NIM: " + nim + " tidak ditemukan");
            }

            rs.close();
            pstmt.close();

        } catch (SQLException e) {
            System.out.println("Error printNilaiAkhirDoctor: " + e.getMessage());
        }
    }

    public void printRataRataNilai(String kodeMK) {
        Connection conn = Database.connect();
        String sql = "SELECT AVG(n1) as avg_n1, AVG(n2) as avg_n2, AVG(n3) as avg_n3, AVG((n1+n2+n3)/3) as avg_na FROM nilai JOIN matakuliah ON nilai.matakuliah_id = matakuliah.id WHERE matakuliah.kode_mk = ?";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, kodeMK);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                double avgN1 = rs.getDouble("avg_n1");
                double avgN2 = rs.getDouble("avg_n2");
                double avgN3 = rs.getDouble("avg_n3");
                double avgNA = rs.getDouble("avg_na");

                System.out.println("=== Rata-rata Nilai Matakuliah ===");
                System.out.println("Kode MK: " + kodeMK);
                System.out.println("Rata-rata N1: " + avgN1);
                System.out.println("Rata-rata N2: " + avgN2);
                System.out.println("Rata-rata N3: " + avgN3);
                System.out.println("Rata-rata Nilai Akhir: " + Math.round(avgNA));
            } else {
                System.out.println("Tidak ada data nilai untuk Kode MK: " + kodeMK);
            }

            rs.close();
            pstmt.close();

        } catch (SQLException e) {
            System.out.println("Error printRataRataNilai: " + e.getMessage());
        }
    }

    public void printMKlulus(String kodeMK) {
        Connection conn = Database.connect();
        String sql = "SELECT COUNT(*) as jumlah_Tidak_lulus,matakuliah_id from nilai JOIN matakuliah ON nilai.matakuliah_id = matakuliah.id WHERE matakuliah.kode_mk = ? AND (n1+n2+n3)/3 < 60 GROUP BY nilai.matakuliah_id, matakuliah.kode_mk";
        String sql2 = "SELECT COUNT(*) as jumlah_lulus,matakuliah_id from nilai JOIN matakuliah ON nilai.matakuliah_id = matakuliah.id WHERE matakuliah.kode_mk = ? GROUP BY nilai.matakuliah_id, matakuliah.kode_mk";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            PreparedStatement pstmt2 = conn.prepareStatement(sql2);
            pstmt.setString(1, kodeMK);
            pstmt2.setString(1, kodeMK);
            ResultSet rs = pstmt.executeQuery();
            ResultSet rs2 = pstmt2.executeQuery();
            int tidakLulus = 0;
            int lulus = 0;
            if (rs.next()) {
                tidakLulus = rs.getInt("jumlah_Tidak_lulus");
            }

            if (rs2.next()) {
                lulus = rs2.getInt("jumlah_lulus");
            }

            System.out.println("<" + tidakLulus + "> dari <" + lulus + "> mahasiswa tidak lulus mataKuliah");
        } catch (SQLException e) {
            System.out.println("Error di printMKlulus: " + e.getMessage());
        }
    }

    public void printMKTotalPresensi(String nim,String matkulAmbil){
        String sql = "SELECT COUNT(*) as total_presensi FROM presensi JOIN presensiMhs ON presensi.idpresensi = presensiMhs.idpresensimhs JOIN matkulAmbil ON presensiMhs.idMatkulAmbil = matkulAmbil.matakuliah_id JOIN mahasiswa ON presensiMhs.idmhs = mahasiswa.id JOIN matakuliah ON matakuliah.id = matkulAmbil.matakuliah_id WHERE mahasiswa.nim = ? AND matakuliah.kodeMK = ?";
        Connection conn = Database.connect();
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nim);
            pstmt.setString(2, matkulAmbil);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                int totalPresensi = rs.getInt("total_presensi");
                System.out.println("Total Presensi untuk NIM " + nim + " pada mata kuliah " + matkulAmbil + " adalah: " + totalPresensi);
            } else {
                System.out.println("Data presensi tidak ditemukan untuk NIM " + nim + " pada mata kuliah " + matkulAmbil);
            }
        } catch (SQLException e) {
            System.out.println("Error di mahasiswaRepository function printMKTotalPresensi: " + e.getMessage());
        }
    }
}