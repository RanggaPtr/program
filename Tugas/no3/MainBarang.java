package Tugas.no3;

public class MainBarang {
    public static void main(String[] args) {
        Barang brg1 = new Barang();
        brg1.kode = "A1";
        brg1.namaBarang = "Televisi";
        brg1.hargaDasar = 10000000;
        brg1.diskon = 0.1f;

        brg1.tampilData();
        brg1.hitungHargaJual();
        // System.out.println("===============================");
        // System.out.println("Harga Final: "+brg1.hitungHargaJual(brg1.hargaDasar, brg1.diskon));
        // System.out.println("===============================");

    }
}
