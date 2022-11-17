import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.Color;

import org.junit.Test;

public class saab95test {

    @Test
    public void incrementSpeedIncreasesSpeed() {
        Saab95 testSaab = new Saab95();
        testSaab.incrementSpeed(10);
        assertTrue(testSaab.getCurrentSpeed() == 12.5);
    }

    public void decrementSpeedDecreesesSpeed(){
        Saab95 testSaab = new Saab95();
        testSaab.decrementSpeed(0);
        assertTrue(testSaab.getCurrentSpeed() == -12.5);
    }

    public void speedFactorisSpeed(){
        Saab95 testSaab = new Saab95();
        testSaab.speedFactor();
        assertTrue(testSaab.getSpeedFactor() == 0)
    }

    public void getColorPaint(){
        Saab95 testSaab = new Saab95();
        testSaab.setColor();
        assertTrue(testSaab.getColor() == );
    }
}


