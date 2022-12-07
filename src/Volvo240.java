import java.awt.*;

public class Volvo240 extends Vehicle {

    public double speedFactor;
    public double currentSpeed;
    public double enginePower; //Osäker på om den ska vara där

    public final static double trimFactor = 1.25;

    public Volvo240() {
        super(4, Color.black, 100, "Volvo240", 5, 0, 0);
        stopEngine();
    }
  
    @Override
    public double speedFactor() {
        return enginePower * 0.01 * trimFactor;
    }

}
