public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String cpf, double grossSales, double commissionRate) {
        super(firstName, lastName, cpf);
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    public void setGrossSales(double grossSales) {
        if (grossSales <- 0.0) {
            throw new IllegalArgumentException("Vendas brutas devem maiores que 0");
        }
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("A taxa de comissão deve estar entre 0 e 1");
        }
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public double earnings() {
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        return String.format("Comissionado: \n%s\nVendas Brutas: R$ %.2f\nTaxa: %.2f", super.toString(), grossSales,
                commissionRate);
    }
}
