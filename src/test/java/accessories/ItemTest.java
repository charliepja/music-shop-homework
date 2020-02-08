package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {
    private Item newItem;

    @Before
    public void before() {
        this.newItem = new Item("Reed", "Reed 5 for Saxophone", Instruments.SAXOPHONE, 3.00, 6.00);
    }

    @Test
    public void canGetItemName() {
        assertEquals("Reed", newItem.getItemName());
    }

    @Test
    public void canGetItemDescription() {
        assertEquals("Reed 5 for Saxophone", newItem.getItemDescription());
    }

    @Test
    public void canGetIntendedItem() {
        assertEquals("SAXOPHONE", newItem.getIntendedInstrument());
    }

    @Test
    public void canGetBoughtPrice() {
        assertEquals(3.00, newItem.getBoughtPrice(), 0.00);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(6.00, newItem.getSellingPrice(), 0.00);
    }

    @Test
    public void canSetSellingPrice() {
        newItem.setSellingPrice(7.00);
        assertEquals(7.00, newItem.getSellingPrice(), 0.00);
    }

    @Test
    public void canGetProfit() {
        assertEquals(3.00, newItem.calculateMarkUp(), 0.00);
    }
}
