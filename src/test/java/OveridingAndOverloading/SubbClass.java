package OveridingAndOverloading;

//Square
public class SubbClass extends SupClass{
    @Override
    public double calculateParameters(){
        return sides * getLength();
    }

    // OverLoading
    public void print(String what){
        System.out.println(what);
    }
}
