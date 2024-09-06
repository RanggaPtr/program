package Tugas.no1;

public class RentalGame {
    public static void main(String[] args) {
        Peminjaman pmnjm1 = new Peminjaman();
        pmnjm1.id = "A1";
        pmnjm1.namaMember = "Rangga";
        pmnjm1.namaGame = "Resident Evil 9";
        pmnjm1.harga = 20000;
        pmnjm1.lamaSewa=10;
        
        pmnjm1.tampilDataPeminjaman();
        System.out.println("Total Harga: "+pmnjm1.tampilPeminjamanInvoice(pmnjm1.harga));
    }
}
