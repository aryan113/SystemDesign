class FactoryDesignPatternDemo {

    public static void main(String[] args){
        System.out.println("Hello");
        FactoryDesign design1 = new FactoryDesign();
        Shape circle = design1.getShape("Circle");
        circle.draw();
        Shape rectanglShape = design1.getShape("Rectangle");
        rectanglShape.draw();
        Shape triShape = design1.getShape("Triangle");
        triShape.draw();
    }
}