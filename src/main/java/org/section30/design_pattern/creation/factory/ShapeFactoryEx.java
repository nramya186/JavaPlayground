package org.section30.design_pattern.creation.factory;

interface Shape{
    void shape_draw();
}

class Circle implements  Shape{

    @Override
    public void shape_draw() {
        System.out.println("Shape circle draw");
    }
}
class Rectangle implements Shape{

    @Override
    public void shape_draw() {
        System.out.println("Rectangle Shape draw");
    }
}
class ShapeFactory{
    public Shape getShape(String shapeType){
        if(shapeType == null) {
            return null;
        }if(shapeType.equalsIgnoreCase("cicle")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }return null;
    }
}
public class ShapeFactoryEx {
    public static void main(String[] args) {
        ShapeFactory shapeFactory= new ShapeFactory();
        Shape shape1= shapeFactory.getShape("cicle");
        shape1.shape_draw(); //o/p: Shape circle draw
        Shape shape2= shapeFactory.getShape("Rectangle");
        shape2.shape_draw();//op:  Rectangle Shape draw
    }


}
