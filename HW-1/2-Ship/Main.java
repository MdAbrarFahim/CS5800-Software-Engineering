import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Ship> shipList = new ArrayList<>();

        shipList.add(new Ship("BNS Bangabandhu", "1998"));
        shipList.add(new CargoShip("BNS Shadhinota", "2012", 33000));
        shipList.add(new CruiseShip("BNS Bijoy", "1981", 180));

        shipList.forEach(Ship::print);
    }

}
