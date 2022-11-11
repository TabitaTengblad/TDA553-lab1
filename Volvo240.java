import java.awt.*;

import javax.swing.plaf.synth.ColorType;

public class Volvo240 extends Vehicle{

    public final static double trimFactor = 1.25;
   
    
    public Volvo240(int nrDoors, Color color, double enginePower, String modelName )  {
        super(4, Color. black, 100,"Volvo240");

       // this.nrDoors = 4;
       // this.color = Color.black;
        //this.enginePower = 100;
        //this.modelName = "Volvo240";
        stopEngine();
    }
    
   
  
    
    public double speedFactor(){
        return enginePower * 0.01 * trimFactor;
    }

    public void incrementSpeed(double amount){
	    currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }

    public void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }

    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }
}
