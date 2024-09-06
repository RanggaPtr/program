package p1.tugasPraktikum.ac;

public class demo {
    public static void main(String[] args) {
        // buat objek
        AirConditioner ac1 = new AirConditioner();

        // masukkan nilai ke method method
        ac1.setMerk("Toshiba");
        ac1.setWarna("Putih");
        ac1.setBesarPK(2);
        ac1.cetakStatus();
    }
}
