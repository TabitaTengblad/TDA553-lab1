import javax.swing.plaf.synth.ColorType;

public class CarTransporter extends Truck {
   
    public FlatBed flatbed;
    public int nrOfLoadedCars;
    
    public CarTransporter(){
        super(2, Color.red, 125, "CarTransporter", 5, 20,20);
        this.nrOfLoadedCars = nrOfLoadedCars;
        flatbed = new Flatbed();
    }

    public void raiseFlatBed(){ //Klar
        flatbed.raiseFlatbed;//ska se ut typ såhär

    public int getnrOfLoadedCars(){
        
        return nrOfLoadedCars ;
    }
          
}
}