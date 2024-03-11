class SegitigaSikuSiku extends Segitiga {
    public double sisiA;
    public double sisiB;

    public SegitigaSikuSiku(String nama, double sisiA, double sisiB) {
        super(nama, hitungAlas(sisiA, sisiB), hitungTinggi(sisiA, sisiB));
        this.sisiA = sisiA;
        this.sisiB = sisiB;
    }

    private static double hitungAlas(double sisiA, double sisiB) {
        return Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
    }

    private static double hitungTinggi(double sisiA, double sisiB) {
        return (sisiA * sisiB) / Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
    }
    
    @Override
    protected void hitungKeliling() {
        keliling = alas + sisiA + sisiB;
    }
}