package minggu6.views.mahasiswa;

import minggu6.repository.MahasiswaRepository;
import minggu6.util.CLIUtil;

public class MahasiswaNilaiRataRataView {
    private MahasiswaRepository mahasiswaRepository;
    
    public MahasiswaNilaiRataRataView() {
        this.mahasiswaRepository = new MahasiswaRepository();
    }

    public void render() {
        System.out.println("=== Print Rata-Rata Nilai Akhir Mahasiswa ===");
        System.out.print("Masukkan Kode Mata Kuliah: ");
        String kodeMK = CLIUtil.getString();

        mahasiswaRepository.printRataRataNilai(kodeMK);
    }
}
