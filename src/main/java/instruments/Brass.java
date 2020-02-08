package instruments;

public class Brass extends Instrument {
    private BrassInstruments brassInstrument;

    public Brass(String make, String model, int weight, double buyingPrice, double sellingPrice, BrassInstruments brassInstrument) {
        super(make, model, weight, buyingPrice, sellingPrice);
        this.brassInstrument = brassInstrument;
    }

    // getName
    public String getName() {
        return this.brassInstrument.getName();
    }

    // getNumberOfValves
    public int getNumberOfValves() {
        return this.brassInstrument.getNumberOfValves();
    }

    // getSound
    public String getSound() {
        return this.brassInstrument.getSound();
    }

    // getDifficultyLevel
    public String getDifficultyLevel() {
        return this.brassInstrument.getDifficultyLevel();
    }

    // hasSlider
    public boolean hasSlider() {
        return this.brassInstrument.isSlider();
    }

    @Override
    public String playInstrument() {
        return "A " + getName() + " makes a " + getSound() + " sound!";
    }
}
