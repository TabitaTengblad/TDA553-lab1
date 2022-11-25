import java.awt.Color;

import javax.swing.plaf.synth.ColorType;

public class CarTransporter extends Truck {
   private FlatbedOnOff flatbedOnOff;
private FlatbedOnOff onOffFlatbed;

 

   public CarTransporter(){
       super(2, Color.BLACK, 125, "Car transporter", 5, 20,20 );
       this.onOffFlatbed = new FlatbedOnOff();
       this.onOffFlatbed();
   }

   private void onOffFlatbed() {
       flatbedOnOff.onOffFlatbed();
   }

}