public class RunningVehicle implements TrafficLightObserver {

    @Override
    public void updateTrafficLights(LightColor currentLightColor) {
        if(currentLightColor.equals(LightColor.Yellow)) {
            System.out.println("All vehicles prepare to stop");
        }
        else if(currentLightColor.equals(LightColor.Red)) {
            System.out.println();
            System.out.println("All running vehicles Stop");
        }

            System.out.println();
            System.out.println("All vehicles go");

    }
}