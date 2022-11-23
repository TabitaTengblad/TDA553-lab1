import java.awt.*;


public class Saab95 extends Vehicle{

    public boolean turboOn;
  

    public Saab95(){
        super(2, Color.red, 125, "Saab95", 5, 20,20);
        this.turboOn = false;
        stopEngine();
    }

    public boolean isTurboOn(){ //Klar
        return turboOn;
    }
    
    public void setTurboOn(){ //Klar
	    turboOn = true;
    }

    public void setTurboOff(){ //Klar
	    turboOn = false;
    }
    
    @Override
    public double speedFactor(){ //klar
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }
    
}