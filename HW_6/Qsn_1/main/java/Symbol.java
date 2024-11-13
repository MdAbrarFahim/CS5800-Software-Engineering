
public class Symbol {
    private final char character;
    private final Property properties;

    public Symbol(char character, Property properties) {
        this.character = character;
        this.properties = properties;
    }

    public char getCharacter() {
        return character;
    }

    public Property getProperties() {
        return properties;
    }
}
