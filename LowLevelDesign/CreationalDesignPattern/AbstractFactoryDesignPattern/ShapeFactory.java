public class ShapeFactory implements AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        else if(shapeType.equalsIgnoreCase("TRANGLE")){
            return new Triangle();
        }
        return null;
    }
}
