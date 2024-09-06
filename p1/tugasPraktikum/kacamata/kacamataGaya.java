package p1.tugasPraktikum.kacamata;

public class kacamataGaya extends kacamata {
    private String warnaLensa;

    public void setWarnaLensa(String newValue) {
        warnaLensa = newValue;
    }
    
 
    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Warna Lensa :"+warnaLensa);
    }
}
