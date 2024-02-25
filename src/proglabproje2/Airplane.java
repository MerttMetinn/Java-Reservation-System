package proglabproje2;

import proglabproje2.Vehicle;
import java.util.ArrayList;

public class Airplane extends Vehicle {
    private String airplaneName;
    public static ArrayList<Airplane> ucakListesi = new ArrayList<>();
    private boolean seferVarMi = false;
    private String atananSeferStringi;
    public int[][] atananSefer;
    
    public boolean isSeferVarMi() {
        return seferVarMi;
    }

    public void setSeferVarMi(boolean seferVarMi) {
        this.seferVarMi = seferVarMi;
    }

    public String getAtananSeferStringi() {
        return atananSeferStringi;
    }

    public void setAtananSeferStringi(String atananSeferStringi) {
        this.atananSeferStringi = atananSeferStringi;
    }
    

    public String getAirplaneName() {
        return airplaneName;
    }

    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }

    public Airplane(String airplaneName, int koltukSayisi, String fuelType, String aracinFirmasi) {
        this.airplaneName = airplaneName;
        this.koltukSayisi = koltukSayisi;
        this.fuelType = fuelType;
        this.aracinFirmasi = aracinFirmasi;
    }
 public Airplane(String airplaneName,int koltukSayisi,String fuelType,String aracinFirmasi,String atananSeferStringi,int[][] atananSefer)
    {
        this.airplaneName = airplaneName;
        this.koltukSayisi = koltukSayisi;
        this.fuelType = fuelType;
        this.aracinFirmasi = aracinFirmasi;
        this.atananSeferStringi = atananSeferStringi;
        this.seferVarMi = true;
        this.atananSefer = atananSefer;
    }
}
