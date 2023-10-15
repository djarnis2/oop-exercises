package modul_2_5.Lager;

import java.util.ArrayList;
import java.util.Arrays;

public class NonfoodItem {
    private ArrayList<Item> materials;
    public NonfoodItem(String name, double price) {
        super();
    }
    @Override
    public String toString() {
        return "NonFoodItem{" + super.toString() +
                "materials" + Arrays.toString(materials) +
                '}';
    }
}
