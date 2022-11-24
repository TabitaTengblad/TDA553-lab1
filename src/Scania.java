import javax.swing.plaf.synth.ColorType;
public class Scania extends Truck {

    public FlatBed flatbed; //eventuellt ska denna ligga som ett attribut hos truck
    

    public Scania(){
        super(2, Color.red, 125, "Scania", 5, 20,20);
        flatbed = new Flatbed();
    }

    public void raiseFlatBed(){ //Klar
        flatbed.raiseFlatbed;//ska se ut typ såhär
          
    }
}
