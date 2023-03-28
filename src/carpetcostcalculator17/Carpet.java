package carpetcostcalculator17;

public class Carpet {
   // Declare variable with name cost of type double
     double cost;

    public Carpet(double cost){ //constructor with parameter cost of type double
        if(cost < 0 ){
            this.cost = 0.0;
        }else{
            this.cost = cost;
        }
    }
    public double getCost(){  //Instance Method getCost without any Parameter

        return this.cost;
    }

}