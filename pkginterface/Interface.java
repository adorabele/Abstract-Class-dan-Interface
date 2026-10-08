package pkginterface;

public class Interface {
    public static void main(String[] argv) {
        // Pengujian SegiEmpat
        SegiEmpat se = new SegiEmpat();
        se.panjang = 10;
        se.lebar = 10;
        se.hitungKeliling();
        se.hitungLuas();

        System.out.println("=== SEGIEMPAT ===");
        System.out.println("Luas sebelum diperbesar = " + se.luas);
        System.out.println("Keliling sebelum diperbesar = " + se.keliling);

        se.perbesar();
        se.hitungKeliling();
        se.hitungLuas();
        System.out.println("Luas setelah diperbesar = " + se.luas);
        System.out.println("Keliling setelah diperbesar = " + se.keliling);

        se.perkecil();
        se.hitungKeliling();
        se.hitungLuas();
        System.out.println("Luas setelah diperkecil = " + se.luas);
        System.out.println("Keliling setelah diperkecil = " + se.keliling);

        // Pengujian SegiTigaSamaKaki
        System.out.println("\n=== SEGITIGA SAMA KAKI ===");
        SegiTigaSamaKaki stsk = new SegiTigaSamaKaki();
        stsk.alas = 6;
        stsk.tinggi = 4;
        stsk.hitungLuas();
        System.out.println("Luas awal = " + stsk.luas);

        stsk.perbesar();
        stsk.hitungLuas();
        System.out.println("Luas setelah diperbesar = " + stsk.luas);

        stsk.perkecil();
        stsk.hitungLuas();
        System.out.println("Luas setelah diperkecil = " + stsk.luas);

        // Pengujian Lingkaran
        System.out.println("\n=== LINGKARAN ===");
        Lingkaran l = new Lingkaran();
        l.jariJari = 14;
        l.hitungLuas();
        System.out.println("Luas awal = " + l.luas);

        l.perbesar();
        l.hitungLuas();
        System.out.println("Luas setelah diperbesar = " + l.luas);

        l.perkecil();
        l.hitungLuas();
        System.out.println("Luas setelah diperkecil = " + l.luas);
    }
}