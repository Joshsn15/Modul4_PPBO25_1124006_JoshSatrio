package minggu6.models;

public abstract class User {
    private String nama;
    private String tempatLahir;
    private String tanggalLahir;
    private String alamat;
    private String telepon;
    private UserType userType;
    
    public User(UserType userType, String nama, String tempatLahir, String tanggalLahir, String alamat, String telepon) {
        this.nama = nama;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.alamat = alamat;
        this.telepon = telepon;
        this.userType = userType;
    }
    
    public String toString(){
        return "Nama: " + nama +
                "\nTempat Tanggal Lahir: " + getTempatTanggalLahir() +
                "\nAlamat: " + alamat +
                "\nTelepon: " + telepon;
    }
    String getTempatTanggalLahir(){
        return tempatLahir + ", " + tanggalLahir;
    }
    String getNama(){
        return nama;
    }
    String getAlamat(){
        return alamat;
    }
    String getTelepon(){
        return telepon;
    }
    UserType getUserType(){
        return userType;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }
    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
}
