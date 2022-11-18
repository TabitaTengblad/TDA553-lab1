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

    public void decrementSpeedDecreesesSpeed(){ //fel
        Saab95 testSaab = new Saab95();
        testSaab.decrementSpeed(0);
        assertTrue(testSaab.getCurrentSpeed() == -12.5);
    }

    public void speedFactorisSpeed(){ //klar
        Saab95 testSaab = new Saab95();
        testSaab.speedFactor();
        assertTrue(testSaab.speedFactor() == 1.625);
    }

    public void setColorPaint(){ //klar???
        Saab95 testSaab = new Saab95();
        testSaab.setColor();
        assertTrue(testSaab.getColor() == Color.red);
        //varför fungerar inte setColor? Vad ska man ha i sista parantesen sist?
    }

    public void testEnginePower(){ //hjälp
        Saab95 testSaab95 = new Saab95();
        testSaab.enginePower();
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
        Saab95 testSaab = new Saab95();
        testSaab.move();
        assertTrue(testSaab.move() == 0);

        // vilket värde ska man byta ut 0 till?

    }

    public void doesTurboTurnOff();{ //hjälp
        Saab95 testSaab = new Saab95();
        testSaab.setTurboOff();
        assertTrue(testSaab.turboOn(); = false)
    }

    public void doesTurboTurnOn();{ //hjälp
        Saab95 testSaab = new Saab95();
        testSaab.setTurboOn();
        assertTrue(testSaab.turboOn(); = true)
    }
    public void testNumberOfDoors(){ //klar?
        Saab95 testSaab = new Saab95();
        testSaab.getNrDoors();
        assertTrue(testSaab.getNrDoors() == 2);

    }

    public void 
}


