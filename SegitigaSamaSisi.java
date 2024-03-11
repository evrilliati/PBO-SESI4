public class SegitigaSamaSisi extends Segitiga {
    public double sisi;

    public SegitigaSamaSisi(String nama, double sisi) {
        super(nama, sisi, hitungTinggi(sisi));
        this.sisi = sisi;
    }

    private static double hitungTinggi(double sisi) {
        return (Math.sqrt(3) / 2) * sisi;
    }
    
    @Override
    protected void hitungKeliling() {
        keliling = 3 * sisi;
    }
}