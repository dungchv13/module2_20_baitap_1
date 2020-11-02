public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape s1 = shapeFactory.getShape("circle");
        Shape s2 = shapeFactory.getShape("rectangle");
        Shape s3 = shapeFactory.getShape("square");

        s1.draw();
        s2.draw();
        s3.draw();

    }
}
