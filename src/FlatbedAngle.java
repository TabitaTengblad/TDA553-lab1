public class FlatbedAngle {

    private double angle;

    public FlatbedAngle(int i) {
    }

    public void setAngleOnFlatbed(double angle){
        if (angle > 0 && angle < 70){
            this.angle = angle - 70 *(Math.PI/180);
        }
    }

    public double getAngle(){
        return angle;
    }
    
}

//---------Minnesanteckningar---------------------

//Beata aproves