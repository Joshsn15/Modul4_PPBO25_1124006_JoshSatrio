package minggu6.models;

public class MatkulAjar extends MataKuliah {
    private MataKuliah matakuliah;
    private PresensiStaff presensiStaff;
    public MatkulAjar( String kode, String nama, int sks) {
        super(kode, nama, sks);

    }
    @Override
    public String toString() {
        return super.toString() +
                "\nMatakuliah: " + matakuliah +
                "\nPresensi Staff: " + presensiStaff;
    }
    public MataKuliah getMatakuliah() {
        return matakuliah;
    }
    public void setMatakuliah(MataKuliah matakuliah) {
        this.matakuliah = matakuliah;
    }
    public PresensiStaff getPresensiStaff() {
        return presensiStaff;
    }
    public void setPresensiStaff(PresensiStaff presensiStaff) {
        this.presensiStaff = presensiStaff;
    }

}
 