
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import CarTransporter;

public class cartransportertest {
    
    @Test
    public void flatbedOnisOn(){  // Inte klar :(
        CarTransporter testCarTransporter = new CarTransporter();
        testCarTransporter.getFlatbedPosition(false);
        assertTrue(testCarTransporter.currentSpeed() == 0); //varför måste det vara en variabel på vänster sida??
    }

    @Test  //testa de var för sig
    public void GetFlatbedPositionGetsFlatbedPosition(){
    CarTransporter testCarTransporter = new CarTransporter();
    testCarTransporter.getFlatbedPosition();
    assertTrue(testCarTransporter.getFlatbedPosition() == true);
    }

    @Test
    public void getNrOfCarsgetsNrofCars(){
    CarTransporter testCarTransporter =  new CarTransporter();
    testCarTransporter.getNrOfCars();
    assertTrue(testCarTransporter.getNrOfCars() = )
    }

}

//------Minnesanteckningar--------------------------------------------------------------------
// testa om det går att köra när den är uppe, alltså kraven som implemeteras i CarTransporter