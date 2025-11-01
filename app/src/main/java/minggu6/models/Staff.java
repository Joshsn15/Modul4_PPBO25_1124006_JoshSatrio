package minggu6.models;

public class Staff extends User {
    private String nik;
    public Staff(int id, String nik,String nama, String tempatLahir, String tanggalLahir, String alamat, String telepon) {
        super(id, UserType.STAFF,nama, tempatLahir, tanggalLahir, alamat, telepon);
        this.nik = nik;
    }
    public String getNik() {
        return nik;
    }
    @Override
    public String toString(){
        return "NIK: " + nik + 
                "\nNama: " + getNama() +
                "\nTempat Tanggal Lahir: " + getTempatTanggalLahir() +
                "\nAlamat: " + getAlamat() +
                "\nTelepon: " + getTelepon();
    } 
    
}
