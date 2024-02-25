
package proglabproje2;

import proglabproje2.Airplane;
import proglabproje2.Bus;
import proglabproje2.Company;
import proglabproje2.Giris;
import proglabproje2.Train;
import proglabproje2.Trip;
import java.util.ArrayList;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
    public static ArrayList<Company> companies = new ArrayList<>();
    public static ArrayList<Trip> trips = new ArrayList<Trip>();
    public static Company currentCompany;
   
    public static void main(String[] args) throws UnsupportedLookAndFeelException  {
        createDefaultCompanies();

        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                new Giris().setVisible(true);
                }
            });
        }
    
        public static void createDefaultCompanies() {
        Company firmaA = new Company("a", "a",true,false,false);

        Company firmaB = new Company("b", "b",true,false,false);

        Company firmaC = new Company("c", "c",true,false,true);

        Company firmaD = new Company("d", "d",false,true,false);

        Company firmaF = new Company("f", "f",false,false,true);

        
        Bus aOtobus1 = new Bus("Otobüs 1",20,"Benzin","a","3 - (IST - KOC - ANK)",Trip.sefer3);
        Bus.otobusListesi.add(aOtobus1);
        Bus aOtobus2 = new Bus("Otobüs 2",15,"Benzin","a","3 - (IST - KOC - ANK)",Trip.sefer3);
        Bus.otobusListesi.add(aOtobus2);
        
        firmaA.vehicles.add(aOtobus1);
        firmaA.vehicles.add(aOtobus2);
        companies.add(firmaA);
        
        
        Bus bOtobus1 = new Bus("Otobüs 1",15,"Benzin","b","3 - (IST - KOC - ANK)",Trip.sefer3);
        Bus.otobusListesi.add(bOtobus1);
        Bus bOtobus2 = new Bus("Otobüs 2",20,"Benzin","b","4 - (IST - KOC - ESK - KON)",Trip.sefer4);
        Bus.otobusListesi.add(bOtobus2);
        
        firmaB.vehicles.add(aOtobus1);
        firmaB.vehicles.add(aOtobus2);
        companies.add(firmaB);
        
        
        Bus cOtobus1 = new Bus("Otobüs 1",20,"Motorin","c","4 - (IST - KOC - ESK - KON)",Trip.sefer4);
        Bus.otobusListesi.add(cOtobus1);
        Airplane cUcak1 = new Airplane("Uçak 1",30,"Gaz","c","5 - (IST - KON)",Trip.sefer5);
        Airplane.ucakListesi.add(cUcak1);
        Airplane cUcak2 = new Airplane("Uçak 2",30,"Gaz","c","5 - (IST - KON)",Trip.sefer5);
        Airplane.ucakListesi.add(cUcak2);
        
        firmaC.vehicles.add(cOtobus1);
        firmaC.vehicles.add(cUcak1);
        firmaC.vehicles.add(cUcak2);
        companies.add(firmaC);
        
        
        Train dTren1 = new Train("Tren 1",25,"Elektrik","d","1 - (IST - KOC - BIL - ESK - ANK)",Trip.sefer1);
        Train.trenListesi.add(dTren1);
        Train dTren2 = new Train("Tren 2",25,"Elektrik","d","2 - (IST - KOC - BIL - ESK - KON)",Trip.sefer2); 
        Train.trenListesi.add(dTren2);
        Train dTren3 = new Train("Tren 2",25,"Elektrik","d","2 - (IST - KOC - BIL - ESK - KON)",Trip.sefer2);
        Train.trenListesi.add(dTren3);
        
        
        firmaD.vehicles.add(dTren2);
        firmaD.vehicles.add(dTren3);
        companies.add(firmaD);
        
        
        Airplane fUcak1 = new Airplane("Uçak 1",30,"Gaz","f","6 - (IST - ANK)",Trip.sefer6);
        Airplane.ucakListesi.add(fUcak1);
        Airplane fUcak2 = new Airplane("Uçak 2",30,"Gaz","f","6 - (IST - ANK)",Trip.sefer6);
        Airplane.ucakListesi.add(fUcak2);
        
        firmaF.vehicles.add(fUcak1);
        firmaF.vehicles.add(fUcak2);
        companies.add(firmaF);
        }   
 }

