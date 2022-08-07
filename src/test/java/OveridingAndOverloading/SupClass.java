package OveridingAndOverloading;

// Rectangle
public class SupClass {
    protected double length;
    protected double width;
    protected double sides = 4;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

// --Commented out by Inspection START (07/08/2022 2:43 PM):
//    public double getWidth() {
//        return width;
//    }
// --Commented out by Inspection STOP (07/08/2022 2:43 PM)

// --Commented out by Inspection START (07/08/2022 2:43 PM):
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//// --Commented out by Inspection START (07/08/2022 2:43 PM):
// --Commented out by Inspection STOP (07/08/2022 2:43 PM)
//    public double getSides() {
//        return sides;
//    }
// --Commented out by Inspection STOP (07/08/2022 2:43 PM)

    public void setSides(double sides) {
        this.sides = sides;
    }

    // Rectangle
    public double calculateParameters(){
        return (2 * length) + (2* width);
    }

    // OverLoading
    public void print(){
        System.out.println("i am rectangle");
    }

}
