package Abstraction;

public class SubAbstractClass extends ShapeAbstract {

    private double width;
    private double length;

// --Commented out by Inspection START (07/08/2022 2:43 PM):
//    public double getWidth() {
//        return width;
//    }
// --Commented out by Inspection STOP (07/08/2022 2:43 PM)

    public void setWidth(double width) {
        this.width = width;
    }

// --Commented out by Inspection START (07/08/2022 2:43 PM):
//    public double getLength() {
//        return length;
//    }
// --Commented out by Inspection STOP (07/08/2022 2:43 PM)

    public void setLength(double length) {
        this.length = length;
    }

    public SubAbstractClass(double length, double width){
        setLength(length);
        setWidth(width);
    }
    @Override
    double calculation() {
        return length * width;
    }
}
