package proglabproje2;

import javax.swing.JOptionPane;

public class Admin{

    public boolean adminLogin(String kullaniciAdi, String sifre) {
        return kullaniciAdi.equals("admin") && sifre.equals("admin");
    }

    public void firmaEkle(String companyName, String password, boolean otobusSecili, boolean trenSecili, boolean ucakSecili) {
    for (Company company : Main.companies) {
        if (company.getCompanyName().equals(companyName)) {
            JOptionPane.showMessageDialog(null, "Aynı isme sahip bir firma zaten mevcut!");
            return;
        }
    }

    Company newCompany = new Company(companyName, password);

    if (otobusSecili) {
        newCompany.setOtobus(true);
    }
    if (trenSecili) {
        newCompany.setTren(true);
    }
    if (ucakSecili) {
        newCompany.setUcak(true);
    }

    Main.companies.add(newCompany);
}


    public boolean firmaVarMi(String companyName) {
        for (Company company : Main.companies) {
            if (company.getCompanyName().equals(companyName)) {
                return true;
            }
        }
        return false;
    }

    public boolean firmaSil(String companyName, String password) {
    Company foundCompany = null;
    for (Company company : Main.companies) {
        if (company.getCompanyName().equals(companyName)) {
            foundCompany = company;
            break;
        }
    }

    if (foundCompany != null && foundCompany.checkPassword(password)) {
        Main.companies.remove(foundCompany);
        return true;
    } else {
        return false;
    }
}
}