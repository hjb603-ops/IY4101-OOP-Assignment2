import java.util.Scanner;

public class ShapeManagement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ShapeList shapeList = new ShapeList();
        int choice;

        do {
            System.out.println("\n--- Shape Management Menu ---");
            System.out.println("1. Add Rectangle");
            System.out.println("2. Add Square");
            System.out.println("3. Add Circle");
            System.out.println("4. Add Triangle");
            System.out.println("5. Remove Shape");
            System.out.println("6. Display All Shapes");
            System.out.println("7. Translate Shape");
            System.out.println("8. Scale Shape");
            System.out.println("9. Display Shape Area and Perimeter");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter x coordinate: ");
                    int rx = input.nextInt();
                    System.out.print("Enter y coordinate: ");
                    int ry = input.nextInt();
                    System.out.print("Enter width: ");
                    double width = input.nextDouble();
                    System.out.print("Enter length: ");
                    double length = input.nextDouble();

                    Rectangle rectangle = new Rectangle(new Coordinates(rx, ry), width, length);
                    shapeList.addShape(rectangle);
                    System.out.println("Rectangle added successfully.");
                    break;

                case 2:
                    System.out.print("Enter x coordinate: ");
                    int sx = input.nextInt();
                    System.out.print("Enter y coordinate: ");
                    int sy = input.nextInt();
                    System.out.print("Enter side: ");
                    double side = input.nextDouble();

                    Square square = new Square(new Coordinates(sx, sy), side);
                    shapeList.addShape(square);
                    System.out.println("Square added successfully.");
                    break;

                case 3:
                    System.out.print("Enter x coordinate: ");
                    int cx = input.nextInt();
                    System.out.print("Enter y coordinate: ");
                    int cy = input.nextInt();
                    System.out.print("Enter radius: ");
                    double radius = input.nextDouble();

                    Circle circle = new Circle(new Coordinates(cx, cy), radius);
                    shapeList.addShape(circle);
                    System.out.println("Circle added successfully.");
                    break;

                case 4:
                    System.out.print("Enter x1: ");
                    int x1 = input.nextInt();
                    System.out.print("Enter y1: ");
                    int y1 = input.nextInt();
                    System.out.print("Enter x2: ");
                    int x2 = input.nextInt();
                    System.out.print("Enter y2: ");
                    int y2 = input.nextInt();
                    System.out.print("Enter x3: ");
                    int x3 = input.nextInt();
                    System.out.print("Enter y3: ");
                    int y3 = input.nextInt();

                    Triangle triangle = new Triangle(
                            new Coordinates(x1, y1),
                            new Coordinates(x2, y2),
                            new Coordinates(x3, y3)
                    );
                    shapeList.addShape(triangle);
                    System.out.println("Triangle added successfully.");
                    break;

                case 5:
                    System.out.print("Enter index of shape to remove: ");
                    int removeIndex = input.nextInt();

                    if (shapeList.removeShape(removeIndex) != null) {
                        System.out.println("Shape removed successfully.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 6:
                    System.out.println(shapeList.display());
                    break;

                case 7:
                    System.out.print("Enter index of shape to translate: ");
                    int tIndex = input.nextInt();
                    System.out.print("Enter dx: ");
                    int dx = input.nextInt();
                    System.out.print("Enter dy: ");
                    int dy = input.nextInt();

                    shapeList.translateShape(tIndex, dx, dy);
                    System.out.println("Shape translated successfully.");
                    break;

                case 8:
                    System.out.print("Enter index of shape to scale: ");
                    int scIndex = input.nextInt();
                    System.out.print("Enter scale factor: ");
                    int factor = input.nextInt();
                    System.out.print("Enter true to enlarge or false to shrink: ");
                    boolean sign = input.nextBoolean();

                    shapeList.scaleShape(scIndex, factor, sign);
                    System.out.println("Shape scaled successfully.");
                    break;

                case 9:
                    System.out.print("Enter index of shape: ");
                    int apIndex = input.nextInt();

                    Shape s = shapeList.getShape(apIndex);
                    if (s != null) {
                        System.out.println("Area: " + s.getArea());
                        System.out.println("Perimeter: " + s.getPerimeter());
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        input.close();
    }
}