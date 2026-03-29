public class QuadrilateralTest {
    public static void main(String[] args) {

        // 1. Teste do trapézio
        System.out.println("Tentativa de trapézio:");
        try {
            // Base inferior: 10, Base superior: 6, Altura: 5
            Trapezoid trap = new Trapezoid(
                    new Point(0, 0), new Point(10, 0),
                    new Point(8, 5), new Point(2, 5));
            System.out.printf("Trapézio criado com sucesso. Área: %.2f%n", trap.getArea());
            System.out.println();
        } catch (Exception e) {
            System.out.println("Trapézio com erro -> " + e.getMessage());
            System.out.println();
        }

        // 2. Teste do parelelogramo
        System.out.println("Tentativa de parelogramo:");
        try {
            // Base: 6, Altura: 5 (ponto p3 deslocado em X para inclinação)
            Parallelogram para = new Parallelogram(
                    new Point(5, 5), new Point(11, 5),
                    new Point(12, 10), new Point(6, 10));
            System.out.printf("Parelelogramo criado com sucesso. Área: %.2f%n", para.getArea());
            System.out.println();
        } catch (Exception e) {
            System.out.println("Paralelogramo com erro -> " + e.getMessage());
            System.out.println();
        }

        // 3. Teste do retângulo
        System.out.println("Tentativa de retângulo 1:");
        try {
            // Base: 13, Altura: 14
            Rectangle rect = new Rectangle(
                    new Point(17, 14), new Point(30, 14),
                    new Point(30, 28), new Point(17, 28));
            System.out.printf("Retângulo criado com sucesso. Área: %.2f%n", rect.getArea());
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.out.println("Retângulo com erro inesperado -> " + e.getMessage());
            System.out.println();
        }

        // 4. Teste de retângulo inválido
        System.out.println("Tentativa de retângulo 2:");
        try {
            Rectangle badRect = new Rectangle(
                    new Point(0, 0), new Point(10, 0),
                    new Point(12, 5), new Point(2, 5)
            );
        } catch (IllegalArgumentException e) {
            System.out.println("Retângulo bloqueado: " + e.getMessage());
            System.out.println();
        }

        // 5. Teste do quadrado
        System.out.println("Tentativa de quadrado 1:");
        try {
            // Lado: 4
            Square sqr = new Square(
                    new Point(4, 0), new Point(8, 0),
                    new Point(8, 4), new Point(4, 4));
            System.out.printf("Quadrado criado com sucesso. Área: %.2f%n", sqr.getArea());
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.out.println("Quadrado com erro inesperado -> " + e.getMessage());
            System.out.println();
        }

        // 6. Teste do quadrado inválido
        System.out.println("Tentativa de quadrado 2:");
        try {
            Square badSqr = new Square(
                    new Point(0, 0), new Point(10, 0),
                    new Point(10, 5), new Point(0, 5)
            );
        } catch (IllegalArgumentException e) {
            System.out.println("Quadrado bloqueado: " + e.getMessage());
            System.out.println();
        }

    }
}