public class RoundedShapeFactory implements AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        }
        else if(shapeType.equalsIgnoreCase("TRANGLE")){
            return new RoundedTriangle();
        }
        return null;
    }
}
