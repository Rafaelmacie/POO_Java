public class SavingsTest {
    public static void main(String[] args) {
        // Instanciando os dois objetos
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        // Teste 1: Taxa de 4%
        SavingsAccount.modifyInterestRate(0.04);
        System.out.println("Simulando 12 meses a 4% de taxa de rendimentos:");
        
        for (int month = 1; month <= 12; month++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }
        
        System.out.printf("Saldo final Saver 1: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saldo final Saver 2: $%.2f%n", saver2.getSavingsBalance());

        // Teste 2: Taxa de 5%
        SavingsAccount.modifyInterestRate(0.05);
        System.out.println("\nSimulando mais 1 mês a 5% de taxa de rendimentos:");
        
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("Saldo atualizado Saver 1: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saldo atualizado Saver 2: $%.2f%n", saver2.getSavingsBalance());
    }
}
