package minggu6.models;

public class DosenHonorer extends Dosen {
    private double HonorPerSks;
    public DosenHonorer(String nik, String nama, String tempatLahir, String tanggalLahir, String alamat, String telepon, String departemen, double HonorPerSks) {
        super(nik, nama, tempatLahir, tanggalLahir, alamat, telepon, departemen);
        this.HonorPerSks = HonorPerSks;
    }
    @Override
    public String toString() {
        return "Honor per SKS: " + HonorPerSks;
    }

    public double getHonorPerSks() {
        return HonorPerSks;
    }
    public void setHonorPerSks(double honorPerSks) {
        HonorPerSks = honorPerSks;
    }
}
