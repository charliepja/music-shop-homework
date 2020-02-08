package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BrassTest {
    private Brass trumpet;
    private Brass trombone;

    @Before
    public void before() {
        this.trumpet = new Brass("Yamaha", "TRU12V", 10, 250.00, 300.00, BrassInstruments.TRUMPET);
        this.trombone = new Brass("Yamaha", "TROMB34", 9, 300.00, 400.00, BrassInstruments.TROMBONE);
    }

    @Test
    public void canGetName() {
        assertEquals("TRUMPET", trumpet.getName());
    }

    @Test
    public void canGetMake() {
        assertEquals("Yamaha", trumpet.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("TRU12V", trumpet.getModel());
    }

    @Test
    public void canGetWeight() {
        assertEquals(10, trumpet.getWeight());
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(250.00, trumpet.getBuyingPrice(), 0.00);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(300.00, trumpet.getSellingPrice(), 0.00);
    }

    @Test
    public void canGetDifficultyLevel() {
        assertEquals("Easy", trumpet.getDifficultyLevel());
    }

    @Test
    public void canGetSound() {
        assertEquals("Fart", trumpet.getSound());
    }

    @Test
    public void canGetNumberOfValves() {
        assertEquals(3, trumpet.getNumberOfValves());
    }

    @Test
    public void canGetNumberOfValvesWhenZero() {
        assertEquals(0, trombone.getNumberOfValves());
    }

    @Test
    public void isASliderFalse() {
        assertFalse(trumpet.hasSlider());
    }

    @Test
    public void isASliderTrue() {
        assertTrue(trombone.hasSlider());
    }

    @Test
    public void canPlaySound() {
        assertEquals("A TRUMPET makes a Fart sound!", trumpet.playInstrument());
    }

    @Test
    public void canGetProfit() {
        assertEquals(50.00, trumpet.calculateMarkUp(), 0.00);
    }

}
