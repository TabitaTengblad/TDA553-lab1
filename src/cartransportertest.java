
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class cartransportertest {
    
    @Test // Inte klar, den ena vill ha en double, den andra en boolean
    public void flatbedOnisOn(){  
        CarTransporter testCarTransporter = new CarTransporter();
        testCarTransporter.getFlatbedState();   
        assertTrue(testCarTransporter.getCurrentSpeed() == );
    }

    @Test   //Inte klar, en av dem vill ha en void och den andra vill ha en boolean?
    public void GetFlatbedPositionGetsFlatbedPosition(){   
        CarTransporter testCarTransporter = new CarTransporter();
        testCarTransporter.flatbedState(true);
        assertTrue(testCarTransporter.flatbedState() == true);
    }

    @Test  //Inte klar
    public void getNrOfCarsgetsNrOfCars(){
        CarTransporter testCarTransporter =  new CarTransporter();
        testCarTransporter.getNrOfCars();
        assertTrue(testCarTransporter.getNrOfCars() = )
    }
    
}

//------Minnesanteckningar--------------------------------------------------------------------
