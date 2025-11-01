package minggu6.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import minggu6.models.UserType;
import minggu6.util.Database;

public class DosenRepository {
    UserType userType;
    
    public void printTotalJamMengajar(String nik){
        Connection conn = Database.connect();
        String sql = "SELECT SUM(presensiStaff.jam) AS total_jam FROM presensistaff JOIN presensi  ON presensiStaff.idpresensistaff = presensi.idpresensi JOIN dosen  ON presensiStaff.idDosen = dosen.id JOIN staff  ON dosen.staff_id = staff.id WHERE staff.nik = ? AND presensi.status = 1";
        try{
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nik);
            ResultSet resultSet = pstmt.executeQuery();
            if(resultSet.next()){
                int totalJam = resultSet.getInt("total_jam");
                System.out.println("Total Jam Mengajar: " + totalJam);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
