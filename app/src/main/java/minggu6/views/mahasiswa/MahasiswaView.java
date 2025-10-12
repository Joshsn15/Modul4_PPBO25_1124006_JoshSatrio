package minggu6.views.mahasiswa;

import minggu6.util.CLIUtil;

public class MahasiswaView {
    private MahasiswaAddView mahasiswaAddView; 
    
    public void render() {
        System.out.println("Menu Mahasiswa");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Lihat Daftar Mahasiswa");
        System.out.println("3. Ubah Data Mahasiswa");
        System.out.println("4. Hapus Mahasiswa");
        System.out.println("5. Keluar");
        
    }
    private void handleMenuInput() {
        int menuInput = CLIUtil.getInt();
        switch (menuInput) {
            case 2:
                this.mahasiswaAddView.render();
                break;
        }       
    } 
}
