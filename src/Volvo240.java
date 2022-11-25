import java.awt.*;

public class Volvo240 extends Vehicle{
    
    public double speedFactor;

    public final static double trimFactor = 1.25;
   
    
    public Volvo240()  {
        super(4, Color.black, 100, "Volvo240",  5, 20, 20);
        stopEngine();
    }
    
    @Override
    public double speedFactor(double currentSpeed){
        double newFactor = speedFactor;
        if (currentSpeed>= 0.0 || currentSpeed<= getEnginePower()){
            newFactor= (getEnginePower() * 0.01 * trimFactor);
        }
        return newFactor;
    }

}
