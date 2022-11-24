import java.awt.*;


public class Saab95 extends Vehicle{

    public boolean turboOn;
    //public Motor motor;
  

    public Saab95(){
        super(2, Color.red, 125, "Saab95", 5, 20,20);
        this.turboOn = false;
       // motor = new Motor(); så det ska se ut i dom andra
        stopEngine();
    }

    public boolean isTurboOn(){ //Klar
        return turboOn;
    }
    
    public void setTurboOn(){ //Klar
      //  motor.turboOn();
	    turboOn = true;
    }

    public void setTurboOff(){ //Klar
	    turboOn = false;
    }
    
    public double speedFactor(){ //klar
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }
    
}