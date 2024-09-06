package p1.tugasPraktikum.kacamata;

public class demo {
    public static void main(String[] args) {
        
        // buat objek
        kacamata kcmt1 = new kacamata();
        kacamataGaya kcmt2 = new kacamataGaya();
        kacamataMinus kcmt3 = new kacamataMinus();

        // memasukkan nilai ke method method
        // kacamata (parent)
        kcmt1.setMerk("ramaeron");
        kcmt1.setWarnaFrame("hitam");
        kcmt1.cetakStatus();
        
        // kacamata gaya (parent & child)
        kcmt2.setMerk("stylish");
        kcmt2.setWarnaFrame("biru");
        kcmt2.setWarnaLensa("hitam");
        kcmt2.cetakStatus();
        
        // kacamata minus (child)
        kcmt3.setMerk("rigata");
        kcmt3.setWarnaFrame("biru dongker");
        kcmt3.setWarnaLensa("bening");
        kcmt3.setUkuranLensa(5.6);
        kcmt3.cetakStatus();
    }
}
