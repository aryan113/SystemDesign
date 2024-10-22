public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        FactoryProduct shapeFactory = new FactoryProduct();
        AbstractFactory factory = shapeFactory.getFactory("SHAPE");
        Shape shape1 = factory.getShape("RECTANGLE");
        shape1.draw();
        Shape shape2 = factory.getShape("TRANGLE");
        shape2.draw();
        factory = shapeFactory.getFactory("ROUNDEDSHAPE");
        shape1 = factory.getShape("RECTANGLE");
        shape1.draw();
        shape2 = factory.getShape("TRANGLE");
        shape2.draw();
    }
}
