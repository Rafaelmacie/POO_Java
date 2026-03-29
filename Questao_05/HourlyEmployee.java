public class HourlyEmployee extends Employee {
    private double wage; // valor por hora
    private double hours; // horas trabalhadas

    public HourlyEmployee(String firstName, String lastName, String cpf, double wage, double hours) {
        super(firstName, lastName, cpf);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double earnings() {
        if (hours <= 40)
            return wage * hours;
        else
            return (40 * wage) + ((hours - 40) * wage * 1.5);
    }

    @Override
    public String toString() {
        return String.format("Horista: \n%s\nGanho por hora: R$ %.2f\nHoras: %.2f", super.toString(), wage, hours);
    }
}
