public class DateTest {
    public static void main(String[] args) {
        System.out.println("Iniciando testes da classe Date:");

        // 1. Teste de Data Válida
        try {
            Date dataValida = new Date(31, 1, 2024);
            System.out.print("Teste 1 (Data Válida): ");
            dataValida.displayDate();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro inesperado no Teste 1: " + e.getMessage());
        }

        // 2. Teste de Data Válida (Mês com 30 dias)
        try {
            Date data30Dias = new Date(30, 4, 2024);
            System.out.print("Teste 2 (Abril 30 dias): ");
            data30Dias.displayDate();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro inesperado no Teste 2: " + e.getMessage());
        }

        // 3. Teste de Erro: Abril com 31 dias
        try {
            System.out.print("Teste 3 (Tentando Abril com 31): ");
            Date dataInvalida = new Date(31, 4, 2024);
            dataInvalida.displayDate();
        } catch (IllegalArgumentException e) {
            System.out.println("O sistema impediu a data, pois " + e.getMessage());
        }

        // 4. Teste de Erro: Fevereiro com 30 dias
        try {
            System.out.print("Teste 4 (Tentando Fevereiro com 30): ");
            Date fevInvalido = new Date(30, 2, 2024);
            fevInvalido.displayDate();
        } catch (IllegalArgumentException e) {
            System.out.println("O sistema impediu a data, pois " + e.getMessage());
        }

        // 5. Teste de Erro: Mês inexistente
        try {
            System.out.print("Teste 5 (Tentando Mês 13): ");
            Date mesInexistente = new Date(10, 13, 2024);
            mesInexistente.displayDate();
        } catch (IllegalArgumentException e) {
            System.out.println("O sistema impediu a data, pois " + e.getMessage());
        }
    }
}