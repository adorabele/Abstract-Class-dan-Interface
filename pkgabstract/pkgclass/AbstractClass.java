package pkgabstract.pkgclass;

public class AbstractClass {
    public static void main(String[] argv) {
        // Objek Segitiga Sama Kaki
        SegiTigaSamaKaki stsk = new SegiTigaSamaKaki();
        stsk.alas = 10;
        stsk.tinggi = 4;
        stsk.hitungLuas();
        stsk.hitungKeliling();
        System.out.println("Luas STSK = " + stsk.luas);
        System.out.println("Keliling STSK = " + stsk.keliling);

        // Objek SegiEmpat
        SegiEmpat se = new SegiEmpat();
        se.panjang = 5;
        se.lebar = 4;
        se.hitungLuas();
        se.hitungKeliling();
        System.out.println("Luas SegiEmpat = " + se.luas);
        System.out.println("Keliling SegiEmpat = " + se.keliling);

        // Objek Lingkaran
        Lingkaran l = new Lingkaran();
        l.jariJari = 7;
        l.hitungLuas();
        l.hitungKeliling();
        System.out.println("Luas Lingkaran = " + l.luas);
        System.out.println("Keliling Lingkaran = " + l.keliling);
    }
}