
public class Main {
    public static void main(String[] args) {
        TextDocument textDoc = new TextDocument();

        textDoc.addSymbol('F', PropertyFactory.createProperties("Arial", "Black", 12));
        textDoc.addSymbol('e', PropertyFactory.createProperties("Arial", "Black", 14));
        textDoc.addSymbol('l', PropertyFactory.createProperties("Verdana", "Red", 16));
        textDoc.addSymbol('l', PropertyFactory.createProperties("Calibri", "Black", 16));
        textDoc.addSymbol('o', PropertyFactory.createProperties("Arial", "Black", 14));
        textDoc.addSymbol('W', PropertyFactory.createProperties("Verdana", "Red", 12));
        textDoc.addSymbol('o', PropertyFactory.createProperties("Verdana", "Black", 16));
        textDoc.addSymbol('r', PropertyFactory.createProperties("Calibri", "Blue", 14));
        textDoc.addSymbol('l', PropertyFactory.createProperties("Verdana", "Red", 12));
        textDoc.addSymbol('d', PropertyFactory.createProperties("Calibri", "Black", 16));
        textDoc.addSymbol('C', PropertyFactory.createProperties("Arial", "Black", 12));
        textDoc.addSymbol('S', PropertyFactory.createProperties("Calibri", "Red", 14));
        textDoc.addSymbol('5', PropertyFactory.createProperties("Arial", "Red", 16));
        textDoc.addSymbol('7', PropertyFactory.createProperties("Calibri", "Blue", 16));
        textDoc.addSymbol('0', PropertyFactory.createProperties("Verdana", "Black", 12));
        textDoc.addSymbol('0', PropertyFactory.createProperties("Arial", "Red", 12));

        System.out.println();
        System.out.println("Original Text:");
        System.out.println(textDoc.generateText());
        
        textDoc.modifySymbol(0, 'H', PropertyFactory.createProperties("Calibri", "Red", 16));
        System.out.println("Modified Text (Edit 1):");
        System.out.println(textDoc.generateText());
        textDoc.saveToFile("output.txt");

        System.out.println();
        System.out.println("Text loaded from output.txt:");
        textDoc.loadFromFile("output.txt");
        System.out.println(textDoc.generateText());

        textDoc.modifySymbol(13, '8', PropertyFactory.createProperties("Arial", "Red", 22));
        System.out.println("Modified Text (Edit 2):");
        System.out.println(textDoc.generateText());

        textDoc.saveToFile("output.txt");
    }
}
