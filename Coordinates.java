public class Coordinates {

    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Coordinates p) {
        int dx = p.getX() - this.x;
        int dy = p.getY() - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void translate(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

    public void scale(int factor, boolean sign) {

        if (sign) {
            x = x * factor;
            y = y * factor;
        } else {
            x = x / factor;
            y = y / factor;
        }

    }

    public String display() {
        return "(" + x + "," + y + ")";
    }

}