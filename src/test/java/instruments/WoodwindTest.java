package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class WoodwindTest {
    private Woodwind saxophone;
    private Woodwind flute;

    @Before
    public void before() {
        this.saxophone = new Woodwind("Yamaha", "SAX123", 15, 300.00, 400.00, WoodwindInstrument.SAXOPHONE);
        this.flute = new Woodwind("Faeries", "FLUTESLIDE", 3, 200.00, 400.00, WoodwindInstrument.FLUTE);
    }

    @Test
    public void canGetName() {
        assertEquals("SAXOPHONE", saxophone.getName());
    }

    @Test
    public void canGetMake() {
        assertEquals("Yamaha", saxophone.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("SAX123", saxophone.getModel());
    }

    @Test
    public void canGetWeight() {
        assertEquals(15, saxophone.getWeight());
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(300.00, saxophone.getBuyingPrice(), 0.00);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(400.00, saxophone.getSellingPrice(), 0.00);
    }

    @Test
    public void canGetDifficultyLevel() {
        assertEquals("Intermediate", saxophone.getDifficultyLevel());
    }

    @Test
    public void canGetSound() {
        assertEquals("Jazz Hands", saxophone.getSound());
    }

    @Test
    public void canGetNumberOfKeys() {
        assertEquals(23, saxophone.getNumberOfKeys());
    }

    @Test
    public void needsAReedFalse() {
        assertFalse(flute.needsAReed());
    }

    @Test
    public void needsAReedTrue() {
        assertTrue(saxophone.needsAReed());
    }

    @Test
    public void canPlaySound() {
        assertEquals("A SAXOPHONE makes a Jazz Hands sound!", saxophone.playInstrument());
    }

    @Test
    public void canGetProfit() {
        assertEquals(100.00, saxophone.calculateMarkUp(), 0.00);
    }
}
