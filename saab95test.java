import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.Color;

import org.junit.Test;
import org.omg.CORBA.FloatSeqHelper;

public class saab95test {

    @Test
    public void incrementSpeedIncreasesSpeed() { //klar
        Saab95 testSaab = new Saab95();
        testSaab.incrementSpeed(10);
        assertTrue(testSaab.getCurrentSpeed() == 12.5);
    }

    public void decrementSpeedDecreesesSpeed(){ //klar
        Saab95 testSaab = new Saab95();
        testSaab.incrementSpeed(10);

        testSaab.decrementSpeed(5);
        assertTrue(testSaab.getCurrentSpeed() == 4.375 );
    }

    public void speedFactorisSpeed(){ //klar
        Saab95 testSaab = new Saab95();
        testSaab.speedFactor();
        assertTrue(testSaab.speedFactor() == 1.625);
    }

    public void setColorPaint(){ //klar
        Saab95 testSaab = new Saab95();
        testSaab.setColor(Color.CYAN);
        assertTrue(testSaab.getColor() == Color.CYAN);
        //har den bytt färg
    }

    public void testEnginePower(){ //klar
        Saab95 testSaab = new Saab95();
        testSaab.getEnginePower();
        assertTrue(testSaab.getEnginePower() == 125);
    }

    public void startEngineStart(){ //klar
        Saab95 testSaab = new Saab95();
        testSaab.startEngine();
        assertTrue(testSaab.getCurrentSpeed() == 0.1);
    }

    public void stopEngineStop(){ //klar
        Saab95 testSaab = new Saab95();
        testSaab.stopEngine();
        assertTrue(testSaab.getCurrentSpeed() == 0);
    }

    public void doesMoveCarMoveCar(){ //fel
        //*Saab95 testSaab = new Saab95();
        //testSaab.move();
        //assertTrue(testSaab.move() == 0);

        // kolla om x värdet efter funktionen är mindre/större än innan fär att se om den har röt sig
    }

    public void doesTurboTurnOff(){ //klar
        Saab95 testSaab = new Saab95();
        testSaab.setTurboOff();
        assertTrue(testSaab.isTurboOn() == false);
    }

    public void doesTurboTurnOn(){ //klar
        Saab95 testSaab = new Saab95();
        testSaab.setTurboOn();
        assertTrue(testSaab.isTurboOn() == true);
    }
    public void testNumberOfDoors(){ //klar
        Saab95 testSaab = new Saab95();
        testSaab.getNrDoors();
        assertTrue(testSaab.getNrDoors() == 2);

    }

    public void testGetCurrentSpeed(){

    }
}


