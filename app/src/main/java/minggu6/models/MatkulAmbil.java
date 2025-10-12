package minggu6.models;

import java.util.ArrayList;

public class MatkulAmbil {
    private MataKuliah matkul;
    private ArrayList<Presensi> listPresensi;
    private double n1,n2,n3;

    public MatkulAmbil(MataKuliah matkulAmbil) {
        this.matkul = matkulAmbil;
        this.listPresensi = new ArrayList<>();
        this.n1 = 0;
        this.n2 = 0; 
        this.n3 = 0;
    }
    @Override
    public String toString() {
        return  "matkul=" + matkul +
                ", listPresensi=" + listPresensi +
                ", n1=" + n1 +
                ", n2=" + n2 +
                ", n3=" + n3
;
            }
    public MataKuliah getMatkul() {
        return matkul;
    }
    public ArrayList<Presensi> getListPresensi() {
        return listPresensi;
    }
    public double getN1() {
        return n1;
    }
    public double getN2() {
        return n2;
    }
    public double getN3() {
        return n3;
    }
    public void setMatkul(MataKuliah matkul) {
        this.matkul = matkul;
    }
    public void setListPresensi(ArrayList<Presensi> listPresensi) {
        this.listPresensi = listPresensi;
    }
    public void setN1(double n1) {
        this.n1 = n1;
    }
    public void setN2(double n2) {
        this.n2 = n2;
    }
    public void setN3(double n3) {
        this.n3 = n3;
    }

    
    
}
