package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class StringInstrumentalsTest {
    private StringInstrumentals guitar;
    private StringInstrumentals violin;


    @Before
    public void before() {
        this.guitar = new StringInstrumentals("Harley", "CVR", 8, 200.00, 300.00, StringInstruments.GUITAR);
        this.violin = new StringInstrumentals("Davis", "RVC", 2, 500.00, 700.00, StringInstruments.VIOLIN);
    }

    @Test
    public void canGetName() {
        assertEquals("GUITAR", guitar.getName());
    }

    @Test
    public void canGetMake() {
        assertEquals("Harley", guitar.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("CVR", guitar.getModel());
    }

    @Test
    public void canGetWeight() {
        assertEquals(8, guitar.getWeight());
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(200.00, guitar.getBuyingPrice(), 0.00);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(300.00, guitar.getSellingPrice(), 0.00);
    }

    @Test
    public void canGetDifficultyLevel() {
        assertEquals("Easy", guitar.getDifficultyLevel());
    }

    @Test
    public void canGetSound() {
        assertEquals("rock and roll", guitar.getSound());
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }


    @Test
    public void needsABowFalse() {
        assertFalse(guitar.needsABow());
    }

    @Test
    public void needsABowTrue() {
        assertTrue(violin.needsABow());
    }

    @Test
    public void needsPickFalse() {
        assertFalse(violin.needsAPick());
    }

    @Test
    public void needsAPickTrue() {
        assertTrue(guitar.needsAPick());
    }

    @Test
    public void canPlaySound() {
        assertEquals("A GUITAR makes a rock and roll sound!", guitar.playInstrument());
    }

    @Test
    public void canGetProfit() {
        assertEquals(100.00, guitar.calculateMarkUp(), 0.00);
    }
}
