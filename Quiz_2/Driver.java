public class Driver {

    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();


        light.addObserver(new RunningVehicle());


        light.lightChange();
        light.lightChange();
    }


}