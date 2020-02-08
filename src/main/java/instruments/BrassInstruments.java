package instruments;

import accessories.string.Strings;

public enum BrassInstruments {
    // NAME(DifficultyLevel, Sound, Number_Of_Valves, Slider)
    TRUMPET("Easy", "Fart", 3, false),
    FRENCH_HORN("Intermediate", "Fart Fart", 4, false),
    TROMBONE("Hard", "Fart Fart Fart", 0, true);

    private final String difficultyLevel;
    private final String sound;
    private final int numberOfValves;
    private boolean slider;

    BrassInstruments(String difficultyLevel, String sound, int numberOfValves, boolean slider) {
        this.difficultyLevel = difficultyLevel;
        this.sound = sound;
        this.numberOfValves = numberOfValves;
        this.slider = slider;
    }

    public String getDifficultyLevel() {
        return this.difficultyLevel;
    }

    public String getSound() {
        return this.sound;
    }

    public int getNumberOfValves() {
        return this.numberOfValves;
    }

    public boolean isSlider() {
        return this.slider;
    }

    public String getName() {
        return this.name();
    }
}
