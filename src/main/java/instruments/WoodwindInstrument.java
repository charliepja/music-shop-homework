package instruments;

public enum WoodwindInstrument {
    // NAME(DifficultyLevel, Sound, NumberOfKeys, needsAReed)

    SAXOPHONE("Intermediate", "Jazz Hands", 23, true),
    FLUTE("Hard", "fairy tales", 16, false);

    public final String difficultyLevel;
    public final String sound;
    public final int numberOfKeys;
    public final boolean needsAReed;

    WoodwindInstrument(String difficultyLevel, String sound, int numberOfKeys, boolean needsAReed) {
        this.difficultyLevel = difficultyLevel;
        this.sound = sound;
        this.numberOfKeys = numberOfKeys;
        this.needsAReed = needsAReed;
    }

    public String getDifficultyLevel() {
        return this.difficultyLevel;
    }

    public String getSound() {
        return this.sound;
    }

    public int getNumberOfKeys() {
        return this.numberOfKeys;
    }

    public boolean needsAReed() {
        return this.needsAReed;
    }

    public String getName() {
        return this.name();
    }
}
