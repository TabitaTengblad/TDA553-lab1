
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import CarTransporter;

public class cartransportertest {
    
    @Test
    public void flatbedOnisOn(){  // Inte klar, fattar inte varför den klagar... :(
        CarTransporter testCarTransporter = new CarTransporter();
        testCarTransporter.getFlatbedPosition(false);
        assertTrue(testCarTransporter.currentSpeed() == 0); //varför måste det vara en variabel på vänster sida??

    }

}

//------Minnesanteckningar--------------------------------------------------------------------
// testa om det går att köra när den är uppe, alltså kraven som implemeteras i CarTransporter