class SegitigaSembarang extends Segitiga {
    public double sisiB;
    public double sisiC;

    public SegitigaSembarang(String nama, double sisiA, double sisiB, double sisiC) {
        super(nama, sisiA, hitungTinggi(sisiA, sisiB, sisiC));
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    private static double hitungTinggi(double sisiA, double sisiB, double sisiC) {
        // Tambahkan rumus perhitungan tinggi segitiga sembarang sesuai kebutuhan
        return 0.0;
    }

    @Override
    protected void hitungKeliling() {
        keliling = alas + sisiB + sisiC;
    }
}
