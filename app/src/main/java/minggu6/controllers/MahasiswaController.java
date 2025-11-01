package minggu6.controllers;

import minggu6.models.Mahasiswa;
import minggu6.repository.MahasiswaRepository;

public class MahasiswaController {
    MahasiswaRepository mahasiswaRepository;

    public MahasiswaController() {
        mahasiswaRepository = new MahasiswaRepository();
    }

    public void addNew(String nama, String nim, String Jurusan, String tempatLahir, String tanggalLahir, String alamat,
            String telepon) {
        mahasiswaRepository.add(nama, nim, Jurusan, tempatLahir, tanggalLahir, alamat, telepon);
    }

    public void delete(String nama, String nim) {
        mahasiswaRepository.delete(nama, nim);
    };

    public void update(String nama, String nim, String Jurusan, String tempatLahir, String tanggalLahir, String alamat,
            String telepon) {
        mahasiswaRepository.update(nama, nim, Jurusan, tempatLahir, tanggalLahir, alamat, telepon);
    };

    public void print() {
        mahasiswaRepository.printAllMhs();
    };


    public void printNilaiAkhir(String nim, String kodeMK, String jenisMahasiswa) {
        if (jenisMahasiswa.equalsIgnoreCase("Sarjana") || jenisMahasiswa.equalsIgnoreCase("Magister")) {
            mahasiswaRepository.printNilaiAkhir(nim, kodeMK);
            return;
        } else {
            mahasiswaRepository.printNilaiAkhirDoctor(nim);
            return;
        }
    };

    public void printRataRataNilaiAkhir(String kodeMK) {
        mahasiswaRepository.printRataRataNilai(kodeMK);
    };

    public Mahasiswa get(String nim) {
        return null;
    };

}
