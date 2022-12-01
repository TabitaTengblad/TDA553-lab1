
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import CarTransporter;

public class cartransportertest {
    
    @Test
    public void flatbedOnisOn(){  // Inte klar, fattar inte varför den klagar... :(
        CarTransporter testCarTransporter = new CarTransporter();
        testCarTransporter.getOnOffFlatbed(false);
<<<<<<< HEAD
        assertTrue(testCarTransporter.getOnOffFlatbed(false) == false); //varför måste det vara en variabel på vänster sida??
=======
        assertTrue(testCarTransporter.getOnOffFlatbed() == false); //varför måste det vara en variabel på vänster sida??
>>>>>>> 7d8411fade3a0d62b036a169ba036dedd1debd72

    }

}

//------Minnesanteckningar--------------------------------------------------------------------
// testa om det går att köra när den är uppe, alltså kraven som implemeteras i CarTransporter