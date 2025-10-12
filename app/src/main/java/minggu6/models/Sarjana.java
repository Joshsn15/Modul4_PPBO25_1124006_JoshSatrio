package minggu6.models;

import java.util.ArrayList;

public class Sarjana extends Mahasiswa {
    private ArrayList<MataKuliah> listMataKuliahAmbil;
    public Sarjana(String nim, String kodejurusan, String nama, String tempatLahir, String tanggalLahir, String alamat, String telepon) {
        super(nim, kodejurusan, nama, tempatLahir, tanggalLahir, alamat, telepon);
    }
    @Override
    public String toString() {
        return 
                "listMataKuliahAmbil=" + listMataKuliahAmbil; 
    }
    public ArrayList<MataKuliah> getListMataKuliahAmbil() {
        return listMataKuliahAmbil;
    }
    public void setListMataKuliahAmbil(ArrayList<MataKuliah> listMataKuliahAmbil) {
        this.listMataKuliahAmbil = listMataKuliahAmbil;
    }

}
