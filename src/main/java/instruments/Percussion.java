package instruments;

public class Percussion extends Instrument{
    private PercussionInstruments percussionInstrument;

    public Percussion(String make, String model, int weight, double buyingPrice, double sellingPrice, PercussionInstruments percussionInstrument) {
        super(make, model, weight, buyingPrice, sellingPrice);
        this.percussionInstrument = percussionInstrument;
    }

    // getName()
    public String getName() {
        return this.percussionInstrument.getName();
    }

    // getDifficultyLevel()
    public String getDifficultyLevel() {
        return this.percussionInstrument.getDifficultyLevel();
    }

    // getSound()
    public String getSound() {
        return this.percussionInstrument.getSound();
    }

    // getNumberOfKeys()
    public int getNumberOfKeys() {
        return this.percussionInstrument.getNumberOfKeys();
    }

    // getNumberOfSticks()
    public int getNumberOfSticks() {
        return this.percussionInstrument.getSticks();
    }

    // isDrum()
    public boolean isDrum() {
        return this.percussionInstrument.isDrum();
    }

    @Override
    public String playInstrument() {
        return "A " + getName() + " makes a " + getSound() + " sound!";
    }
}
