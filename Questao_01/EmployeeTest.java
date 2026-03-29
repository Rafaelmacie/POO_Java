public class EmployeeTest {
    public static void main(String[] args) {
        // Instanciando dois objetos Employee
        Employee emp1 = new Employee("Rafael", "Nogueira", 5000.00);
        Employee emp2 = new Employee("Erlano", "Sousa", 3000.00);

        // Exibindo o salário anual inicial
        System.out.println("\nSalários anuais iniciais: \n");
        System.out.printf("%s %s: R$ %.2f%n", emp1.getFirstName(), emp1.getLastName(), emp1.getAnnualSalary());
        System.out.printf("%s %s: R$ %.2f%n", emp2.getFirstName(), emp2.getLastName(), emp2.getAnnualSalary());

        // Aplicando aumento de 10%
        emp1.applyRaise(10);
        emp2.applyRaise(10);

        System.out.println("\n\nSalários anuais com 10% de aumento: \n");
        System.out.printf("%s %s: R$ %.2f%n", emp1.getFirstName(), emp1.getLastName(), emp1.getAnnualSalary());
        System.out.printf("%s %s: R$ %.2f%n", emp2.getFirstName(), emp2.getLastName(), emp2.getAnnualSalary());
    }
}
