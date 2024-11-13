
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PropertyFactoryTest {

    @Test
    public void testCreatePropertiesCaching() {
        Property first = PropertyFactory.createProperties("Arial", "Red", 12);
        Property second = PropertyFactory.createProperties("Arial", "Red", 12);
        assertSame(first, second, "The factory files should return the same instance for identical entries");
    }

    @Test
    public void testCreateDifferentProperties() {
        Property first = PropertyFactory.createProperties("Arial", "Red", 12);
        Property second = PropertyFactory.createProperties("Verdana", "Blue", 14);
        assertNotSame(first, second, "The factory files should return different instances for different entries");
    }
}
