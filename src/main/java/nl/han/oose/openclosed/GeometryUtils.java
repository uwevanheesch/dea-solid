package nl.han.oose.openclosed;

import java.util.List;

public class GeometryUtils {

    public double calculateArea(List<Shape> shapes) {
        double totalArea = 0.;

        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                totalArea += rectangle.getHeight() * rectangle.getWidth();
            } else if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                totalArea += Math.pow(circle.getRadius(), 2) * Math.PI;
            }
        }
        return totalArea;

    }
}
