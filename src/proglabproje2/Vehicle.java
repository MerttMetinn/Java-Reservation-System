
package proglabproje2;

public abstract class Vehicle {
    protected int koltukSayisi;
    protected String fuelType;
    protected String aracinFirmasi;
    public static int[][] atananSefer;
    public static String atananSeferStringi;

    public int getKoltukSayisi() {
        return koltukSayisi;
    }

    public void setKoltukSayisi(int koltukSayisi) {
        this.koltukSayisi = koltukSayisi;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getAracinFirmasi() {
        return aracinFirmasi;
    }

    public void setAracinFirmasi(String aracinFirmasi) {
        this.aracinFirmasi = aracinFirmasi;
    }
}

