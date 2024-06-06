public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Item mission_1_item = new Item("Złoto");
        Item mission_2_item = new Item("Srebro");
        Mission mission_1 = new Mission(inventory, mission_1_item, 5);
        Mission mission_2 = new Mission(inventory, mission_2_item, 3);

        inventory.pickupItem(mission_1_item);
        inventory.pickupItem(mission_1_item);
        inventory.pickupItem(mission_1_item);
        inventory.pickupItem(mission_1_item);
        inventory.pickupItem(mission_1_item);
        inventory.pickupItem(mission_2_item);
        inventory.pickupItem(mission_2_item);
        inventory.pickupItem(mission_2_item);
    }
}