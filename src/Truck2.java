import java.awt.*;

public class Truck2 extends Vehicle {
    
    private int nrDoors; 
    private Color color;
    private double enginePower;
    private String modelName;
    private double direction;
    private double x;
    private double y;
    public double currentSpeed;
   

    public Truck2(int nrDoors, Color color, double enginePower, String modelName, double direction, double x,
            double y) {
        super(nrDoors, color, enginePower, modelName, direction, x, y);
        //TODO Auto-generated constructor stub
    }


    @Override
    public double speedFactor() {
        // TODO Auto-generated method stub
        return 0;
    }


    @Override
    public double speedFactor(double num) {
        // TODO Auto-generated method stub
        return 0;
    }

}
