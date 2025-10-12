package minggu6.models;

public class PresensiStaff extends Presensi {
    private String tanggal;
    private StatusPresensi status;
    private int jam;
    public PresensiStaff(int jam, String tanggal, StatusPresensi status) {
        super(tanggal, status);
        this.jam = jam;
    }
    @Override
    public String toString() {
        return "PresensiStaff{" +
                "tanggal='" + tanggal + '\'' +
                ", status=" + status +
                ", jam=" + jam +
                '}';
    }
    public int getJam() {
        return jam;
    }
    public void setJam(int jam) {
        this.jam = jam;
    }
    public StatusPresensi getStatus() {
        return super.getStatus();
    }
    
}
