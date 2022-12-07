import java.awt.*;

public abstract class Vehicle implements IMovable{
    
    private int nrDoors; 
    private Color color;
    private double enginePower;
    private double direction;
    private double x;
    private double y;
    private double currentSpeed;
   
    public Vehicle(int nrDoors, Color color, double enginePower, String modelName, double direction, double x, double y) {
        this.nrDoors = nrDoors;
        this.color = color; //testat
        this.enginePower = enginePower; 
        this.direction = direction;
        this.x = x;
        this.y = y;
        this.currentSpeed = 0; //Finns ej i Vehicle på rad 15, ska det vara så?
    }


    public int getNrDoors(){ 
        return nrDoors;
    }
    public double getEnginePower(){ 
        return enginePower;
    }

    public double getCurrentSpeed(){
        
        return currentSpeed;
    }

    public Color getColor(){ 
        return color;
    }

    public double getDirection(){
        return direction;
    }

    private void incrementSpeed(double amount){
	    currentSpeed = Math.min(currentSpeed + speedFactor() * amount,enginePower);
    }

    private void decrementSpeed(double amount){
        currentSpeed = Math.max(currentSpeed - speedFactor() * amount,0);
    }

    public void setColor(Color clr){ 
	    color = clr;
    }

    public void startEngine(){ 
	    currentSpeed = 1;
    }

    public void stopEngine(){
	    currentSpeed = 0;
    }
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

   //public double getPosition(){
    //    return x; y;
  //  }
    public abstract double speedFactor();

    @Override
    public void move(){
    x = x + (Math.cos(direction)*currentSpeed);
    y = y + (Math.sin(direction)*currentSpeed);
    }

    @Override
    public void turnLeft(){
        direction = direction -  90 *(Math.PI/180);
    }

    @Override
    public void turnRight(){
        direction = direction + 90 *(Math.PI/180);
    }

      public void gas(double amount){
        if (amount >= 0.0 || amount <= 1.0)  incrementSpeed(amount); 
      }

    public void brake(double amount){
        if (amount >= 0.0 || amount <= 1.0) decrementSpeed(amount);   
    
    }
}






