package minggu6.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import minggu6.models.DosenHonorer;
import minggu6.models.DosenTetap;
import minggu6.models.Mahasiswa;
import minggu6.models.User;
import minggu6.models.UserType;
import minggu6.util.Database;

public class UserRepository {
    ArrayList<User> listUsers = new ArrayList<>();

    public void printUserData(String nama){
        Connection conn = Database.connect();
        String sql = "SELECT \"user\".* , mahasiswa.*, dosen.*, dosenTetap.*, dosenHonorer.* FROM \"user\"  LEFT JOIN Mahasiswa ON \"user\".id = mahasiswa.mahasiswaId LEFT JOIN Dosen ON \"user\".id = dosen.dosenId LEFT JOIN DosenTetap ON \"user\".id = dosenTetap.dosenTetapId LEFT JOIN DosenHonorer ON \"user\".id = dosenHonorer.dosenHonorerId WHERE nama = ?";
        try{

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nama);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                if(rs.getString("UserType").equalsIgnoreCase("Mahasiswa")){
                    listUsers.add(new Mahasiswa(rs.getInt("id"),rs.getString("nim"),rs.getString("kodeJurusan"),rs.getString("nama"),rs.getString("tempatLahir"),rs.getString("tanggalLahir"),rs.getString("alamat"),rs.getString("telepon")));
                }
                else if(rs.getString("UserType").equalsIgnoreCase("DosenTetap")){
                    listUsers.add(new DosenTetap(rs.getInt("id"),rs.getString("nik"),rs.getString("nama"),rs.getString("tempatLahir"),rs.getString("tanggalLahir"),rs.getString("alamat"),rs.getString("telepon"),rs.getString("departemen"),rs.getDouble("gajiPokok")));
                }
                else if(rs.getString("UserType").equalsIgnoreCase("DosenHonorer")){
                    listUsers.add(new DosenHonorer(rs.getInt("id"),rs.getString("nik"),rs.getString("nama"),rs.getString("tempatLahir"),rs.getString("tanggalLahir"),rs.getString("alamat"),rs.getString("telepon"),rs.getString("departemen"),rs.getDouble("honorPerSks")));
                }
            }
            } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public ArrayList<User> getListUsers() {
        return listUsers;
    }
}

