package instruments;

public class Woodwind extends Instrument{
    private WoodwindInstrument instrument;

    public Woodwind(String make, String model, int weight, double buyingPrice, double sellingPrice, WoodwindInstrument instrument) {
        super(make, model, weight, buyingPrice, sellingPrice);
        this.instrument = instrument;
    }

    // getName
    public String getName() {
        return this.instrument.getName();
    }

    // getDifficultyLevel
    public String getDifficultyLevel() {
        return this.instrument.getDifficultyLevel();
    }

    // getSound
    public String getSound() {
        return this.instrument.getSound();
    }

    // getNumberOfKeys
    public int getNumberOfKeys() {
        return this.instrument.getNumberOfKeys();
    }

    // needsAReed
    public boolean needsAReed() {
        return this.instrument.needsAReed();
    }

    @Override
    public String playInstrument() {
        return "A " + getName() + " makes a " + getSound() + " sound!";
    }
}
