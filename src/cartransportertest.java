import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import javax.swing.text.Position;

import org.junit.Test;

public class cartransportertest {
    
    @Test 
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

    @Test  
    public void testLoading(){
        CarTransporter testCarTransporter = new CarTransporter();
        testCarTransporter.getNrOfCars();
        assertTrue(testCarTransporter.getNrOfCars() == 0 );
    }

    @Test 
    public void setFaltbedStateTest(){// döp om till mer logiskt namn, döpte bara så länge
        CarTransporter testCarTransporter = new CarTransporter();
        testCarTransporter.getCurrentSpeed();
        testCarTransporter.changeFlatbedState();
        assertTrue(testCarTransporter.changeFlatbedState() == false );
    }
}

//------Minnesanteckningar--------------------------------------------------------------------
