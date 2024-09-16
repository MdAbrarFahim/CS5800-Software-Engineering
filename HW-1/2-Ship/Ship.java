public class Ship {
    private String shipName;
    private String builtYear;

    public Ship(String shipName, String builtYear) {
        this.shipName = shipName;
        this.builtYear = builtYear;
    }

    public String getBuiltYear() {
        return builtYear;
    }
    public String getShipName() {
        return shipName;
    }
    public void print() {
        System.out.println("Name: " + shipName + ";  Built year: " + builtYear);
    }

}
