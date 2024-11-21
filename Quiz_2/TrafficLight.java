import java.util.ArrayList;
import java.util.List;

public class TrafficLight {

    private LightColor lightType;
    private final List<TrafficLightObserver> observers;

    public TrafficLight() {
        super();
        observers = new ArrayList<>();
        lightType = LightColor.Green;
        System.out.println("Light is Green. GO!!!!!.");
    }


    public void addObserver(TrafficLightObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(TrafficLightObserver observer) {
        observers.remove(observer);
    }
    private void notifyObservers() {
        observers.forEach(observer->observer.updateTrafficLights(lightType));
    }

    public void lightChange() {
        LightColor[] enumValues = LightColor.values();
        lightType = enumValues[(lightType.ordinal() + 1)];
        System.out.println("Light chagesd in " + lightType);
        notifyObservers();
    }
}