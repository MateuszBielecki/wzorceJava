import java.util.ArrayList;
import java.util.List;

public class Mission implements Observer {
    private Subject inventory;
    private Item required_item;
    private int required_item_quantity;

    public Mission(Subject inventory, Item item, Integer required_item_quantity) {
        this.inventory = inventory;
        this.required_item = item;
        this.required_item_quantity = required_item_quantity;
        inventory.registerMission(this);
    }

    public String getItemName(){
        return this.required_item.name;
    }

    @Override
    public void update(ArrayList<Item> items) {
        long count = items.stream().filter(p -> p.equals(required_item)).count();
        if (count >= this.required_item_quantity) {
            System.out.println("Misja zakończona: Zebrano odpowiednią ilość " + getItemName() + "!");
            this.inventory.removeMission(this);
        }
    }
}