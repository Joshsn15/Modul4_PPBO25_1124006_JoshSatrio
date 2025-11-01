package minggu6.views.mahasiswa;

import minggu6.util.CLIUtil;

public class MahasiswaView {
                    private MahasiswaAddView mahasiswaAddView;
                    private MahasiswaListView mahasiswaListView;
                    private MahasiswaUpdateView mahasiswaUpdateView;
                    private MahasiswaDeleteView mahasiswaDeleteView;
                    private MahasiswaNilaiAkhirView mahasiswaNilaiAkhirView;
                    private MahasiswaNilaiRataRataView mahasiswaRataRataView;
                    private MahasiswaTidakLulusView mahasiswaTidakLulusView;
                    private MahasiswaTotalPresensiView mahasiswaTotalPresensiView;

                    public MahasiswaView() {
                        this.mahasiswaAddView = new MahasiswaAddView();
                        this.mahasiswaListView = new MahasiswaListView();
                        this.mahasiswaUpdateView = new MahasiswaUpdateView();
                        this.mahasiswaDeleteView = new MahasiswaDeleteView();
                        this.mahasiswaNilaiAkhirView = new MahasiswaNilaiAkhirView();
                        this.mahasiswaRataRataView = new MahasiswaNilaiRataRataView();
                        this.mahasiswaTidakLulusView = new MahasiswaTidakLulusView();
                        this.mahasiswaTotalPresensiView = new MahasiswaTotalPresensiView();
                    }

                    public void render() {
                        while (true) {
                            CLIUtil.getString();
                            System.out.println("\nMenu Mahasiswa");
                            System.out.println("1. Tambah Mahasiswa");
                            System.out.println("2. Lihat Daftar Mahasiswa");
                            System.out.println("3. Ubah Data Mahasiswa");
                            System.out.println("4. Hapus Mahasiswa");
                            System.out.println("5. Print nilai akhir Mahasiswa");
                            System.out.println("6. Print rata-rata nilai akhir Mahasiswa");
                            System.out.println("7. Print banyak mahasiswa yang lulus mata kuliah");
                            System.out.println("8. Print total presensi satu Mahasiswa");
                            System.out.print("Pilih > ");

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
                                this.mahasiswaAddView.render();
                                break;
                            case 2:
                                this.mahasiswaListView.render();
                                break;
                            case 3:
                                this.mahasiswaUpdateView.render();
                                break;
                            case 4:
                                this.mahasiswaDeleteView.render();
                                break;
                            case 5:
                                this.mahasiswaNilaiAkhirView.render();
                                break;
                            case 6:
                                this.mahasiswaRataRataView.render();
                                break;
                            case 7:
                                this.mahasiswaTidakLulusView.render();
                                break;
                            case 8:
                                this.mahasiswaTotalPresensiView.render();
                                break;
                            default:
                                System.out.println("salah lu");
                        }
                        return true;
                    }
                }
