package poolarea20;
// class with the name Cuboid that extends Rectangle class.
public class Cuboid extends Rectangle{
    // Declare variable  with name height of type double

    double height;
    // constructor with three parameters width, length, and height all of type double

    public Cuboid(double width, double length, double height){
        super(width, length);
        if(height < 0){
            this.height = 0;
        }else{
            this.height = height;
        }
    }

    public double getHeight(){
        return height;
    }

    public double getVolume(){
        return (getArea() * height);
    }
}

