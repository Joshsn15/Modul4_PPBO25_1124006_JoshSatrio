package minggu6.views.mahasiswa;

import minggu6.controllers.MahasiswaController;
import minggu6.util.CLIUtil;

public class MahasiswaDeleteView { 
    private MahasiswaController mahasiswaController;

    public MahasiswaDeleteView() {
        this.mahasiswaController = new MahasiswaController();
    }


    public void render() {
        System.out.println("=== Delete Mahasiswa ===");
        System.out.print("NIM: ");
        String nim = CLIUtil.getString();
        System.out.print("Nama: ");
        String nama = CLIUtil.getString();

        mahasiswaController.delete(nama, nim);
    }
}