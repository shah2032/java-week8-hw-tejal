package cylinder_19;

public class Circle {
    //instance variable
    double radius;
    // create Constructor with parameter radius
    public Circle(double radius){

        if(radius < 0) {
            this.radius = 0;
        }else{
            this. radius = radius;
        }
    }
    public double getRadius(){

        return radius;
    }
    public double getArea(){
        return (radius * radius * Math.PI);
    }
    }


