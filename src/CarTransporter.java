import java.awt.Color;
import java.util.ArrayList;

public class CarTransporter extends Truck2 {
    private FlatbedState flatbedState;
    private double maxDistance;
    private Loading loading;
    private double maxNrOfCars;
    public int getNrOFCars;


   public CarTransporter(){
       super(2, Color.BLACK, 125, "Car transporter", 5, 20,20);
       //getFlatbedState();
       this.flatbedState = new FlatbedState();
       this.maxDistance = 5;
       this.maxNrOfCars = 3;
       this.loading = new Loading();
       this.getNrOFCars = 2; }
      

   public boolean getFlatbedState() { 
       return flatbedState.flatbedState();
   }

   public void setFlatbedState(boolean position){   //upp = false
    if (getCurrentSpeed() == 0){
    flatbedState.changeFlatbedState(position);
    }
    }

   public boolean CarTransporterStationary(){ //Världens längsta metod-namn, ni kan ändra om ni vill :)
    if (getCurrentSpeed() > 0);
    return false;
   }
   
   public Vehicle unLoadCarTransporter(){     //testar var för sig
    if (getFlatbedState() == true & loading.getNrOfCars() > 0);
    return loading.unLoad();
   }

    private boolean distanceIsRight(){  //behöver inte testa
    double distance = Loading.calculateDistance(1, 1, getX(), getY());
    return Loading.distanceIsRight(distance, maxDistance);
   }

   public void loadCarTransporter(Vehicle car){  
    if (getFlatbedState() == true & distanceIsRight() == true & loading.getNrOfCars() < maxNrOfCars & getCurrentSpeed() == 0){
    loading.load(car);
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