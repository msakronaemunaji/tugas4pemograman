/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package komputer;

import javax.swing.JOptionPane;
import komputer.DataKomputer;
/**
 *
 * @author LENOVO
 */
public class Tes {
    public static void main (String[] args) {
        DataKomputer data = new DataKomputer();
        do {
            int p = data.PilihanMenu();
            switch (p) {
                case AppInterface.ADD_DATA_KOMPUTER:
                    data.add();
                    break;
                case AppInterface.SEARCH_BY_BRAND:
                    String key = data.keyword("brand");
                    Komputer k = data.SearchByBrand(key);
                    data.viewData(k);
                    break;
                case AppInterface.SEARCH_BY_MODEL:
                    key = data.keyword("model");
                    k = data.SearchByModel(key);
                    data.viewData(k);
                    break;
                case AppInterface.EXIT:
                    data.exit();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Pilihan Salah");
                    break;
            }
        } while (true);
    }
    
}
