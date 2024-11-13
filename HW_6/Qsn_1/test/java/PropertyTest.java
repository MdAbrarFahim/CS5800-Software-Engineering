
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PropertyTest {

    @Test
    public void testPropertyAttributes() {
        Property property = new Property("Arial", "Red", 12);
        assertEquals("Arial", property.getFont(), "The font should match the value provided");
        assertEquals("Red", property.getColor(), "The color should match the value provided");
        assertEquals(12, property.getSize(), "The Size should match the value provided");
    }
}
