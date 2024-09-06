package p1.tugasPraktikum.ac;

public class AirConditioner {
    private String merk,warna;
    private int besarPK;

    public void setMerk(String newValue) {
        merk = newValue;
    }

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void setBesarPK(int newValue) {
        besarPK = newValue;
    }
    
    public void cetakStatus() {
        System.out.println("Merk :" + merk);
        System.out.println("Warna :" + warna);
        System.out.println("besarPK :"+besarPK);
    }
}
    