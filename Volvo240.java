import java.awt.*;



public class Volvo240 extends Vehicle{

    public final static double trimFactor = 1.25;
   
    
    public Volvo240(int nrDoors, Color color, double enginePower, String modelName, double x, double y )  {
        super(4, Color.black, 100,"Volvo240",  5, 20,20);

       // this.nrDoors = 4;
       // this.color = Color.black;
        //this.enginePower = 100;
        //this.modelName = "Volvo240";
        stopEngine();
    }
    
    public double speedFactor(){
        if (speed>= 0 || speed<= enginePower){
        return getEnginePower() * 0.01 * trimFactor;
        }
    }


}
