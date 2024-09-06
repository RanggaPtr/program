package Tugas.no2;

public class MainLingkaran {
    public static void main(String[] args) {
        Lingkaran o1 = new Lingkaran();
        o1.r = 10;
        System.out.println("Data Lingkaran :");
        System.out.println("Phi ="+o1.phi);
        System.out.println("Jari Jari (r) ="+o1.r);
        System.out.println("Hasil Hitung Method :");
        System.out.println("Luas Lingkaran "+o1.hitungLuas(o1.r));
        System.out.println("Keliling Lingkaran "+o1.hitungKeliling(o1.r));

    }
}
