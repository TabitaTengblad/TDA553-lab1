import java.awt.*;

public class Truck2 extends Vehicle {
    
   

    public Truck2(int nrDoors, Color color, double enginePower, String modelName, double direction, double x,
            double y) {
        super(nrDoors, color, enginePower, modelName, direction, x, y);
    }


    @Override
    public double speedFactor() {
        return 1;
    }

}
