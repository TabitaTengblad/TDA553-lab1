import java.awt.Color;

import javax.swing.plaf.synth.ColorType;

public class CarTransporter extends Truck2 {
private FlatbedPosition flatbedPosition;
private boolean flatbedPosition;
public double currentspeed;
private double maxDistance;
private Loading loading;
private double maxNrOfCars;

 

   public CarTransporter(){
       super(2, Color.BLACK, 125, "Car transporter", 5, 20,20 );
       getFlatbedPosition();
       this.currentspeed = 0;
       this.maxDistance = 5;
       this.maxNrOfCars = 3;
       this.loading = new Loading();
   }

   private boolean getFlatbedPosition() {
       flatbedPosition.getFlatbedPosition();
       return true;
   }

   public boolean getFlatbedPosition(boolean b){
    return getFlatbedPosition();
   }

   public boolean CarTransporterStationary(){ //Världens längsta metod-namn, ni kan ändra om ni vill :)
    if (currentspeed > 0);
    return false;

   }
   
   private Vehicle UnLoadCarTransporter(){   
    if (flatbedPosition == true & Loading.getNrOfCars() > 0);
    loading.unLoad();
   }

    private boolean distanceIsRight(){
    double distance = Loading.calculateDistance(1, 1, x, y);
    return Loading.distanceIsRight(distance, maxDistance);
   }

   private void LoadCarTransporter(Vehicle car){
    if (flatbedPosition == true & distanceIsRight() == true & Loading.getNrOfCars() <= maxNrOfCars){
    loading.load();
   }
}
}
//----------------Minnesanteckningar-----------------------------------------------------------------------------------------------

// göra metoder för alla kraven:

//The car transport ramp has only two positions, up or down. 
//The ramp can only be down if the car transport is stationary. If the ramp is down, the car transport must not move,
//and if the car transport is moving, the ramp must not be lowered. !!!! KLAR LIGGER I LOAD !!!
//Cars can only be loaded if the ramp is down, and they are reasonably close to the car transport 
// (make your own assumption about what "reasonably close" means, the details are not important). !!!! KLART LIGGER I LOAD  !!!
//Cars can only be unloaded if the ramp is down. They should then end up reasonably close to the car transport.
// cars load, sätt den som 0 i konstruktorn, skriva metyod för den som beror på true/false.