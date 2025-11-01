package minggu6.models;

import java.util.ArrayList;

public class Magister extends Mahasiswa {
    private ArrayList<MataKuliah> listMataKuliahAmbil;
    private String judulTesis;

    public Magister(int id, String nim, String kodejurusan, String nama, String tempatLahir, String tanggalLahir, String alamat,
            String telepon, String judulTesis) {
        super(id, nim, kodejurusan, nama, tempatLahir, tanggalLahir, alamat, telepon);
        listMataKuliahAmbil = new ArrayList<>();
        this.judulTesis = judulTesis;
    }

    @Override
    public String toString() {
        return "judulTesis='" + judulTesis + '\'' +
                ", listMataKuliahAmbil=" + listMataKuliahAmbil;
    }

    public String getJudulTesis() {
        return judulTesis;
    }

    public void setJudulTesis(String judulTesis) {
        this.judulTesis = judulTesis;
    }

    public ArrayList<MataKuliah> getListMataKuliahAmbil() {
        return listMataKuliahAmbil;
    }

    public void setListMataKuliahAmbil(ArrayList<MataKuliah> listMataKuliahAmbil) {
        this.listMataKuliahAmbil = listMataKuliahAmbil;
    }

}