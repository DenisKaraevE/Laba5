import org.example.lab3.Iterator.ItemType;
import org.example.lab3.Iterator.TreasureChest;
import org.example.lab3.Iterator.TreasureChestItemIterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class IteratorTest {
    @Test
    public void test(){
        TreasureChest chest = new TreasureChest();
        TreasureChestItemIterator chestIterator = new
                TreasureChestItemIterator (chest, ItemType.POTION);
        assertEquals(chestIterator.next().toString(), "Potion of courage");
        assertEquals(chestIterator.next().toString(), "Potion of wisdom");
        assertEquals(chestIterator.next().toString(), "Potion of blood");
        assertEquals(chestIterator.next().toString(), "Potion of rust");
        assertEquals(chestIterator.next().toString(), "Potion of healing");
    }
}
