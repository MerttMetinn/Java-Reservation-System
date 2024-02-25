package proglabproje2;

import java.util.ArrayList;

public class Company implements IProfitable{
         
        private String companyName;
        private String password;
        private boolean otobus;
        private boolean tren;
        private boolean ucak;
        private int koltukKap;
        
        public ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        
        private String vehicleType;

        public Company(String companyName, String password, boolean otobus, boolean tren, boolean ucak) {
        this.companyName = companyName;
        this.password = password;
        this.otobus = otobus;
        this.tren = tren;
        this.ucak = ucak;
        }
            
        public Company(){}
    
        public Company(String companyName, String password) {
        this.companyName = companyName;
        this.password = password;
        this.otobus = false;
        this.tren = false;
        this.ucak = false;
        }
        public Company(String vehicleType,int koltukKap)
        {
            this.vehicleType = vehicleType;
            this.koltukKap = koltukKap;
        }

        public String getCompanyName() {
            return companyName;
        }

        public String getPassword() {
            return password;
        }

        public boolean hasOtobus() {
            return otobus;
        }

        public boolean hasTren() {
            return tren;
        }

        public boolean hasUcak() {
            return ucak;
        }

        public boolean checkPassword(String password) {
            return this.password.equals(password);
        }

        public void setOtobus(boolean otobus) {
            this.otobus = otobus;
        }

        public void setTren(boolean tren) {
            this.tren = tren;
        }

        public void setUcak(boolean ucak) {
            this.ucak = ucak;
        }
}