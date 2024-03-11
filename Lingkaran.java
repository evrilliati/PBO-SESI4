class Lingkaran extends BangunDatar {
    private double radius;

    public Lingkaran(String nama, double radius) {
        setNama(nama);
        this.radius = radius;
        hitungLuas();
        hitungKeliling();
    }

    private void hitungLuas() {
        luas = Math.PI * Math.pow(radius, 2);
    }

    private void hitungKeliling() {
        keliling = 2 * Math.PI * radius;
    }
}