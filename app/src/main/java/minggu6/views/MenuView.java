package minggu6.views;

import minggu6.util.CLIUtil;
import minggu6.views.mahasiswa.MahasiswaView;

public class MenuView {
    private MahasiswaView mahasiswaView;

    public MenuView() {
        this.mahasiswaView = new MahasiswaView();
    }

    public void render() {
        System.out.println("MENU");
        System.out.println("1. Menu Mahasiswa");
        System.out.println("2. Menu Dosen");
        System.out.println("3. Exit");
        this.handleMenuInput();
    }

    private void handleMenuMahasiswa() {
        this.mahasiswaView.render();
    }
    private void handleMenuInput() {
        int menuInput = CLIUtil.getInt();
        switch (menuInput) {
            case 1:
                this.handleMenuMahasiswa();
                break;
            case 2:
                // Handle Dosen menu
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("error");
        }
    }
    
}
