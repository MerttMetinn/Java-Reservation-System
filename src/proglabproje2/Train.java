package proglabproje2;

import proglabproje2.Vehicle;
import java.util.ArrayList;

public class Train extends Vehicle {
    private String trainName;
    public static ArrayList<Train> trenListesi = new ArrayList<>();
    private boolean seferVarMi;
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
    


    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public Train(String trainName, int koltukSayisi, String fuelType, String aracinFirmasi) {
        this.trainName = trainName;
        this.koltukSayisi = koltukSayisi;
        this.fuelType = fuelType;
        this.aracinFirmasi = aracinFirmasi;
    }
     public Train(String trainName,int koltukSayisi,String fuelType,String aracinFirmasi,String atananSeferStringi,int[][] atananSefer)
    {
        this.trainName = trainName;
        this.koltukSayisi = koltukSayisi;
        this.fuelType = fuelType;
        this.aracinFirmasi = aracinFirmasi;
        this.atananSeferStringi = atananSeferStringi;
        this.seferVarMi = true;
        this.atananSefer = atananSefer;
    }
}
