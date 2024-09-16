public class CruiseShip extends Ship {
    private int maxCapacity;

    public CruiseShip(String shipName, String builtYear, int maxCapacity) {
        super(shipName, builtYear);
        this.maxCapacity = maxCapacity;
    }


    @Override
    public void print() {
        System.out.print("Ship type: CruiseShip");
        System.out.println(";  Name: " + this.getShipName() +
                ";  Built year: " + this.getBuiltYear() + ";  Maximum passenger occupancy capacity: " + this.maxCapacity + ".");
    }

}
