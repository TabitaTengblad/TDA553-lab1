import java.awt.Color;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

import javax.swing.plaf.synth.ColorType;
public class Scania extends Truck2 {

    private FlatbedAngle flatbedAngle;
    private double angle;
    private double currentspeed;

    public Scania(){
        super(2, Color.RED, 125, "Scania", 5, 20,20 );
        flatbedAngle = new FlatbedAngle(0);
        angleOnFlatbed();
        currentspeed = 0;
    }

    private void angleOnFlatbed() {
        flatbedAngle.angleOnFlatbed(angle);
    }

    public double ScaniaMoving(){  // en början, tror inte den är klar. Där uppe verkar den inte fatta vad speed är.
        if (angle > 0);
            currentspeed = 0;
                return currentspeed;
        }

    public double ScaniaSpeedzero(){ // en början, tror inte den är klar. 
        if(currentspeed > 0);
            angle = 0;
                return angle;
        }   

    }

//-------------Minnesanteckningar------------------------------------------------
// göra metoder för alla kraven, klart kanske.