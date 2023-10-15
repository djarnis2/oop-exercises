package modul_2_5.Lager;

import java.util.ArrayList;

public class Inventory extends Item{
    private ArrayList<Item> itemList;

    public Inventory() {
        itemList = new ArrayList<>();
    }
    public void addItem(Item item) {
        itemList.add(item);
        System.out.println(item + "added");
    }
    public double getInventoryValue() {
        double sum = 0;
        for (int i = 0; i < itemList.size(); i++) {
            Item myItem = itemList.get(i);
            sum += myItem;

        }
        return sum;
    }

}
