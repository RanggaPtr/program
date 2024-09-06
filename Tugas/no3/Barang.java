package Tugas.no3;

public class Barang {
    String kode;
    String namaBarang;
    int hargaDasar;
    float diskon;

    int hitungHargaJual() {
        int hargaJual = hargaDasar - ((int) diskon * hargaDasar);
        System.out.println("===============================");
        System.out.println("Harga Final: " + hargaJual);
        System.out.println("===============================");
        return hargaJual;
    }

    void tampilData() {
        System.out.println("=========== INVOICE ===========");
        System.out.println("Kode Barang           : " + kode);
        System.out.println("Nama Barang           : " + namaBarang);
        System.out.println("Harga Dasar Barang    : " + hargaDasar);
        System.out.println("Diskon                : " + diskon);
    }
}
