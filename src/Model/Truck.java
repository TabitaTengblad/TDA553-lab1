import java.awt.*;

public class Truck extends Vehicle {
    
   

    public Truck(int nrDoors, Color color, double enginePower, String modelName, double direction, double x,
            double y) {
        super(nrDoors, color, enginePower, modelName, direction, x, y);
    }


    @Override
    public double speedFactor() {
        return 1;
    }

}
