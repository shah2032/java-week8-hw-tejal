package poolarea20;

public class Rectangle {
    //Declare two variables with name
    //width and length both of type double.
        private double width;
        private double length;
       //one constructor with parameters width and length both of type double and it
       //needs to initialize the fields.
        public Rectangle (double width, double length){
            if ((width < 0) && (length < 0)){
                this.width = 0;
                this.length = 0;
            } else if ((width < 0) && (length > 0)) {
                this.width = 0;
                this.length = length;
            }  else if ((width > 0) && (length < 0)) {
                this.width = width;
                this.length = 0;
            }  else {
                this.width = width;
                this.length = length;
            }
        }
       //Instance Methods
        public double getWidth(){
            return width;
        }
        public double getLength(){
            return length;
        }
        public double getArea(){
            return (width * length);
        }
    }


