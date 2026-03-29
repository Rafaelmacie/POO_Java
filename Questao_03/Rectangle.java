public class Rectangle extends Parallelogram {
    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);

        // Validação de diagonais iguais para garantir ângulos de 90°
        double diag1 = p1.distanceTo(p3);
        double diag2 = p2.distanceTo(p4);
        
        if (Math.abs(diag1 - diag2) > 0.0001) { // margem de erro para double
            throw new IllegalArgumentException("Os pontos não formam um retângulo (ângulos não são 90°).");
        }
    }
}
