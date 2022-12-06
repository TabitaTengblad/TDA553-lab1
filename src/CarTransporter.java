import java.awt.Color;

public class CarTransporter extends Truck2 {
    private FlatbedState flatbedState;
    private double maxDistance;
    private Loading loading;
    private double maxNrOfCars;

    public CarTransporter() {
        super(2, Color.BLACK, 125, "Car transporter", 5, 20, 20);
        // getFlatbedState();
        this.flatbedState = new FlatbedState();
        this.maxDistance = 5;
        this.maxNrOfCars = 3;
        this.loading = new Loading();
 
    }

    public boolean getFlatbedState() {
        return flatbedState.flatbedState();
    }

    public boolean carTransporterStationary() {
        if (getCurrentSpeed() > 0)
            ;
        return false;
    }

   public void setFlatbedState(boolean position){   //upp = false
    if (getCurrentSpeed() == 0){
    flatbedState.changeFlatbedState(position);
    }
    }

    public boolean changeFlatbedState() {
        return false; 
    }
    

   public boolean CarTransporterStationary(){ //Världens längsta metod-namn, ni kan ändra om ni vill :)
    if (getCurrentSpeed() > 0);
    return false;
   }
   
   public Vehicle unLoadCarTransporter(){     //testar var för sig
    if (getFlatbedState() == true & loading.getNrOfCars() > 0);
    return loading.unLoad();
   }

    private boolean distanceIsRight() { // behöver inte testa
        double distance = Loading.calculateDistance(1, 1, getX(), getY());
        return Loading.distanceIsRight(distance, maxDistance);
    }

    public void loadCarTransporter(Vehicle car) {
        if (getFlatbedState() == true & distanceIsRight() == true & loading.getNrOfCars() < maxNrOfCars
                & getCurrentSpeed() == 0) {
            loading.load(car);
        }
    }

    public int getNrOfCars() {
        return loading.getNrOfCars();
    
    
    }
}