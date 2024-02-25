package proglabproje2;

import proglabproje2.Vehicle;
import proglabproje2.Vehicle;
import java.util.ArrayList;

public class Bus extends Vehicle {
    private String busName;
    public static ArrayList<Bus> otobusListesi = new ArrayList<>();
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

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public Bus(String busName, int koltukSayisi, String fuelType, String aracinFirmasi) {
        this.busName = busName;
        this.koltukSayisi = koltukSayisi;
        this.fuelType = fuelType;
        this.aracinFirmasi = aracinFirmasi;
    }
    public Bus(String busName,int koltukSayisi,String fuelType,String aracinFirmasi,String atananSeferStringi,int[][] atananSefer)
    {
        this.busName = busName;
        this.koltukSayisi = koltukSayisi;
        this.fuelType = fuelType;
        this.aracinFirmasi = aracinFirmasi;
        this.atananSeferStringi = atananSeferStringi;
        this.seferVarMi = true;
        this.atananSefer = atananSefer;
    }

}
