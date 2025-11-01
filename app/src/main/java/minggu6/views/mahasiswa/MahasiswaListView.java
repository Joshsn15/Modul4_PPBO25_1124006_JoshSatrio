package minggu6.views.mahasiswa;

import minggu6.controllers.MahasiswaController;
import minggu6.repository.MahasiswaRepository;

public class MahasiswaListView {
    private MahasiswaController mahasiswaController;

    public MahasiswaListView() {
        this.mahasiswaController = new MahasiswaController();
    }

    public void render() {
        mahasiswaController.print();
    }
}
