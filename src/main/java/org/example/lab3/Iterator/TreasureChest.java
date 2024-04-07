package org.example.lab3.Iterator;

import java.util.ArrayList;

public class TreasureChest {
    private final ArrayList<Item> items;

    /**
     * Constructor.
     */
    public TreasureChest() {
        /*items = ArrayList.of(
                new Item(ItemType.POTION, "Potion of courage"),
                new Item(ItemType.RING, "Ring of shadows"),
                new Item(ItemType.POTION, "Potion of wisdom"),
                new Item(ItemType.POTION, "Potion of blood"),
                new Item(ItemType.WEAPON, "Sword of silver +1"),
                new Item(ItemType.POTION, "Potion of rust"),
                new Item(ItemType.POTION, "Potion of healing"),
                new Item(ItemType.RING, "Ring of armor"),
                new Item(ItemType.WEAPON, "Steel halberd"),
                new Item(ItemType.WEAPON, "Dagger of poison")
        );*/

        ArrayList<Item> tempList = new ArrayList();
        tempList.add(new Item(ItemType.POTION, "Potion of courage"));
        tempList.add(new Item(ItemType.RING, "Ring of shadows"));
        tempList.add(new Item(ItemType.POTION, "Potion of wisdom"));
        tempList.add(new Item(ItemType.POTION, "Potion of blood"));
        tempList.add(new Item(ItemType.WEAPON, "Sword of silver +1"));
        tempList.add(new Item(ItemType.POTION, "Potion of rust"));
        tempList.add(new Item(ItemType.POTION, "Potion of healing"));
        tempList.add(new Item(ItemType.RING, "Ring of armor"));
        tempList.add(new Item(ItemType.WEAPON, "Steel halberd"));
        tempList.add(new Item(ItemType.WEAPON, "Dagger of poison"));

        items = tempList;

    }

    public Iterator<Item> iterator(ItemType itemType) {
        return new TreasureChestItemIterator(this, itemType);
    }

    /**
     * Get all items.
     */
    public ArrayList<Item> getItems() {
        return new ArrayList<>(items);
    }
}
