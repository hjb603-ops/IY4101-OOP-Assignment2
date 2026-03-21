import java.util.ArrayList;

public class ShapeList {

    private ArrayList<Shape> listOfShapes;

    public ShapeList() {
        listOfShapes = new ArrayList<>();
    }

    public void addShape(Shape s) {
        listOfShapes.add(s);
    }

    public Shape removeShape(int pos) {
        if (pos >= 0 && pos < listOfShapes.size()) {
            return listOfShapes.remove(pos);
        }
        return null;
    }

    public Shape getShape(int pos) {
        if (pos >= 0 && pos < listOfShapes.size()) {
            return listOfShapes.get(pos);
        }
        return null;
    }

    public void translateShape(int pos, int dx, int dy) {
        Shape s = getShape(pos);
        if (s != null) {
            s.translate(dx, dy);
        }
    }

    public void scaleShape(int pos, int factor, boolean sign) {
        Shape s = getShape(pos);
        if (s != null) {
            s.scale(factor, sign);
        }
    }

    public double area(int pos) {
        Shape s = getShape(pos);
        if (s != null) {
            return s.getArea();
        }
        return 0;
    }

    public double perimeter(int pos) {
        Shape s = getShape(pos);
        if (s != null) {
            return s.getPerimeter();
        }
        return 0;
    }

    public int getNumberOfShapes() {
        return listOfShapes.size();
    }

    public String display() {
        if (listOfShapes.isEmpty()) {
            return "No shapes in the list.";
        }

        String result = "";
        for (int i = 0; i < listOfShapes.size(); i++) {
            result += i + ": " + listOfShapes.get(i).display() + "\n";
        }
        return result;
    }
}
