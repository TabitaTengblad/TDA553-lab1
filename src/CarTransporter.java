import java.awt.Color;

import javax.swing.plaf.synth.ColorType;

public class CarTransporter extends Truck2 {
private FlatbedOnOff flatbedOnOff;
private boolean onOffFlatbed;
public double currentspeed;
public double carsLoad;
   
 
    
    public CarTransporter(){
       super(2, Color.BLACK, 125, "Car transporter", 5, 20,20 );
       onOffFlatbed = true;
       carsLoad = 0;
       onOffFlatbed();
       this.currentspeed = 0;   //Verkar inte fatta vad currentspeed är... :( vet ej om det dska vara 0
    }

   private boolean onOffFlatbed() {
       flatbedOnOff.onOffFlatbed();
       return true;
   }

   public boolean getOnOffFlatbed(){
    return onOffFlatbed();
    }
          
   public boolean CarTransporterStationary(){ //Världens längsta metod-namn, ni kan ändra om ni vill :)
    if (currentspeed > 0);
    return false;

}

   
}
//----------------Minnesanteckningar-----------------------------------------------------------------------------------------------

// göra metoder för alla kraven:

//The car transport ramp has only two positions, up or down.
//The ramp can only be down if the car transport is stationary. If the ramp is down, the car transport must not move, 
//and if the car transport is moving, the ramp must not be lowered.
//Cars can only be loaded if the ramp is down, and they are reasonably close to the car transport
// (make your own assumption about what "reasonably close" means, the details are not important).
//Cars can only be unloaded if the ramp is down. They should then end up reasonably close to the car transport.
// cars load, sätt den som 0 i konstruktorn, skriva metyod för den som beror på true/false.