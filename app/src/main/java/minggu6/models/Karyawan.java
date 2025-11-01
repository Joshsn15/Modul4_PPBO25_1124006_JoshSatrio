package minggu6.models;

public class Karyawan extends Staff {
    private String gaji;
    private PresensiStaff presensiStaff;

    public Karyawan(int id, String gaji, String nik, String nama, String tempatLahir, String tanggalLahir, String alamat,
            String telepon) {
        super(id, nik, nama, tempatLahir, tanggalLahir, alamat, telepon);
        this.gaji = gaji;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nGaji: " + gaji +
                "\nPresensi Staff: " + presensiStaff;
    }

    public String getGaji() {
        return gaji;
    }

    public void setGaji(String gaji) {
        this.gaji = gaji;
    }

}
