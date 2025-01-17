package model;

import java.awt.Color;

public class Scania extends Truck {

    private FlatbedAngle flatbedAngle;

    public Scania() {
        super(2, Color.RED, 125, "Scania", 0, 0, 200);
        flatbedAngle = new FlatbedAngle(0);
    }

    public void setAngleOnFlatbed2(double angle) {
        if (getCurrentSpeed() == 0){
            flatbedAngle.setAngleOnFlatbed(angle);
        }
     
    }

    public double getAngleOnFlatbed() {
        return flatbedAngle.getAngle();
    }

    public double ensureStationary() { // om hastigheten är större än 0 kan inte flatbed åka upp
        if (getCurrentSpeed() > 0)
            ;
        flatbedAngle.setAngleOnFlatbed(0);
        return flatbedAngle.getAngle();
    }

    @Override
    public void move() {
        if (flatbedAngle.getAngle() <= 0) {
            super.move();
        }
    }
}

// -------------Minnesanteckningar---------{---------------------------------------
// göra metoder för alla kraven