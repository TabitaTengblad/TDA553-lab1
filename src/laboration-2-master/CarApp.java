import java.util.ArrayList;

public class CarApp {

    public static ArrayList<Vehicle> vehicles = new ArrayList<>();
    public static void main(String[] args) {
        // Instance of this class
        vehicles.add(new Volvo240());
        vehicles.add(new Saab95());
        vehicles.add(new Scania());


    }
}
