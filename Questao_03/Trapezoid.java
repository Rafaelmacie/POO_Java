public class Trapezoid extends Quadrilateral {
    public Trapezoid(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double getArea() {
        double base1 = Math.abs(getP1().getX() - getP2().getX());
        double base2 = Math.abs(getP3().getX() - getP4().getX());
        double height = Math.abs(getP1().getY() - getP3().getY());
        return ((base1 + base2) * height) / 2.0;
    }
}
