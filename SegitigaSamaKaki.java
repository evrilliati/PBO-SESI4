public class SegitigaSamaKaki extends Segitiga {
    public double sisi;

    public SegitigaSamaKaki(String nama, double alas, double sisi) {
        super(nama, alas, hitungTinggi(alas, sisi));
        this.sisi = sisi;
    }

    private static double hitungTinggi(double alas, double sisi) {
        return Math.sqrt(Math.pow(sisi, 2) - Math.pow((alas / 2), 2));
    }
    
    @Override
    protected void hitungKeliling() {
        keliling = alas + 2 * sisi;
    }
}