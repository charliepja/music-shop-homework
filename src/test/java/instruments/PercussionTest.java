package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class PercussionTest {
    private Percussion piano;
    private Percussion drum;

    @Before
    public void before() {
        this.piano = new Percussion("Yamaha", "ClassicV", 200, 2000.00, 3000.00, PercussionInstruments.PIANO);
        this.drum = new Percussion("Rocker", "NirvadaC", 30, 500.00, 600.00, PercussionInstruments.DRUM);
    }

    @Test
    public void canGetName() {
        assertEquals("PIANO", piano.getName());
    }

    @Test
    public void canGetMake() {
        assertEquals("Yamaha", piano.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("ClassicV", piano.getModel());
    }

    @Test
    public void canGetWeight() {
        assertEquals(200, piano.getWeight());
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(2000.00, piano.getBuyingPrice(), 0.00);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(3000.00, piano.getSellingPrice(), 0.00);
    }

    @Test
    public void canGetDifficultyLevel() {
        assertEquals("Hard", piano.getDifficultyLevel());
    }

    @Test
    public void canGetSound() {
        assertEquals("pew pew", piano.getSound());
    }

    @Test
    public void canGetNumberOfKeys() {
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void canGetNumberOfKeysWhenZero() {
        assertEquals(0, drum.getNumberOfKeys());
    }

    @Test
    public void isADrumFalse() {
        assertFalse(piano.isDrum());
    }

    @Test
    public void isADrumTrue() {
        assertTrue(drum.isDrum());
    }

    @Test
    public void canPlaySound() {
        assertEquals("A PIANO makes a pew pew sound!", piano.playInstrument());
    }

    @Test
    public void canGetProfit() {
        assertEquals(1000.00, piano.calculateMarkUp(), 0.00);
    }
}
