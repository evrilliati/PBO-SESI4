public class Persegi extends BangunDatar {
    protected double sisi;

    public Persegi(String nama, double sisi) {
        setNama(nama);
        this.sisi = sisi;
        hitungLuas();
        hitungKeliling();
    }

    private void hitungLuas() {
        luas = sisi * sisi;
    }

    private void hitungKeliling() {
        keliling = 4 * sisi;
    }
}
