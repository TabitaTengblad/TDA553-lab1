import java.awt.*;


public class Saab95 extends Vehicle{

    public boolean turboOn;
  

    public Saab95(){
        super(2, Color.red, 125, "Saab95", 5, 20,20);
        this.turboOn = false;
        stopEngine();
    }

    public boolean isTurboOn(){
        return turboOn;
    }
    
    public void setTurboOn(){
	    turboOn = true;
    }

    public void setTurboOff(){
	    turboOn = false;
    }
    
    public double speedFactor(){ //klar
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
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
