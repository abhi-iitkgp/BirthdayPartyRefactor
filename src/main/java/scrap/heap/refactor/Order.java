package scrap.heap.refactor;

import java.util.ArrayList;
import java.util.List;

public class Order {

    List<SellableItem> items;

    public void addItem(SellableItem item) {
        if (items == null) {
            items = new ArrayList<>();
        }
        items.add(item);
    }

    public Double getCost() {
        Double cost = 0.0;
        for (SellableItem item : items) {
            cost += item.getCost();
        }

        return cost;
    }

    public void checkout() {
        for (SellableItem item : items) {
            item.checkout();
        }
    }
}
