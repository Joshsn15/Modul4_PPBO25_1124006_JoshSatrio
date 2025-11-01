package minggu6.views.mahasiswa;

import minggu6.repository.MahasiswaRepository;
import minggu6.util.CLIUtil;

public class MahasiswaNilaiAkhirView {
    private MahasiswaRepository mahasiswaRepository;
    public MahasiswaNilaiAkhirView() {
        this.mahasiswaRepository = new MahasiswaRepository();
    }
    public void render() {
        System.out.println("== Print Nilai Akhir Mahasiswa ==");
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = CLIUtil.getString();
        System.out.print("Masukkan Kode Mata Kuliah: ");
        String kodeMK = CLIUtil.getString();
        System.out.print("Masukkan Jenis Mahasiswa (Sarjana/Magister/Doktor): ");
        String jenisMahasiswa = CLIUtil.getString();

        if(jenisMahasiswa.equalsIgnoreCase("Sarjana") || jenisMahasiswa.equalsIgnoreCase("Magister")) {
            mahasiswaRepository.printNilaiAkhir(nim, kodeMK);
            return;
        } else {
            mahasiswaRepository.printNilaiAkhirDoctor(nim);
            return;
        }
    }
}
