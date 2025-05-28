package Exercise1;

public class ShapeFactory {

    public static Shape fromString(String input){
        if(input == null || input.isEmpty()){
            throw new IllegalArgumentException("Input string is empty");
        }
        String [] parts = input.split(":");
        if(parts.length != 2){
            throw new IllegalArgumentException("Invalid format: Expected 'Type: parameters'.");
        }
        String type = parts[0].trim();
        String[] params = parts[1].split(",");

        if(type.equalsIgnoreCase("Circle")){
            return new Circle(Double.parseDouble(params[0].split("=")[1].trim()));
        } else if(type.equalsIgnoreCase("Rectangle")){
            double width = Double.parseDouble(params[0].split("=")[1].trim());
            double length = Double.parseDouble(params[1].split("=")[1].trim());
            return new Rectangle(width, length);
        } else throw new IllegalArgumentException("Invalid format: Expected 'Type: parameters'.");
    }
}
