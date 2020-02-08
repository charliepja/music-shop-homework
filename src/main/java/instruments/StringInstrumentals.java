package instruments;


public class StringInstrumentals extends Instrument{
    private StringInstruments instrument;

    public StringInstrumentals(String make, String model, int weight, double buyingPrice, double sellingPrice, StringInstruments instrument) {
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

    // getNumberOfStrings
    public int getNumberOfStrings() {
        return this.instrument.getNumberOfStrings();
    }

    // needsABow
    public boolean needsABow() {
        return this.instrument.isBow();
    }

    // needsAPick
    public boolean needsAPick() {
        return this.instrument.isPick();
    }

    @Override
    public String playInstrument() {
        return "A " + getName() + " makes a " + getSound() + " sound!";
    }
}
