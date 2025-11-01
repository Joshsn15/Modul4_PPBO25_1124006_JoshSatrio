package minggu6.views.mahasiswa;

import minggu6.repository.MahasiswaRepository;
import minggu6.util.CLIUtil;

public class MahasiswaTidakLulusView {
    private MahasiswaRepository mahasiswaRepository;

    public MahasiswaTidakLulusView() {
        this.mahasiswaRepository = new MahasiswaRepository();
    }
    public void render() {
        System.out.println("=== Print Banyaknya Mahasiswa yang tidak lulus matkul ===");
        System.out.print("Masukkan Kode Mata Kuliah: ");
        String kodeMK = CLIUtil.getString();

        mahasiswaRepository.printMKlulus(kodeMK);
    }
}
