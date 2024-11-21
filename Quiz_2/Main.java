//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        Vehicle car=new Car();
        Vehicle motorcycle=new Motorcycle();
        Vehicle truck=new Truck();

        car.start();
        car.stop();
        motorcycle.start();
        motorcycle.stop();
        truck.start();
        truck.stop();
    }
}