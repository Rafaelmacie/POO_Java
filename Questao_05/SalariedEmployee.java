public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String cpf, double weeklySalary) {
        super(firstName, lastName, cpf);
        setWeeklySalary(weeklySalary);
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Salário semanal deve ser maior ou igual a 0");
        }
        this.weeklySalary = weeklySalary;
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
