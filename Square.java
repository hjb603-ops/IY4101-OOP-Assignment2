public class Square extends Shape {

    private double side;

    public Square(Coordinates position, double side) {
        super(4, position); // square has 4 sides
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void scale(int factor, boolean sign) {

        if (sign) {
            side = side * factor;
        } else {
            side = side / factor;
        }

        super.scale(factor, sign); // scale position too
    }

    @Override
    public String display() {
        return "Square at " + getCoordinates().display() +
                " Side: " + side +
                " Area: " + getArea() +
                " Perimeter: " + getPerimeter();
    }
}