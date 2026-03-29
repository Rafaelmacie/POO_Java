public class PayrollTest {
    public static void main(String[] args) {
        // Assalariado
        SalariedEmployee salaried = new SalariedEmployee("Rafael", "Nogueira", "123.456.789-00", 800.00);

        // Horista
        HourlyEmployee hourly = new HourlyEmployee("Erlano", "Sousa", "987.654.321-11", 50.00, 45);

        // Comissionado
        CommissionEmployee commission = new CommissionEmployee("Marcos", "Barros", "456.123.789-22", 10000.00, 0.06);

        // Base + Comissionado: 5.000 em vendas, 4% de comissão e 1.200 de base
        BasePlusCommissionEmployee basePlus = new BasePlusCommissionEmployee("Bart", "Simpson", "321.654.987-33",
                5000.00, 0.04, 1200.00);

        Employee[] employees = { salaried, hourly, commission, basePlus };

        System.out.println("Relatório de pagamento semanal:\n");

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee); // Aqui acontece a mágica do toString()
            System.out.printf("Ganho semanal: R$ %.2f%n", currentEmployee.earnings());
            System.out.println();
        }
    }
}