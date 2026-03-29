public class SavingsAccount {
    private static double annualInterestRate = 0.0;
    private double savingsBalance;

    public SavingsAccount(double balance) {
        this.savingsBalance = balance;
    }

    // Método para calcular o rendimento mensal e atualizar o saldo
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        this.savingsBalance += monthlyInterest;
    }

    // Método estático para alterar a taxa de todos os correntistas
    public static void modifyInterestRate(double newRate) {
        if (newRate >= 0) {
            annualInterestRate = newRate;
        } else {
            throw new IllegalArgumentException("A taxa de rendimentos não pode ser negativa");
        }
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
}