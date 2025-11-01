package minggu6.models;

public class Doktor extends Mahasiswa {
    private String judulDisertasi;
    private double n1,n2,n3;
    public Doktor(int id, String nim, String Kodejurusan, String nama, String tempatLahir, String tanggalLahir, String alamat, String telepon, String judulDisertasi) {
        super(id, nim, Kodejurusan, nama, tempatLahir, tanggalLahir, alamat, telepon);
        this.judulDisertasi = judulDisertasi;
        this.n1 = 0;
        this.n2 = 0;
        this.n3 = 0; 
    }
    @Override
    public String toString() {
        return "Doktor{" +
                "judulDisertasi='" + judulDisertasi + '\'' +
                ", n1=" + n1 +
                ", n2=" + n2 +
                ", n3=" + n3 +
                '}';
    }
    public String getJudulDisertasi() {
        return judulDisertasi;
    }
    public void setJudulDisertasi(String judulDisertasi) {
        this.judulDisertasi = judulDisertasi;
    }
}
