package frontend;
import backend.*;

public class TestBackend {
    public static void main(String[] args) {
        menu_makanan makanan1 = new menu_makanan("ayam crispy", "crispy.jpg", 15000);
        menu_makanan makanan2 = new menu_makanan("ayam goang", "goang.jpg", 15000);
        menu_makanan makanan3 = new menu_makanan("ayam bakar", "bakar.jpg", 15000);
        
        
        makanan1.save();
        makanan2.save();
        makanan3.save();
        
        makanan2.setNama_menu("bebek");
        makanan2.save();
        
        for(menu m : new menu().getAll())
        {
            System.out.println("Nama: " + m.getNama_menu() + ",image: " + m.getImage() +", harga: "+ m.getHarga());
        }
        
        for(menu m : new menu().search("ayam goang"))
        {
            System.out.println("Nama: " +m.getNama_menu() + m.getImage() + ", harga: " + m.getHarga);
        }
    }
    
}
