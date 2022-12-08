import java.awt.*;

public class Volvo240 extends Vehicle {

    private final static double trimFactor = 1.25;

    public Volvo240() {
        super(4, Color.black, 100, "Volvo240", 2, 100, 0);
        stopEngine();
    }
  
    @Override
    public double speedFactor() {
        return getEnginePower() * 0.01 * trimFactor;
    }

}
