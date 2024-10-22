public class FactoryProduct {
    public AbstractFactory getFactory(String factoryType){
        if(factoryType.equals("SHAPE")){
            return new ShapeFactory();
        }
        else if(factoryType.equals("ROUNDEDSHAPE")){
            return new RoundedShapeFactory();
        }
        return null;
    }
}
