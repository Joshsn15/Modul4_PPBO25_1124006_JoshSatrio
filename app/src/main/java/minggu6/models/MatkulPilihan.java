package minggu6.models;

public class MatkulPilihan extends MataKuliah  {
    private int jumlahMinimumMahasiswa;
    public MatkulPilihan(int jumlahMinimumMahasiswa, String kode, String nama, int sks) {
        super(kode, nama, sks);
        this.jumlahMinimumMahasiswa = jumlahMinimumMahasiswa;
    }
    @Override
    public String toString() {
        return super.toString() +
                "\nJumlah Minimum Mahasiswa: " + jumlahMinimumMahasiswa;
    }
    public int getJumlahMinimumMahasiswa() {
        return jumlahMinimumMahasiswa;
    }
    public void setJumlahMinimumMahasiswa(int jumlahMinimumMahasiswa) {
        this.jumlahMinimumMahasiswa = jumlahMinimumMahasiswa;
    }

}
