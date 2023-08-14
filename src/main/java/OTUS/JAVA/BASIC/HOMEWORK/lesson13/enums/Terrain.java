package otus.java.basic.homework.lesson13.enums;

public enum Terrain {
    DENSE_FOREST("Густой лес"),
    PLAIN("Равнина"),
    SWAMP("Болото");

    private final String description;
    Terrain(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}