package carpetcostcalculator17;

public class Floor {
    //Declare two variables with name width and length of type double
     double width;
     double length;
    // constructor with parameters width and length of type double and it
    //needs to initialize the fields.
    public Floor(double width, double length) {
        if (width > 0 && length < 0) {
            this.width = width;
            this.length = 0.0;
        } else if (width < 0 && length > 0) {
            this.width = 0.0;
            this.length = length;
        } else if (width < 0 && length < 0) {
            this.width = width;
            this.length = length;
        } else {
            this.width = width;
            this.length = length;
        }
    }

    public double getArea() {

        return this.width * this.length;
    }
}