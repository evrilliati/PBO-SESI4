class Segitiga extends BangunDatar {
    protected double alas;
    protected double tinggi;

    public Segitiga(String nama, double alas, double tinggi) {
        setNama(nama);
        this.alas = alas;
        this.tinggi = tinggi;
        hitungLuas();
        hitungKeliling();
    }

    private void hitungLuas() {
        luas = 0.5 * alas * tinggi;
    }

    protected void hitungKeliling() {
       
    }
}