import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class scaniatest {


    @Test
    public void ensureStationaryWork(){ 
        Scania testScania = new Scania();
        testScania.ensureStationary();
        assertTrue(testScania.getAngleOnFlatbed() == 0 );
    }
    @Test
    public void AngleNotZeroNoMoveY(){
        Scania testScania = new Scania();
        testScania.move();
        assertTrue(testScania.getY() == 0);
    }

    @Test
    public void AngleNotZeroNoMoveX(){
        Scania testScania = new Scania();
        testScania.move();
        assertTrue(testScania.getX() == 0);

    }
}

//--------Minnesanteckningar--------------------------------------------------

//klart



