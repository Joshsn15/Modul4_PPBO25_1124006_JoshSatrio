package minggu6.models;

public class Mahasiswa extends User {
    private String nim;
    private String Kodejurusan;
    public Mahasiswa(String nim,String Kodejurusan,String nama, String tempatLahir, String tanggalLahir, String alamat, String telepon) {
        super(UserType.MAHASISWA    , nama, tempatLahir, tanggalLahir,alamat,telepon);
        this.nim = nim;
        this.Kodejurusan = Kodejurusan;

    }
    @Override
    public String toString(){
        return "NIM: " + nim + 
                "\nKode Jurusan: " + Kodejurusan +
                "\nNama: " + getNama() +
                "\nTempat Tanggal Lahir: " + getTempatTanggalLahir() +
                "\nAlamat: " + getAlamat() +
                "\nTelepon: " + getTelepon();
    }
    public String getNim() {
        return nim;
    }
    public String getKodeJurusan() {
        return Kodejurusan;
    }
    public void setKodeJurusan(String kodejurusan) {
        Kodejurusan = kodejurusan;
    }

}
