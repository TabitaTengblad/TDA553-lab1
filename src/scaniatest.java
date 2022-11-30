import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.awt.Color;

public class scaniatest {

    @Test
    public void angleOnFlatbedWork (){ //inte klar än
        Scania testScania = new Scania();
        testScania.angleOnFlatbed(70);
        assertTrue(testScania.angleOnFlatbed() = );
    }
    @Test
    public void scaniaMoveWork(){ //Klar
        Scania testScania = new Scania();
        testScania.ScaniaMoving(angle: 65);
        assertTrue(testScania.ScaniaMoving() = 0 );
    }
    @Test
    public void scaniaspeedzeroiszero(){ //Klar
        Scania testScania = new Scania();
        testScania.ScaniaSpeedzero(currentspeed > 0);
        assertTrue(testScania.ScaniaSpeedzero() = 0 );
    }

}

//--------Minnesanteckningar--------------------------------------------------

//Fixa testerna


