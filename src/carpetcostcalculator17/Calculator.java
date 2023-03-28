package carpetcostcalculator17;

public class Calculator {
     // Declare two instance variables with name
     //floor of type Floor and carpet of type Carpet.
         Floor floor;
        Carpet carpet;


       //constructor with parameters floor of type Floor and carpet of type Carpet
       //and it needs to initialize the fields.
        public Calculator(Floor floor,Carpet carpet ) {
            this.floor = floor;
            this.carpet = carpet;
        }
       //Instance Method  getTotalCost without any parameters, it needs to return the calculated total
       //cost to cover the floor with a carpet.
        public double getTotalCost(){

            return floor.getArea()*carpet.getCost();
        }
    }