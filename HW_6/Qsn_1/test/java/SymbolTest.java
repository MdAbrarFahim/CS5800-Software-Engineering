
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SymbolTest {

    @Test
    public void testSymbolAttributes() {
        Property property = new Property("Arial", "Red", 12);
        Symbol symbol = new Symbol('A', property);

        assertEquals('A', symbol.getCharacter(), "The character should match the0 value provided");
        assertEquals(property, symbol.getProperties(), "The properties should match the instance provided");
    }
}
