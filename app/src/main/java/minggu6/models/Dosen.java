package minggu6.models;

import java.util.ArrayList;
import java.util.List;

public class Dosen extends Staff {
    private String departemen;
    List<MatkulAjar> matkulAjar ;
    public Dosen(String nik, String nama, String tempatLahir, String tanggalLahir, String alamat, String telepon, String departemen) {
        super(nik, nama, tempatLahir, tanggalLahir, alamat, telepon);
        this.departemen = departemen;
        matkulAjar = new ArrayList<>();
    }
    @Override
    public String toString(){
        return "NIK: " + getNik() + 
                "\nDepartemen: " + departemen +
                "\nNama: " + getNama() +
                "\nTempat Tanggal Lahir: " + getTempatTanggalLahir() +
                "\nAlamat: " + getAlamat() +
                "\nTelepon: " + getTelepon();
    }

    public String getDepartemen() {
        return departemen;
    }
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

}
