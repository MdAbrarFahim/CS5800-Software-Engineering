
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextDocument {
    private List<Symbol> textSymbols = new ArrayList<>();

    public void addSymbol(char character, Property properties) {
        textSymbols.add(new Symbol(character, properties));
    }

    public void modifySymbol(int index, char character, Property properties) {
        textSymbols.set(index, new Symbol(character, properties));
        System.out.println();
        System.out.println("Modified symbol at index " + index);
    }

    public String generateText() {
        StringBuilder textBuilder = new StringBuilder();
        for (Symbol symbol : textSymbols) {
            textBuilder.append(symbol.getCharacter());
        }
        return textBuilder.toString();
    }

    public void saveToFile(String path) {
        try (FileWriter writer = new FileWriter(path)) {
            for (Symbol symbol : textSymbols) {
                Property props = symbol.getProperties();
                writer.write(symbol.getCharacter() + ", " + props.getFont() + ", " + props.getColor() + ", " + props.getSize() + "\n");
            }
        } catch (IOException e) {
            System.out.println("The file has errors");
            e.printStackTrace();
        }
    }

    public void loadFromFile(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            textSymbols.clear();
            while ((line = reader.readLine()) != null) {
                String[] components = line.split(",");
                if (components.length == 4) {
                    char character = components[0].trim().charAt(0);
                    String font = components[1].trim();
                    String color = components[2].trim();
                    int size = Integer.parseInt(components[3].trim());
                    addSymbol(character, PropertyFactory.createProperties(font, color, size));
                }
            }
        } catch (IOException e) {
            System.out.println("The file has errors");
            e.printStackTrace();
        }
    }
}
