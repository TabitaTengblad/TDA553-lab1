
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.awt.Color;
import org.junit.Test;
import Saab95;
import Vehicle;

public class saab95test {

    @Test //TODO när gas och brake funkar kan vi ta bort denna
    public void incrementSpeedIncreasesSpeed() { //klar
        Saab95 testSaab = new Saab95();
        testSaab.incrementSpeed(10);
        assertTrue(testSaab.getCurrentSpeed() == 12.5);
    }
    @Test
    public void decrementSpeedDecreesesSpeed(){ //inte klar
        Saab95 testSaab = new Saab95();
        testSaab.decrementSpeed(5);
        assertTrue(testSaab.getCurrentSpeed() == 0 );
    }
 
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
        // kolla om x värdet efter funktionen är mindre/större än innan fär att se om den har röt sig
    }
    @Test
    public void doesTurboTurnOff(){ //klar
        Saab95 testSaab = new Saab95();
        testSaab.setTurboOff();
        assertTrue(testSaab.isTurboOn() == false);
    }
    @Test
    public void doesTurboTurnOn(){ //klar
        Saab95 testSaab = new Saab95();
        testSaab.setTurboOn();
        assertTrue(testSaab.isTurboOn() == true);
    }
    @Test
    public void testNumberOfDoors(){ //klar
        Saab95 testSaab = new Saab95();
        testSaab.getNrDoors();
        assertTrue(testSaab.getNrDoors() == 2);
    }
    @Test
    public void testGetCurrentSpeed(){

    }

     @Test //TODO måste ha assert för att funka, testar inget nu
     public void isGas(){
         Vehicle testSaab = new Saab95();
            testSaab.gas(2);

    
    }
    @Test
    public void isBrake(){
        Vehicle testSaab= new Saab95();
            testSaab.brake(2);

    }
}
    
//exception invalid value
//delegation och composition

