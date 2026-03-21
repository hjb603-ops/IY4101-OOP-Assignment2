public class Triangle extends Shape {

    private Coordinates point1;
    private Coordinates point2;
    private Coordinates point3;

    public Triangle(Coordinates p1, Coordinates p2, Coordinates p3) {
        super(3, p1); // triangle has 3 sides, use p1 as position
        this.point1 = p1;
        this.point2 = p2;
        this.point3 = p3;
    }

    // Calculate side lengths
    private double sideA() {
        return point1.distance(point2);
    }

    private double sideB() {
        return point2.distance(point3);
    }

    private double sideC() {
        return point3.distance(point1);
    }

    @Override
    public double getPerimeter() {
        return sideA() + sideB() + sideC();
    }

    @Override
    public double getArea() {
        double a = sideA();
        double b = sideB();
        double c = sideC();

        double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public void translate(int dx, int dy) {
        point1.translate(dx, dy);
        point2.translate(dx, dy);
        point3.translate(dx, dy);
    }

    @Override
    public void scale(int factor, boolean sign) {

        point1.scale(factor, sign);
        point2.scale(factor, sign);
        point3.scale(factor, sign);
    }

    @Override
    public String display() {
        return "Triangle with points " +
                point1.display() + ", " +
                point2.display() + ", " +
                point3.display() +
                " Area: " + getArea() +
                " Perimeter: " + getPerimeter();
    }
}