
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.awt.Color;
import org.junit.Test;

public class saab95test {

    @Test
    public void setColorPaint(){ //klar
        Saab95 testSaab = new Saab95();
        testSaab.setColor(Color.CYAN);
        assertTrue(testSaab.getColor() == Color.CYAN);
        //har den bytt färg ska man tänka
    }
    @Test
    public void testEnginePower(){ //klar
        Saab95 testSaab = new Saab95();
        testSaab.getEnginePower();
        assertTrue(testSaab.getEnginePower() == 125);
    }
    @Test
    public void startEngineStart(){ //klar
        Saab95 testSaab = new Saab95();
        testSaab.startEngine();
        assertTrue(testSaab.getCurrentSpeed() == 0.1);
    }
    @Test
    public void stopEngineStop(){ //klar
        Saab95 testSaab = new Saab95();
        testSaab.stopEngine();
        assertTrue(testSaab.getCurrentSpeed() == 0);
    }
    @Test //TODO kolla om ändring sker i y-värdet
    public void doesMoveCarMoveCar(){ //klar
        Saab95 testSaab = new Saab95();
        double startXposition = testSaab.getX();
        testSaab.startEngine();
        testSaab.move();
        assertTrue(testSaab.getX() > startXposition);
    
    }
    @Test
    public void doesTurboTurnOff(){ 
        Saab95 testSaab = new Saab95();
        testSaab.setTurboOff();
        assertTrue(testSaab.isTurboOn() == false);
    }
    @Test
    public void doesTurboTurnOn(){ 
        Saab95 testSaab = new Saab95();
        testSaab.setTurboOn();
        assertTrue(testSaab.isTurboOn() == true);
    }
    @Test
    public void testNumberOfDoors(){ 
        Saab95 testSaab = new Saab95();
        testSaab.getNrDoors();
        assertTrue(testSaab.getNrDoors() == 2);
    }
    @Test
    public void testGetCurrentSpeed(){

    }

    @Test 
    public void testingGas(){
        Vehicle testVehicle = new Saab95();
        testVehicle.gas(1);
        assertEquals(1.25, testVehicle.getCurrentSpeed(), 0.01);
    }

    @Test
    public void testingBreak(){
        Vehicle testVehicle = new Saab95();
        testVehicle.brake(1);
        assertEquals(0, testVehicle.getCurrentSpeed(), 0.01);
        }
        
    @Test
    public void testingTurnLeft(){
        Vehicle testVehicle = new Saab95();
        testVehicle.turnLeft();
        assertEquals(3.429, testVehicle.getDirection(), 0.01);
    }

    @Test
    public void testingTurnRight(){
        Vehicle testVehicle = new Saab95();
        testVehicle.turnRight();
        assertEquals(6.570, testVehicle.getDirection(), 0.01);
    }
    }



