package minggu6.views.mahasiswa;

import minggu6.repository.MahasiswaRepository;
import minggu6.util.CLIUtil;

public class MahasiswaTotalPresensiView {
    MahasiswaRepository mahasiswaRepository;

    public MahasiswaTotalPresensiView() {
        this.mahasiswaRepository = new MahasiswaRepository();
    }

    public void render() {
        System.out.println("Print total presensi satu Mahasiswa");
        String nim = CLIUtil.getString();
        System.out.println("Masukkan Kode Mata Kuliah: ");
        String matkulAmbil = CLIUtil.getString();
        
        mahasiswaRepository.printMKTotalPresensi(nim, matkulAmbil);
    }
}

