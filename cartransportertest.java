import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class cartransportertest {
    
    @Test
    public void flatbedOnisOn(){  // Inte klar, fattar inte varför den klagar... :(
        CarTransporter testCarTransporter = new CarTransporter();
        testCarTransporter.getOnOffFlatbed(false);
        assertTrue(testCarTransporter.getOnOffFlatbed() = false);

    }

}

//------Minnesanteckningar--------------------------------------------------------------------
// testa om det går att köra när den är uppe, alltså kraven som implemeteras i CarTransporter