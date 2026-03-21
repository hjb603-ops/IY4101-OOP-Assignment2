public class Shape {

    private Coordinates position;
    private int sides;

    public Shape(int sides, Coordinates position) {
        this.sides = sides;
        this.position = position;
    }

    public Coordinates getCoordinates() {
        return position;
    }

    public void setCoordinates(Coordinates position) {
        this.position = position;
    }

    public int getSides() {
        return sides;
    }

    public void translate(int dx, int dy) {
        position.translate(dx, dy);
    }

    public void scale(int factor, boolean sign) {
        position.scale(factor, sign);
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    public String display() {
        return "Shape at " + position.display();
    }
}