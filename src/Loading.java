import java.util.ArrayList;
import java.util.List;

public class Loading {

    private List<Vehicle> cars;

    public Loading() {
        cars = new ArrayList<>();
    }

    public Vehicle unLoad() {  //inte klar än!!!
        if (getNrOfCars() > 0){
            return cars.remove(0);
        }
        else {
            return null;    //vet ej om detta kommer fungera
        }
    }

    public int getNrOfCars() {
        return cars.size();
    }

    public static double calculateDistance(double carX, double carY, double transporterX, double transporterY) {
        double distance = Math.sqrt(
                ((carX + transporterX) * (carX + transporterX)) + ((carY + transporterY) * (carY + transporterY)));
        return distance;
    }

    public static boolean distanceIsRight(double distance, double maxDistance) {

        if (distance <= maxDistance) {
            return true;
        } else {
            return false;
        }
    }

    public void load(Vehicle car) {
        cars.add(car);
    }

}
