package p1.tugasPraktikum.pintu;

public class Pintu {
    
    private String warna, bahan, model;

    public void setWarna(String newValue) {
        warna = newValue;
    }
    
    public void setBahan(String newValue) {
        bahan = newValue;
    }

    public void setModel(String newValue) {
        model = newValue;
    }

    public void cetakStatus() {
        System.out.println("Warna :"+warna);
        System.out.println("Bahan :" + bahan);
        System.out.println("Model :"+model);
    }
}
