import java.awt.*;
public double speedFactor;



public class Volvo240 extends Vehicle{

    public final static double trimFactor = 1.25;
   
    
    public Volvo240()  {
        super(4, Color.black, 100,"Volvo240",  5, 20, 20);
        this.speedFactor = speedFactor;
        stopEngine();
    }
    
    public double speedFactor(){
        if (speed>= 0.0 || speed<= enginePower){
        return getEnginePower() * 0.01 * trimFactor;
        }
    }
}
