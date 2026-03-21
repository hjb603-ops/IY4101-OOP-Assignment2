public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(Coordinates position, double width, double length) {
        super(4, position); // rectangle has 4 sides
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    @Override
    public void scale(int factor, boolean sign) {

        if (sign) {
            width = width * factor;
            length = length * factor;
        } else {
            width = width / factor;
            length = length / factor;
        }

        super.scale(factor, sign); // also scale position
    }

    @Override
    public String display() {
        return "Rectangle at " + getCoordinates().display() +
                " Width: " + width +
                " Length: " + length +
                " Area: " + getArea() +
                " Perimeter: " + getPerimeter();
    }
}
