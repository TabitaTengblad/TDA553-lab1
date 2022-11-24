import javax.swing.plaf.synth.ColorType;
import java.awt.*;
//Just nu har jag bara kopierat alla attribut från Vehicle och lagt här. Under labbens gång får vi ta bort och lägga till de 
//attribut som behövs

public abstract class Truck {
    private int nrDoors; 
    private Color color;//Vet ej om den behövs i Truck
    private double enginePower;
    private String modelName;//Vet ej om den behövs i Truck
    private double direction;
    private double x;
    private double y;//Behöver någon slags position så vi kan avgöra om vi är långt ifrån eller nära CarWorkshop senare
    private double currentSpeed;

    public Truck(int nrDoors, Color color, double enginePower, String modelName, double direction, double x, double y) {
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower; 
        this.modelName = modelName;
        this.direction = direction;
        this.x = x;
        this.y = y;
        this.currentSpeed = 0;
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

   // public void incrementSpeed(double amount){
	//    currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
   // }

   // public void decrementSpeed(double amount){
   //     currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
  //  }

    //abstract double speedFactor(); //klar

    public void setColor(Color clr){ //klar
	    color = clr;
    }

    public void startEngine(){ //testat
	    currentSpeed = 0.1;
    }

    public void stopEngine(){ //testat
	    currentSpeed = 0;
    }
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void move(){
    x += x + (Math.cos(direction)*currentSpeed);
    y += y + (Math.sin(direction)*currentSpeed);
    }

    public void turnLeft(){
        direction = direction +  90 *(Math.PI/180);
    }

    public void turnRight(){
        direction = direction - 90 *(Math.PI/180);
    }

      // Kanske funkar
    //   public void gas(double amount){
    //     if (amount >= 0.0 || amount <= 1.0){
    //         incrementSpeed(amount);}  
    //     else{
    //          throw new IllegalArgumentException("Insert a value between 0 and 1");}
    // }

    // public void brake(double amount){
    //     if (amount >= 0.0 || amount <= 1.0){
    //         decrementSpeed(amount);}
    //     else{
    //         throw new IllegalArgumentException("Insert a value between 0 and 1");}
    //     }
    }