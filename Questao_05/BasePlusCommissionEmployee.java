public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String cpf, double grossSales,
            double commissionRate, double baseSalary) {
        super(firstName, lastName, cpf, grossSales, commissionRate);
        setBaseSalary(baseSalary);
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Salário base deve ser maior ouigual a 0");
        }
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        // Aproveita o cálculo da comissão da classe pai e soma o base
        return baseSalary + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("Base-Comissionado: \n%s\nSalário Base: R$ %.2f", super.toString(), baseSalary);
    }
}
