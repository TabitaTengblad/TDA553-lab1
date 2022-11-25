import java.awt.Color;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

import javax.swing.plaf.synth.ColorType;
public class Scania extends Truck {

    
    private FlatbedAngle flatbedAngle;

    private double angle;

    public Scania(){
        super(2, Color.RED, 125, "Scania", 5, 20,20 );
        this.flatbedAngle = new FlatbedAngle(0);
        this.angleOnFlatbed();
    }

    private void angleOnFlatbed() {
        flatbedAngle.angleOnFlatbed(angle);
    }

}
