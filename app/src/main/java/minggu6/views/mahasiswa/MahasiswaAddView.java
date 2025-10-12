package minggu6.views.mahasiswa;

import minggu6.controllers.MahasiswaController;
import minggu6.util.CLIUtil;

public class MahasiswaAddView { 
    private MahasiswaController mahasiswaController;

    public MahasiswaAddView() {
        this.mahasiswaController = new MahasiswaController();
    }


    public void render() {
        System.out.println("=== Add New Mahasiswa ===");
        System.out.print("NIM: ");
        String nim = CLIUtil.getString();
        System.out.print("Nama: ");
        String nama = CLIUtil.getString();
        System.out.print("Tempat Lahir: ");
        String tempatLahir = CLIUtil.getString();
        System.out.print("Tanggal Lahir (dd-mm-yyyy): ");
        String tanggalLahir = CLIUtil.getString();
        System.out.print("Alamat: ");
        String alamat = CLIUtil.getString();
        System.out.print("Telepon: ");
        String telepon = CLIUtil.getString();

        mahasiswaController.addNew(nim, nama, tempatLahir, tanggalLahir, alamat, telepon);
    }
}