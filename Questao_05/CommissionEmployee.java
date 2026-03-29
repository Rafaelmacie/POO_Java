public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String cpf, double grossSales, double commissionRate) {
        super(firstName, lastName, cpf);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() { return grossSales; }
    public double getCommissionRate() { return commissionRate; }

    @Override
    public double earnings() { return commissionRate * grossSales; }

    @Override
    public String toString() {
        return String.format("Comissionado: \n%s\nVendas Brutas: R$ %.2f\nTaxa: %.2f", super.toString(), grossSales, commissionRate);
    }
}
