
public class FactoryDesign {

    public Shape getShape(String shape) {
        if(shape.equals("Circle")) {
            return new Circle();
        }
        else if(shape.equals("Rectangle")) {
            return new Rectangle();
        }
        else if(shape.equals("Triangle")) {
            return new Triangle();
        }
        return null;
    }
}
