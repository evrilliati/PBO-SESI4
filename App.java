public class App {
    public static void main(String[] args) {
        // Membuat objek Lingkaran
        Lingkaran lingkaran = new Lingkaran("Lingkaran A", 5.0);
        lingkaran.getInfo();
        System.out.println();

        // Membuat objek SegitigaSamaKaki
        SegitigaSamaKaki segitigaSK = new SegitigaSamaKaki("Segitiga SK A", 6.0, 4.0);
        segitigaSK.getInfo();
        System.out.println();

        // Membuat objek SegitigaSamaSisi
        SegitigaSamaSisi segitigaSS = new SegitigaSamaSisi("Segitiga SS A", 3.0);
        segitigaSS.getInfo();
        System.out.println();

        // Membuat objek SegitigaSikuSiku
        SegitigaSikuSiku segitigaSiku = new SegitigaSikuSiku("Segitiga Siku A", 3.0, 4.0);
        segitigaSiku.getInfo();
        System.out.println();

        SegitigaSembarang segitigaSembarang = new SegitigaSembarang("Segitiga Sembarang A", 2.0, 3.0, 4.0);
        segitigaSembarang.getInfo();
        System.out.println();

        Persegi persegi = new Persegi("Persegi A", 7.0);
        persegi.getInfo();
    }
}
