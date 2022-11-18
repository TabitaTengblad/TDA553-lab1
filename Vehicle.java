import java.awt.*;

import javax.swing.plaf.synth.ColorType;

public abstract class Vehicle {
    
    private int nrDoors; 
    private Color color;
    private double enginePower;
    private String modelName;
    private double direction;
    private double x;
    private double y;
    private double currentSpeed;

    public Vehicle(int nrDoors, Color color, double enginePower, String modelName, double direction, double x, double y) {
        this.nrDoors = nrDoors;
        this.color = color; //testat
        this.enginePower = enginePower; 
        this.modelName = modelName;
        this.direction = direction;
        this.x = x;
        this.y = y;
    }

    public void getCurrentSpeed(Double speed){
        currentSpeed = speed;
    }

    public int getNrDoors(){ //ja
        return nrDoors;
    }
    public double getEnginePower(){ //ja
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){ //ja
        return color;
    }

    public void incrementSpeed(double amount){
	    currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }

    public void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }

    abstract double speedFactor(); //klar

    public void setColor(Color clr){ //klar
	    color = clr;
    }

    public void startEngine(){ //testat
	    currentSpeed = 0.1;
    }

    public void stopEngine(){ //testat
	    currentSpeed = 0;
    }

    public void move(){
    x += x + (Math.cos(direction)*currentSpeed);
    y += y + (Math.sin(direction)*currentSpeed);
    }

    public void turnLeft(){
        direction = direction -  90 *(Math.PI/180);
    }

    public void turnRight(){
        direction = direction - 90 *(Math.PI/180);
    }
}



