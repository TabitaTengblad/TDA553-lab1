import java.awt.Color;
public class Scania extends Truck2 {

    FlatbedAngle flatbedAngle;
    private double currentspeed;
    private double x;
    private double y;

    public Scania(){
        super(2, Color.RED, 125, "Scania", 5, 0,0 );
        flatbedAngle = new FlatbedAngle(0);
        currentspeed = 0;
        x = getX();
        y = getY();
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

        @Override
        public void move() {
            if (flatbedAngle.getAngle() > 0){ 
                x += 0;
                y += 0;

            }
            }

    
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }
        }
    


//-------------Minnesanteckningar---------{---------------------------------------
// göra metoder för alla kraven