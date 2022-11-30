import java.awt.Color;
public class Scania extends Truck2 {

    private FlatbedAngle flatbedAngle;
    private double currentspeed;

    public Scania(){
        super(2, Color.RED, 125, "Scania", 5, 20,20 );
        flatbedAngle = new FlatbedAngle(0);
        currentspeed = 0;
    }

    public void setAngleOnFlatbed2(double angle) {
        flatbedAngle.setAngleOnFlatbed(angle);
    }

    public double getAngleOnFlatbed(){
        return flatbedAngle.getAngle();
    }


    public double ensureStationary(){  // om hastigheten är större än 0 kan inte flatbed åka upp
        if(currentspeed > 0);
        flatbedAngle.setAngleOnFlatbed(0);
                return flatbedAngle.getAngle();
         }
        
        
    public double getCurrentSpeed(){  // inte klar än...alls
        return flatbedAngle.setAngleOnFlatbed();
        }    

    public double ensureFlatbedAngleIsZero(){
        if (flatbedAngle.setAngleOnFlatbed() > 0){

            //overrida move-metoden och anropa den riktiga om vinkeln är rätt
            //när man flyttar den vill man kolla så det stämmer

        }
    }
    }
    
    

//-------------Minnesanteckningar------------------------------------------------
// göra metoder för alla kraven, klart kanske.