/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package komputer;

/**
 *
 * @author priat
 */
public interface AppInterface {
    final int ADD_DATA_KOMPUTER = 1;
    final int SEARCH_BY_BRAND = 2;
    final int SEARCH_BY_MOBIL = 3;
    final int EXIT = 4;
    
    public int pilihanMenu();
    public void add();
    public String keyword(String type);
    public Komputer searchByBrand(String Brand);
    public Komputer searchByModel(String Model);
    public void viewData (Komputer k);
    public void exit();
    
    
}
