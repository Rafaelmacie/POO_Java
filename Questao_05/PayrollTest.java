public class PayrollTest {
    public static void main(String[] args) {
        // Assalariado
        SalariedEmployee salaried = new SalariedEmployee("Rafael", "Nogueira", "123.456.789-00", 800.00);

        // Horista
        HourlyEmployee hourly = new HourlyEmployee("Erlano", "Sousa", "987.654.321-11", 50.00, 45);

        // Comissionado
        CommissionEmployee commission = new CommissionEmployee("Marcos", "Barros", "456.123.789-22", 10000.00, 0.06);

        // Base + Comissionado: 5.000 em vendas, 4% de comissão e 1.200 de base
        BasePlusCommissionEmployee basePlus = new BasePlusCommissionEmployee("Davi", "Nascimento", "321.654.987-33",
                5000.00, 0.04, 1200.00);

        Employee[] employees = { salaried, hourly, commission, basePlus };

        System.out.println("Relatório de pagamento semanal:\n");

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            System.out.printf("Ganho semanal: R$ %.2f%n", currentEmployee.earnings());
            System.out.println();
        }

        // Teste de Horas Inválidas (Mais que 168h numa semana)
        try {
            System.out.print("Tentando criar horista com 200 horas - ");
            new HourlyEmployee("Erro", "Horas", "000", 50.0, 200.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Bloqueado: " + e.getMessage());
            System.out.println();
        }

        // Teste de Salário Negativo
        try {
            System.out.print("Tentando criar assalariado com salário negativo - ");
            new SalariedEmployee("Erro", "Salario", "000", -150.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Bloqueado: " + e.getMessage());
            System.out.println();
        }

        // Teste de Taxa de Comissão Abusiva (Acima de 100%)
        try {
            System.out.print("Tentando criar comissionado com taxa de 1.2 - ");
            new CommissionEmployee("Erro", "Taxa", "000", 1000.0, 1.2);
        } catch (IllegalArgumentException e) {
            System.out.println("Bloqueado: " + e.getMessage());
            System.out.println();
        }

        // Teste de Alteração via Setter (Tentando zerar o salário base depois de criado)
        try {
            System.out.print("Tentando alterar salário base do Davi para valor negativo - ");
            basePlus.setBaseSalary(-1.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Bloqueado: " + e.getMessage());
            System.out.println();
        }
    }
}