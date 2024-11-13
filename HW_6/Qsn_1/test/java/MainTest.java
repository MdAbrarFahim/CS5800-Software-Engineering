//import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    
    @Test
    public void testMainFunctionality() {
        assertDoesNotThrow(() ->
                Main.main(new String[]{}), "The main methods should execute without throwing exception");
    }
}
