import java.awt.*;


public class Saab95 extends Vehicle implements ITurbo{

    public boolean turboOn;
   
  

    public Saab95(){
        super(2, Color.red, 125, "Saab95", 0, 0, 100);
        this.turboOn = false;
        stopEngine();
    }
    @Override
    public boolean isTurboOn(){ //Klar
        return turboOn;
    }
    @Override
    public void setTurboOn(){ //Klar
	    turboOn = true;
    }
    @Override
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