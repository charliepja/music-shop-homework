package instruments;

public enum StringInstruments {
    // NAME(DifficultyLevel, Sound, NumberOfStrings, Bow, Pick)
    GUITAR("Easy", "rock and roll", 6, false, true),
    VIOLIN("Intermediate", "screech screech", 4, true, false);

    private final String difficultyLevel;
    private final String sound;
    private final int numberOfStrings;
    private final boolean bow;
    private final boolean pick;

    StringInstruments(String difficultyLevel, String sound, int numberOfStrings, boolean bow, boolean pick) {
        this.difficultyLevel = difficultyLevel;
        this.sound = sound;
        this.numberOfStrings = numberOfStrings;
        this.bow = bow;
        this.pick = pick;
    }

    public String getDifficultyLevel() {
        return this.difficultyLevel;
    }

    public String getSound() {
        return this.sound;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

    public boolean isBow() {
        return this.bow;
    }

    public boolean isPick() {
        return this.pick;
    }

    public String getName() {
        return this.name();
    }
}
