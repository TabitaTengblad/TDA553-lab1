import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class cartransportertest {
    
    @Test //Klart, men ska vi testa detta?
    public void testCarTransporterStatoionary (){  
        CarTransporter testCarTransporter = new CarTransporter();
        testCarTransporter.getCurrentSpeed();   
        assertTrue(testCarTransporter.carTransporterStationary() == false );
    }

    @Test
    public void GetFlatbedStateGetsFlatbedState(){   
        CarTransporter testCarTransporter = new CarTransporter();
        testCarTransporter.getFlatbedState();
        assertTrue(testCarTransporter.getFlatbedState() == false);
    }

    @Test  //Inte klar
    public void testLoading(){
        CarTransporter testCarTransporter = new CarTransporter();
        testCarTransporter.getNrOfCars();
        assertTrue(testCarTransporter.getNrOfCars() == 0 );
    }
}

//------Minnesanteckningar--------------------------------------------------------------------
