
package proglabproje2;

public class Trip {
   private String companyName;
   private String vehicleName;
   private String departureLocation;
   private String arrivalLocation;
   private String vehicleType;
   private int ucret;
   private String date;
 
   public static final int[][] sefer1= {{0,75,225,300,375},{75,0,75,150,300},{225,75,0,75,225},{300,150,75,0,150},{375,300,225,150,0}};   //Sadece tren seferidir.
   public static final int[][] sefer2 = {{0,75,225,300,450},{75,0,75,150,350},{225,75,0,75,300},{300,150,75,0,225},{450,305,300,225,0}};  //Sadece tren seferidir.
   public static final int[][] sefer3 = {{0,100,500},{100,0,400},{500,400,0}};                                                                                                  //Sadece otobüs seferidir.
   public static final int[][] sefer4 = {{0,100,300,600},{100,0,200,500},{300,200,0,300},{600,500,300,0}};                                                   //Sadece otobüs seferidir.
   public static final int[][] sefer5 = {{0,300},{300,0}};                                                                                                                                   //Sadece uçak seferidir.
   public static final int[][] sefer6 = {{0,250},{250,0}};                                                                                                                                   //Sadece uçak seferidir.
   
   

   public Trip(String companyName, String vehicleName, String departureLocation, String arrivalLocation, String vehicleType, int ucret, String date) {
       this.companyName = companyName;
       this.vehicleName = vehicleName;
       this.departureLocation = departureLocation;
       this.arrivalLocation = arrivalLocation;
       this.vehicleType = vehicleType;
       this.ucret = ucret;
       this.date = date;
   }
   
   public Trip(){
       
   }
   
   public String getCompanyName() {
       return companyName;
   }

   public void setCompanyName(String companyName) {
       this.companyName = companyName;
   }

   public String getVehicleName() {
       return vehicleName;
   }

   public void setVehicleName(String vehicleName) {
       this.vehicleName = vehicleName;
   }

   public String getDepartureLocation() {
       return departureLocation;
   }

   public void setDepartureLocation(String departureLocation) {
       this.departureLocation = departureLocation;
   }

   public String getArrivalLocation() {
       return arrivalLocation;
   }

   public void setArrivalLocation(String arrivalLocation) {
       this.arrivalLocation = arrivalLocation;
   }

   public String getVehicleType() {
       return vehicleType;
   }

   public void setVehicleType(String vehicleType) {
       this.vehicleType = vehicleType;
   }

   public double getUcret() {
       return ucret;
   }

   public void setFare(int ucret) {
       this.ucret = ucret;
   }

   public String getDate() {
       return date;
   }

   public void setDate(String date) {
       this.date = date;
   }
}

