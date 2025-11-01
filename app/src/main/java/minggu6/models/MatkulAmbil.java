package minggu6.models;

import java.util.ArrayList;

public class MatkulAmbil {
    private MataKuliah matkul;
    private ArrayList<Presensi> listPresensi;


    public MatkulAmbil(MataKuliah matkulAmbil) {
        this.matkul = matkulAmbil;
        this.listPresensi = new ArrayList<>();
       
    }
    @Override
    public String toString() {
        return  "matkul=" + matkul +
            ", listPresensi=" + listPresensi;
            }
    public MataKuliah getMatkul() {
        return matkul;
    }
    public ArrayList<Presensi> getListPresensi() {
        return listPresensi;
    }
    
    public void setMatkul(MataKuliah matkul) {
        this.matkul = matkul;
    }
    public void setListPresensi(ArrayList<Presensi> listPresensi) {
        this.listPresensi = listPresensi;
    }
    
    
    
}
