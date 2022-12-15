package model.testfiles;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import model.CarTransporter;
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
        testCarTransporter.changeFlatbedState();
        assertTrue(testCarTransporter.changeFlatbedState() == false );
    }
}