package p1.tugasPraktikum.kacamata;

public class kacamata {
    private String merk, warnaFrame;

    public void setMerk(String newValue) {
        merk = newValue;
    }

    public void setWarnaFrame(String newValue) {
        warnaFrame = newValue;
    }
    
    public void cetakStatus() {
        System.out.println("Merk :" + merk);
        System.out.println("Warna Frame :"+warnaFrame);
    }
}
