package Abstraction;

public class ShapeTester {

    public static void main(String[] args) {
        ShapeAbstract shape = new SubAbstractClass(5, 9);
        shape.print();
        System.out.println(shape.calculation());
    }
}
