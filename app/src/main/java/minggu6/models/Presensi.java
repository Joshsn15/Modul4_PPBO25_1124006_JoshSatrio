package minggu6.models;

public abstract class Presensi {
    private String tanggal;
    private StatusPresensi status;
    public Presensi(String tanggal, StatusPresensi status) {
        this.tanggal = tanggal;
        this.status = status;
    }
    @Override
    public String toString() {
        return "Presensi{" +
                "tanggal='" + tanggal + '\'' +
                ", status=" + status +
                '}';
    }
    public String getTanggal() {
        return tanggal;
    }
    public StatusPresensi getStatus() {
        return status;
    }
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    public void setStatus(StatusPresensi status) {
        this.status = status;
    }
}
