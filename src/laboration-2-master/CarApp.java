import java.util.ArrayList;

public class CarApp {

    ArrayList<Vehicle> vehicles = new ArrayList<>();
    public static void main(String[] args) {
        // Instance of this class
        CarController cc = new CarController();

        cc.vehicles.add(new Volvo240());
        cc.vehicles.add(new Saab95());
        cc.vehicles.add(new Scania());

        // Start a new view and send a reference of self
        cc.frame = new CarView("vehiclesim 1.0", cc);

        // Start the timer
        cc.timer.start();
    }
}
