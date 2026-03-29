public class Parallelogram extends Quadrilateral {
    public Parallelogram(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double getArea() {
        double base = Math.abs(getP1().getX() - getP2().getX());
        double height = Math.abs(getP1().getY() - getP3().getY());
        return base * height;
    }
}
