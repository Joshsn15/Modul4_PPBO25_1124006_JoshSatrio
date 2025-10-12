package minggu6.models;

public class DosenTetap extends Dosen {
    private double gajiPokok;
    public DosenTetap(String nik, String nama, String tempatLahir, String tanggalLahir, String alamat, String telepon, String departemen, double gajiPokok) {
        super(nik, nama, tempatLahir, tanggalLahir, alamat, telepon, departemen);
        this.gajiPokok = gajiPokok;
    }
    @Override
    public String toString() {
        return  "gajiPokok=" + gajiPokok;
    }
    
    public double getGajiPokok() {
        return gajiPokok;
    }
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
}
