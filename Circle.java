public class Circle extends Shape {

    private double radius;

    public Circle(Coordinates position, double radius) {
        super(0, position); // circle has no sides
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void scale(int factor, boolean sign) {

        if (sign) {
            radius = radius * factor;
        } else {
            radius = radius / factor;
        }

        super.scale(factor, sign); // scale position too
    }

    @Override
    public String display() {
        return "Circle at " + getCoordinates().display() +
                " Radius: " + radius +
                " Area: " + getArea() +
                " Perimeter: " + getPerimeter();
    }
}
