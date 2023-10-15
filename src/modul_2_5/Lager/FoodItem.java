package modul_2_5.Lager;

import java.util.ArrayList;
import java.util.Date;

public class FoodItem extends Item{
    private ArrayList<Date> expireDates = new ArrayList<Date>();
    public FoodItem(String name, double price) {
        super(name, price);
    }

}
