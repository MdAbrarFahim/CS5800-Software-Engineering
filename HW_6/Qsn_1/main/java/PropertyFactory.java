
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PropertyFactory {
    private static final Map<String, Property> propertiesCache = new ConcurrentHashMap<>();

    public static Property createProperties(String font, String color, int size) {
        String key = font + color + size;
        return propertiesCache.computeIfAbsent(key, k -> new Property(font, color, size));
    }
}
