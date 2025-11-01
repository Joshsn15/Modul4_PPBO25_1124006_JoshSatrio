package minggu6.views.dosen;

import minggu6.repository.DosenRepository;
import minggu6.util.CLIUtil;

public class DosenTotalJamView {
    private DosenRepository dosenRepository;

    public DosenTotalJamView() {
        this.dosenRepository = new DosenRepository();
    }

    public void render() {
        System.out.print("Masukkan NIK Dosen: ");
        String nik = CLIUtil.getString();
        dosenRepository.printTotalJamMengajar(nik);

    }
}
