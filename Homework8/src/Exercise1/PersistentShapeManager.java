package Exercise1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PersistentShapeManager {
    public static void saveShapesToFile(Collection<? extends Shape> shapes, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            for (Shape shape : shapes) {
                writer.write(shape.toString());
                writer.newLine();
            }
            System.out.println("Shapes saved successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static List<Shape> loadShapesFromFile(String filename) {
        List<Shape> shapes = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    Shape shape = ShapeFactory.fromString(line);
                    shapes.add(shape);
                } catch (IllegalArgumentException e) {
                    System.err.println("Skipping malformed line: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }

        return shapes;
    }

    public static void clearFile(String filename) {
        try (PrintWriter writer = new PrintWriter(filename)) {
            writer.print("");
            System.out.println("File cleared successfully.");
        } catch (IOException e) {
            System.err.println("Error clearing file: " + e.getMessage());
        }
    }
}
