package Tugas.no1;

public class Peminjaman {
    public String id;
    public String namaMember;
    public String namaGame;
    public int lamaSewa;
    public double harga;

    public void tampilDataPeminjaman() {
        System.out.println("=====BIODDATA PEMINJAM=====");
        System.out.println("ID          :" + id);
        System.out.println("Nama Member :" + namaMember);
        System.out.println("Nama Game   :" + namaGame);
        System.out.println("Lama Sewa   :" + lamaSewa);
    }

    public double tampilPeminjamanInvoice(double harga) {
        System.out.println("=====INVOICE PEMINJAMAN GAME=====");
        tampilDataPeminjaman();
        return harga * lamaSewa;
    }
}
