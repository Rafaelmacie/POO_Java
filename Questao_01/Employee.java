public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Construtor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }

    // Métodos Getters e Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        // Validação de salário maior que 0
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            throw new IllegalArgumentException("Você não pode dar um salário negativo ou igual a 0 para o funcionário!");
        }
    }

    // Método para calcular o salário anual
    public double getAnnualSalary() {
        return monthlySalary * 12;
    }

    // Método para aplicar aumento
    public void applyRaise(int percentage) {
        // Validação para o aumento ser maior que 0
        if (percentage > 0) {
            double factor = 1 + (percentage / 100.0);
            this.monthlySalary *= factor;
        } else {
            throw new IllegalArgumentException("Você não pode dar um aumento menor ou igual a 0%");
        }
    }
}