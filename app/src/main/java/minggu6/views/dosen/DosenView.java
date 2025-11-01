package minggu6.views.dosen;

import minggu6.util.CLIUtil;
import minggu6.views.dosen.DosenTotalJamView;
public class DosenView {

    private DosenTotalJamView dosenTotalJamView;

    public DosenView() {
        this.dosenTotalJamView = new DosenTotalJamView();
    }

    public void render() {
        while (true) {
            System.out.println("== Dosen View ==");
            System.out.println("1. Print total jam Dosen masuk kelas dan mengajar");
            int menuInput = CLIUtil.getInt();
            CLIUtil.getString();
            if (!handleMenuInput(menuInput)) {
                break;
            }
        }
    }

    private boolean handleMenuInput(int menuInput) {
        switch (menuInput) {
            case 1:
                this.dosenTotalJamView.render();
                break;
            default:
                System.out.println("error");
        }
        return false;
    }
}
