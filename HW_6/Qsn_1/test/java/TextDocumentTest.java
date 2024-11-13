
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Paths;

public class TextDocumentTest {
    private TextDocument textDoc;

    @BeforeEach
    public void setUp() {
        textDoc = new TextDocument();
    }

    @Test
    public void testAddSymbol() {
        textDoc.addSymbol('A', PropertyFactory.createProperties("Arial", "Red", 12));
        assertEquals("A", textDoc.generateText(), "The text should match the symbol added");
    }

    @Test
    public void testModifySymbol() {
        textDoc.addSymbol('A', PropertyFactory.createProperties("Arial", "Red", 12));
        textDoc.modifySymbol(0, 'B', PropertyFactory.createProperties("Verdana", "Blue", 14));
        assertEquals("B", textDoc.generateText(), "The text should reflect the symbol modified");
    }

    @Test
    public void testSaveAndLoadFromFile() throws Exception {
        textDoc.addSymbol('C', PropertyFactory.createProperties("Calibri", "Black", 16));
        String filePath = "test_output.txt";
        textDoc.saveToFile(filePath);

        TextDocument loadedDoc = new TextDocument();
        loadedDoc.loadFromFile(filePath);
        assertEquals("C", loadedDoc.generateText(), "The loaded text should match the text saved");

        Files.deleteIfExists(Paths.get(filePath));
    }

    @Test
    public void testEmptyDocument() {
        assertEquals("", textDoc.generateText(), "The empty document should return a empty string");
    }
}
