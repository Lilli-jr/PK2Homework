package Exercise1;

import java.util.*;

public class ShapeAnalyser {

    public static List<Shape> filterByMinArea(Collection<? extends Shape> shapes, double minArea) {
        List<Shape> result = new ArrayList<>();
        for (Shape shape : shapes) {
            if (shape.getArea() < minArea) {
                result.add(shape);
            }
        }
        return result;
    }

    public static Shape filterByMaxArea(Collection<? extends Shape> shapes) {
        if (shapes.isEmpty()) {
            return null;
        }
        Shape maxShape = null;
        double maxArea = Double.MIN_VALUE;
        for (Shape shape : shapes) {
            if (shape.getArea() > maxArea) {
                maxArea = shape.getArea();
                maxShape = shape;
            }
        }
        return maxShape;
    }

    public static <T extends Shape>Map<String, List<T>> groupByType(Collection<T> shapes) {
        Map<String, List<T>> result = new HashMap<>();
        for(T shape : shapes) {
            String type = shape.getClass().getSimpleName();
            result.computeIfAbsent(type, k -> new ArrayList<>()).add(shape);
        }
        return result;
    }
}
