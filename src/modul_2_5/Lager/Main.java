package modul_2_5.Lager;

public class Main {
    public static void main(String[] args) {
        Item item = new Item("Apple", 2.35);

        Inventory inventory = new Inventory();


        System.out.println(item.getName());
        System.out.println(item.getPrice());
        inventory.addItem(item);
    }
}
