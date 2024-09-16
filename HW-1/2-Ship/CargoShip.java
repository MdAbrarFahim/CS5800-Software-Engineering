public class CargoShip extends Ship {
    private int cargoCap;

    public CargoShip(String shipName, String builtYear, int cargoCap) {
        super(shipName, builtYear);
        this.cargoCap = cargoCap;
    }

    @Override
    public void print() {
        System.out.print("Ship type: CargoShip");
        System.out.println(";  Name: " + this.getShipName() +
                ";  Built year: " + this.getBuiltYear() + ";  Cargo capacity: " + this.cargoCap + " metric tonnes.");
    }

}
