import java.awt.*;



public class Volvo240 extends Vehicle{

    public final static double trimFactor = 1.25;
   
    
    public Volvo240(int nrDoors, Color color, double enginePower, String modelName )  {
        super(4, Color.black, 100,"Volvo240",  5, 20,20);

       // this.nrDoors = 4;
       // this.color = Color.black;
        //this.enginePower = 100;
        //this.modelName = "Volvo240";
        stopEngine();
    }
    
    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

    // Kanske funkar
    public void gas(double amount){
        if (amount >= 1.0 || amount <= 1.0){
            incrementSpeed(amount);
        }
        
    }

    // Kanske funkar nu?
    public void brake(double amount){
        if (amount >= 1.0 || amount <= 0.0){
            decrementSpeed(amount);
        }
        
    }
}
