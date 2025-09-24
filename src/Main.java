public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Item item = new Item( "Generic Item",  45);
//        Fruit fruit = new Fruit("Embe",10,"Embe dodo");
//        Weapon weapon = new Weapon("ShotGun",2, 89,"Winchester");

        inventory.addItem(item);
        inventory.addItem("Embe",10,"Embe dodo");
        inventory.addItem("ShotGun",2, 89,"Winchester");
        inventory.displayInventory();

    }
}