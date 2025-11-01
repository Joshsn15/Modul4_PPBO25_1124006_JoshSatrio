package minggu6.models;

public class Nilai {
    private String kodeMK;
    private String nim;
    private double n1,n2,n3;

    public Nilai(String kodeMK, String nim, double n1, double n2, double n3) {
        this.kodeMK = kodeMK;
        this.nim = nim;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public String getKodeMK() {
        return kodeMK;
    }


    public String getNim() {
        return nim;
    }


    public double getN1() {
        return n1;
    }


    public double getN2() {
        return n2;
    }


    public double getN3() {
        return n3;
    }

}
