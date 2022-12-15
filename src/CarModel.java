import java.util.ArrayList;
import java.util.List;
import model.Vehicle;
public class CarModel {
    public List<Vehicle> vehicles = new ArrayList<>();
    public void add(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
}