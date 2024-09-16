class CommissionEmployee extends  Employee{
    private double commissionRate;
    private double grossSales;


    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, Double commissionRate, Double grossSales) {
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public Double getCommissionRate() {
        return commissionRate;
    }



    public Double getGrossSales() {
        return grossSales;
    }


}