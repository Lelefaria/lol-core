package core;

import java.util.ArrayList;

public class Inventory {
    private int capacity = 6;
    private ArrayList<Item> items;

    public Inventory() {
        this.items = new ArrayList<Item>(capacity);
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void insertItem(Item item) {
        if (items.size() < 6) {
            items.add(item);
            return;
        }

        System.out.println(
                "Você está com o inventário cheio! Venda um item para adicionar esse novo item no inventário.");
    }
}
