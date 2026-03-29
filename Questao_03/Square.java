public class Square extends Rectangle {
    public Square(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);

        double side1 = p1.distanceTo(p2); // Base
        double side2 = p1.distanceTo(p4); // Altura

        if (Math.abs(side1 - side2) > 0.0001) {
            throw new IllegalArgumentException("Os lados devem ser iguais para ser um quadrado.");
        }
    }
}
