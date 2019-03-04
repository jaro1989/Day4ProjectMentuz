package by.javatr.task3.util;

import java.util.ArrayList;

public class Basket {
    private ArrayList<ItemInterface> items = new ArrayList<ItemInterface>();

    /**
     * @param item ItemInterface
     */
    public void putItem(ItemInterface item) {
        this.items.add(item);
    }

    /**
     * @return int
     */
    public int getItemsWeight() {
        int basketWeight = 0;
        for (int i = 0; i < items.size(); i++){
            basketWeight +=items.get(i).getWeight();
        }
        return basketWeight;
    }

    /**
     * @return int
     */
    public int getBlueItems() {
        int count = 0;
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getColor().equals("blue")) {
                count++;
            }
        }
        return count;
    }
}
