public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String cpf, double weeklySalary) {
        super(firstName, lastName, cpf);
        setWeeklySalary(weeklySalary);
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary < 0 ? 0 : weeklySalary;
    }

    @Override
    public double earnings() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return String.format("Assalariado: \n%s\nSalário Semanal: R$ %.2f", super.toString(), weeklySalary);
    }
}
