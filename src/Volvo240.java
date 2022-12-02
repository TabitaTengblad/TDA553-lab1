import java.awt.*;

public class Volvo240 extends Vehicle {

    public double speedFactor;
    public double currentSpeed; //Osäker på om den ska vara där

    public final static double trimFactor = 1.25;

    public Volvo240() {
        super(4, Color.black, 100, "Volvo240", 5, 20, 20);
        stopEngine();
    }
  
    @Override
    public double speedFactor() {
        double newFactor = speedFactor;
        if (currentSpeed >= 0.0 || currentSpeed <= getEnginePower()) {
            newFactor = (getEnginePower() * 0.01 * trimFactor);
        }
        // TODO Auto-generated method stub
        return newFactor;
    }

}
