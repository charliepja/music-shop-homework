package instruments;

import accessories.string.Strings;

public enum PercussionInstruments {

    // NAME(DifficultyLevel, Sounds, NumberOfKeys, Sticks, Drum)
    PIANO("Hard", "pew pew", 88, 0, false),
    DRUM("Easy", "boom boom", 0, 2, true),
    TRIANGLE("Easy", "ding ding", 0, 1, false);


    private final String difficultyLevel;
    private final String sound;
    private int numberOfKeys;
    private int sticks;
    private boolean drum;

    PercussionInstruments(String difficultyLevel, String sound, int numberOfKeys, int sticks, boolean drum) {
        this.difficultyLevel = difficultyLevel;
        this.sound = sound;
        this.numberOfKeys = numberOfKeys;
        this.sticks = sticks;
        this.drum = drum;
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

    public int getSticks() {
        return this.sticks;
    }

    public boolean isDrum() {
        return this.drum;
    }

    public String getName() {
        return this.name();
    }
}
