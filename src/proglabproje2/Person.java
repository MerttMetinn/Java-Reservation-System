
package proglabproje2;

import java.util.ArrayList;

public class Person {
    private String Ad;
    private String Soyad;
    private ArrayList<String> selectedItems = new ArrayList<>();
   
    public String getAd() {
        return Ad;
    }

    public void setAd(String Ad) {
        this.Ad = Ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String Soyad) {
        this.Soyad = Soyad;
    }

    public Person() {     
    }
    
    public void addItem(String item) {
     selectedItems.add(item);
  }

  public String getItem(int index) {
     return selectedItems.get(index);
  }

   public int getItemCount() {
       return selectedItems.size();
   }
   
}
