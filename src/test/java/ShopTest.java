import accessories.Instruments;
import accessories.Item;
import instruments.Percussion;
import instruments.PercussionInstruments;
import instruments.Woodwind;
import instruments.WoodwindInstrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    private Shop newShop;
    private Item newItem;
    private Woodwind saxophone;
    private Percussion piano;

    @Before
    public void before() {
        this.newShop = new Shop();
        this.newItem = new Item("Reed", "Reed 5 for Saxophone", Instruments.SAXOPHONE, 3.00, 6.00);
        this.saxophone = new Woodwind("Yamaha", "SAX123", 10, 300.00, 400.00, WoodwindInstrument.SAXOPHONE);
        this.piano = new Percussion("Yamaha", "ClassicFM", 200, 2000.00, 3000.00, PercussionInstruments.PIANO);
    }

    @Test
    public void shopStartsEmpty() {
        assertEquals(0, newShop.getSizeOfStock());
    }

    @Test
    public void canAddItem() {
        newShop.addItem(saxophone);
        assertEquals(1, newShop.getSizeOfStock());
    }

    @Test
    public void canRemoveItem() {
        newShop.addItem(saxophone);
        newShop.addItem(piano);
        newShop.addItem(newItem);
        newShop.removeItem(saxophone);
        assertEquals(2, newShop.getSizeOfStock());
    }

    @Test
    public void canGetProjectedProfits() {
        newShop.addItem(saxophone);
        newShop.addItem(piano);
        newShop.addItem(newItem);
        assertEquals(1103.00, newShop.getProjectedProfits(), 0.00);
    }
}
